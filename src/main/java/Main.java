import Datos.*;
import clases.*;
import freemarker.template.Configuration;
import freemarker.template.Template;
import org.jasypt.util.text.BasicTextEncryptor;
import spark.Session;

import java.io.StringWriter;
import java.util.*;

import static spark.Spark.get;
import static spark.Spark.post;
import static spark.Spark.staticFiles;

public class Main {


    public static void main(String[] args) {
        staticFiles.externalLocation("src/main/resources/Templates");
        Configuration configuration = new Configuration(Configuration.VERSION_2_3_28);
        configuration.setClassForTemplateLoading(Main.class, "/");

        UserDatos usuarioDatos = new UserDatos();
        ArtDatos articuloDatos = new ArtDatos();
        EtiqDatos etiquetaDatos = new EtiqDatos();
        ComDatos comentarioDatos = new ComDatos();
        ReacDatos reaccionDatos = new ReacDatos();


        if(usuarioDatos.countUsers()==0){
            Usua u = new Usua("admin","admin", "password",true,true);
            usuarioDatos.crearUsua(u);
        }

        get("/", (req, res) -> {

            Usua usuario = req.session(true).attribute("usuario");
            if(usuario == null && req.cookie("username") != null){
                BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
                textEncryptor.setPasswordCharArray("1234".toCharArray());
                req.session(true);
                req.session().attribute("usuario", usuarioDatos.getUserUsername(textEncryptor.decrypt(req.cookie("username"))));
            }

            res.redirect("/home?p=1");
            return "";
        });
        get("/signupPage", (req, res) -> {

            StringWriter writer = new StringWriter();
            Map<String, Object> atr = new HashMap<>();
            Template t = configuration.getTemplate("Templates/SignUp.ftl");
            t.process(null, writer);
            return writer;
        });

        get("/log-in", (req, res) -> {

            StringWriter writer = new StringWriter();
            Map<String, Object> atr = new HashMap<>();
            Template t = configuration.getTemplate("Templates/Login.ftl");
            t.process(null, writer);
            return writer;
        });

        get("/logout", (req, res) -> {
            StringWriter writer = new StringWriter();
            Map<String, Object> atr = new HashMap<>();

            Session ses = req.session(true);
            ses.invalidate();
            res.removeCookie("username");
            res.redirect("/");
            return writer;
        });

        get("/home", (req, res) -> {

            Usua usuario = req.session(true).attribute("usuario");
            StringWriter writer = new StringWriter();
            Map<String, Object> atr = new HashMap<>();
            Template template = configuration.getTemplate("templates/home.ftl");
            int pagina = 1;
            if(req.queryParams("p")!=null)
                pagina= Integer.parseInt(req.queryParams("p"));

            int maximo = (int) Math.ceil(articuloDatos.countArts() / 5);
            List<Art> artList = articuloDatos.listarArts(pagina);

            for(int i = 0; i < artList.size(); i++){
                artList.get(i).setListaEtiq(etiquetaDatos.getEtiqs(artList.get(i).getId()));
                artList.get(i).setLikes(articuloDatos.countLikes(artList.get(i).getId()));
                artList.get(i).setDislikes(articuloDatos.countDislikes(artList.get(i).getId()));
            }

            atr.put("p", pagina);



            if(pagina <= 1){
                atr.put("prevN", 0);
            }else{
                atr.put("prevN", 1);
            }

            if(pagina >= maximo){
                atr.put("nextN", 0);
            }else{
                atr.put("nextN", 1);
            }
            atr.put("prev", (pagina - 1));
            atr.put("next", (pagina + 1));
            atr.put("usuario",usuario);
            atr.put("articulos",artList);
            template.process(atr,writer);
            return writer;
        });

        get("/crearPost", (req, res) -> {

            StringWriter writer = new StringWriter();
            Map<String, Object> atr = new HashMap<>();
            Template t = configuration.getTemplate("Templates/crearPost.ftl");
            t.process(atr,writer);
            return writer;
        });


        get("/editarPost/:id", (req, res) -> {

            Usua usuario = req.session(true).attribute("usuario");
            StringWriter writer = new StringWriter();
            Map<String, Object> atr = new HashMap<>();
            Template t = configuration.getTemplate("Templates/editarPost.ftl");
            String id = req.params("id");
            Art a = articuloDatos.getArtId(Long.parseLong(id));
            a.setListaEtiq(etiquetaDatos.getEtiqs(a.getId()));
            a.setListaComs(comentarioDatos.getCom(a.getId()));
            StringBuilder listEtiq = new StringBuilder();
            for(int i = 0; i <a.getListaEtiq().size(); i++){
                listEtiq.append(a.getListaEtiq().get(i).getEtiq()).append(",");

            }
            atr.put("articulo",a);
            atr.put("etiquetas", listEtiq.toString());
            atr.put("usuario",usuario);
            t.process(atr,writer);
            return writer;
        });

        post("/editar/:id", (req, res) -> {
            long id = Long.parseLong(req.params("id"));
            String titulo = req.queryParams("titulo");
            String cuerpo = req.queryParams("cuerpo");
            String etiquetas = req.queryParams("listaEtiquetas");
            List<String> listaEtiq = Arrays.asList(etiquetas.split(","));
            ArrayList<Etiq> etiquetaArrayList = new ArrayList<>();
            Art art = articuloDatos.getArtId(id);

            for(int j = 0; j<listaEtiq.size(); j++){
                Etiq e = new Etiq(listaEtiq.get(j));
                etiquetaArrayList.add(e);
            }
            art.setListaEtiq(etiquetaArrayList);
            art.setListaComs(null);
            art.setLikes(0);
            art.setDislikes(0);
            articuloDatos.editarArt(art,titulo,cuerpo,etiquetaArrayList);

            res.redirect("/");

            return null;
        });

        get("/articulo/:id", (req, res) -> {

            Usua usuario = req.session(true).attribute("usuario");
            StringWriter writer = new StringWriter();
            Map<String, Object> atr = new HashMap<>();
            Template t = configuration.getTemplate("Templates/articulo.ftl");
            String id = req.params("id");
            Art a = articuloDatos.getArtId(Long.parseLong(id));
            a.setListaEtiq(etiquetaDatos.getEtiqs(a.getId()));
            a.setListaComs(comentarioDatos.getCom(a.getId()));
            ArrayList<String> usuarios = new ArrayList<>();
            int likes = articuloDatos.countLikes(a.getId());
            int dislikes = articuloDatos.countDislikes(a.getId());

            atr.put("articulo",a);
            atr.put("autor",usuarioDatos.getUserId(a.getAutor().getId()));
            atr.put("usuarioList",usuarios);
            atr.put("numeroLikes",likes);
            atr.put("numeroDislikes",dislikes);
            atr.put("usuario",usuario);
            t.process(atr,writer);
            return writer;
        });

        post("/crearPost", (req, res) -> {

            Usua usuario = req.session(true).attribute("usuario");
            String titulo = req.queryParams("titulo");
            String cuerpo = req.queryParams("cuerpo");
            String etiquetas = req.queryParams("listaEtiqueta");
            List<String> listaEtiquetas = Arrays.asList(etiquetas.split(","));

            ArrayList<Etiq> et =  new ArrayList<>();
            for(int i = 0; i < listaEtiquetas.size(); i++){
                Etiq e = new Etiq(listaEtiquetas.get(i));
                et.add(e);
                etiquetaDatos.guardarEtiq(e);
            }

            java.sql.Date d = new java.sql.Date(System.currentTimeMillis());

            Art a =  new Art(titulo,cuerpo,usuario,d,null,et);
            a.setLikes(0);
            a.setDislikes(0);
            articuloDatos.guardarArt(a);


            res.redirect("/");
            return "";
        });

        get("/tagFilter/:tag", (req, res) -> {

            Usua usuario = req.session(true).attribute("usuario");
            StringWriter writer = new StringWriter();
            Map<String, Object> atr = new HashMap<>();
            Template template = configuration.getTemplate("templates/filtrados.ftl");
            int pagina = Integer.parseInt(req.queryParams("p"));
            int maximo = (int) Math.ceil(articuloDatos.countArts() / 5);
            List<Art> artList = articuloDatos.listarArts(1);

            for(int i = 0; i < artList.size(); i++){
                artList.get(i).setListaEtiq(etiquetaDatos.getEtiqs(artList.get(i).getId()));
            }


            for(int i = 0; i < artList.size(); i++){
                artList.get(i).setListaEtiq(etiquetaDatos.getEtiqs(artList.get(i).getId()));
                artList.get(i).setLikes(articuloDatos.countLikes(artList.get(i).getId()));
                artList.get(i).setDislikes(articuloDatos.countDislikes(artList.get(i).getId()));
            }
            ArrayList<Art> tagged = new ArrayList<>();

            for(int j = 0; j < artList.size(); j++){
                for(int k = 0; k < artList.get(j).getListaEtiq().size(); k++){
                    if(artList.get(j).getListaEtiq().get(k).getEtiq().equals(req.params("tag"))){
                        artList.get(j).setLikes(articuloDatos.countLikes(artList.get(j).getId()));
                        artList.get(j).setDislikes(articuloDatos.countDislikes(artList.get(j).getId()));
                        tagged.add(artList.get(j));

                    }
                }
            }


            atr.put("p", pagina);



            if(pagina <= 1){
                atr.put("prevN", 0);
            }else{
                atr.put("prevN", 1);
            }

            if(pagina >= maximo){
                atr.put("nextN", 0);
            }else{
                atr.put("nextN", 1);
            }
            atr.put("prev", (pagina - 1));
            atr.put("next", (pagina + 1));
            atr.put("usuario",usuario);
            atr.put("articulos",tagged);
            atr.put("tagFil",req.params("tag"));
            template.process(atr,writer);
            return writer;
        });

        get("articulo/:id/like", (req, res) -> {
            Usua usuario = req.session(true).attribute("usuario");
            Long idArticulo = Long.parseLong(req.params("id"));
            Art articulo = articuloDatos.getArtId(idArticulo);
            Reacc re = reaccionDatos.checkLike(usuario,articulo);
            if(re == null){
                reaccionDatos.guardarLike(new Reacc(articulo,usuario,true));
                res.redirect("/articulo/" + idArticulo);
            }else{
                reaccionDatos.deleteLike(re);

                if(!re.isReacc())
                    reaccionDatos.updateLike(re,true);

                res.redirect("/articulo/" + idArticulo);
            }




            return null;
        });

        get("articulo/:id/dislike", (req, res) -> {
            Usua usuario = req.session(true).attribute("usuario");
            Long idArticulo = Long.parseLong(req.params("id"));
            Art articulo = articuloDatos.getArtId(idArticulo);
            Reacc re = reaccionDatos.checkLike(usuario,articulo);
            if(re == null){
                reaccionDatos.guardarLike(new Reacc(articulo,usuario,false));
                res.redirect("/articulo/" + idArticulo);
            }else{
                reaccionDatos.deleteLike(re);

                if(re.isReacc())
                    reaccionDatos.updateLike(re,false);

                res.redirect("/articulo/" + idArticulo);
            }

            return null;
        });

        post("/login", (req, res) -> {

            String username = req.queryParams("username");
            String password = req.queryParams("password");
            Usua usuario = usuarioDatos.login(username, password);
            String recuerdame = req.queryParams("recuerdame");
            if (usuario != null) {
                req.session(true);
                req.session().attribute("usuario", usuario);
                if(recuerdame!=null){
                    BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
                    textEncryptor.setPasswordCharArray("1234".toCharArray());
                    res.cookie("/", "username",
                            textEncryptor.encrypt(username), (60*60*24*7), false, true);
                }
                res.redirect("/");
            } else {
                res.redirect("/log-in");
            }
            return "";
        });

        post("/singup", (req, res) -> {

            String username = req.queryParams("username");
            String password = req.queryParams("password");
            String nombre = req.queryParams("name");
            String a = req.queryParams("autor");
            Usua u = new Usua(username,nombre,password,false,true);
            if(a!=null)
                u.setAutor(true);
            else
                u.setAutor(false);

            usuarioDatos.crearUsua(u);
            req.session(true);
            req.session().attribute("usuario", u);
            res.redirect("/home?p=1");
            return "";



        });


        post("articulo/:id/comentar", (req, res) -> {
            Usua usuario = req.session(true).attribute("usuario");
            Long idArticulo = Long.parseLong(req.params("id"));
            String comentario = req.queryParams("comentario");
            Com c = new Com(comentario,usuario,articuloDatos.getArtId(idArticulo));
            comentarioDatos.guardarCom(c);
            res.redirect("/articulo/" + idArticulo);
            return null;
        });

        get("/eliminar/:id", (req, res) -> {
            Usua autor = req.session(true).attribute("usuario");

            if (autor.isAdministrator() || autor.isAutor()) {

                Art articulo = articuloDatos.getArtId(Long.parseLong(req.params("id")));
                articuloDatos.borrarArt(articulo.getId());
            }
            res.redirect("/");
            return null;
        });





        post("/eliminar/:id", (req, res) -> {
            Usua autor = req.session(true).attribute("usuario");

            if (autor.isAdministrator() || autor.isAutor()) {
                articuloDatos.borrarArt(Long.valueOf(req.params("id")));
            }
            res.redirect("/");
            return null;
        });



    }

}