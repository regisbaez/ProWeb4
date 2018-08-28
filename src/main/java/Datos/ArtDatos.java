package Datos;

import clases.Art;
import clases.Etiq;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class ArtDatos {

    public EntityManagerFactory emf = Persistence.createEntityManagerFactory("pUnit");
    EntityManager em = emf.createEntityManager();

    public void guardarArt(Art Art) {
        em.getTransaction().begin();
        em.persist(Art);
        em.getTransaction().commit();

    }

    public float countArts() {
        float count = ((Number) em.createNativeQuery("select count(Art.id) from Art").getSingleResult()).floatValue();
        return count;
    }

    public void editarArt(Art a, String titulo, String cuerpo, ArrayList<Etiq> Etiqs) {
        EtiqDatos orm =  new EtiqDatos();
        em.getTransaction().begin();
        a.setTitulo(titulo);
        a.setCuerpo(cuerpo);
        a.setListaEtiq(Etiqs);
        for(int i = 0; i < Etiqs.size(); i++){
            orm.guardarEtiq(Etiqs.get(i));
        }
        em.merge(a);
        em.getTransaction().commit();

    }

    public void borrarArt(Long id) {
        em.getTransaction().begin();
        Art u = em.find(Art.class, id);
        u.setActivo(true);
        em.merge(u);
        em.getTransaction().commit();


    }

    public List<Art> listarArts(int pagina){

        Query query = em.createQuery("select a from Art a where a.activo = false order by a.id desc")
                .setFirstResult(5*(pagina-1))
                .setMaxResults(5);

        return (List<Art>)query.getResultList();
    }

    public Art getArtId(Long id){
        Query query = em.createQuery("select a from Art a where a.id = :id")
                .setParameter("id", id);
        return (Art) query.getSingleResult();
    }



    public int countLikes(Long idArt){
        int count = ((Number) em.createNativeQuery("select count(a.id) from Reacc a WHERE a.Art_ID = ?1 AND a.reacc = true")
                .setParameter(1, idArt)
                .getSingleResult()).intValue();

        return count;
    }

    public int countDislikes(Long idArt){
        int count = ((Number) em.createNativeQuery("select count(a.id) from Reacc a WHERE a.Art_ID = ?1 AND a.reacc = false")
                .setParameter(1, idArt)
                .getSingleResult()).intValue();

        return count;
    }
    
}
