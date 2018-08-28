package Datos;

import clases.Usua;

import javax.persistence.*;
import java.util.List;

public class UserDatos {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("pUnit");
    EntityManager em = emf.createEntityManager();

    public void crearUsua(Usua usuario){
        em.getTransaction().begin();
        em.persist(usuario);
        em.getTransaction().commit();

    }

    public Long countUsers(){
        Long count = ((Number)em.createNativeQuery("select count(Usua.id) from USUA").getSingleResult()).longValue();
        return count;
    }

    public void editarUser(Usua editar, String username, String password, boolean autor, boolean administrator){
        em.getTransaction().begin();
        Usua u = em.find(Usua.class,editar.getId());
        u.setUsername(username);
        u.setPassword(password);
        u.setAutor(autor);
        u.setAdministrator(administrator);
        em.merge(u);
        em.getTransaction().commit();

    }

    public String dropUser(Long id){
        Usua u = em.find(Usua.class,id);
        if(u.getUsername().equalsIgnoreCase("admin") && u.isAdministrator()){
            return "no";
        }else{
            em.getTransaction().begin();
            em.remove(u);
            em.getTransaction().commit();
            return "Usua Borrado";
        }



    }

    public void borrarUser(Long id){
        em.getTransaction().begin();
        Usua u = em.find(Usua.class,id);
        u.setActivo(false);
        em.getTransaction().commit();

    }


    public Usua login(String nombre, String pass){

        try{
            Query query = em.createQuery("select u from Usua u where u.username = :user AND u.password = :pass")
                    .setParameter("user", nombre)
                    .setParameter("pass", pass);
            return (Usua)query.getSingleResult();
        } catch(NoResultException e){
            return null;
        }

    }

    public Usua getUserId(Long id){

        try{
            Query query = em.createQuery("select u from Usua u where u.id = :id")
                    .setParameter("id", id);
            return (Usua)query.getSingleResult();
        } catch(NoResultException e){
            return null;
        }

    }

    public List<Usua> getUserList(){

        List<Usua> l = em.createQuery("select u from Usua u")
                .getResultList();
        return l;


    }

    public Usua getUserUsername(String nombre){

        try{
            Query query = em.createQuery("select u from Usua u where u.username = :user")
                    .setParameter("user", nombre);
            return (Usua)query.getSingleResult();
        } catch(NoResultException e){
            return null;
        }

    }

}
