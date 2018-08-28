package Datos;

import clases.Etiq;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import java.util.List;

public class EtiqDatos {


    public EntityManagerFactory emf = Persistence.createEntityManagerFactory("pUnit");
    EntityManager em = emf.createEntityManager();

    public void guardarEtiq(Etiq Etiq) {
        System.out.println("MA");
        em.getTransaction().begin();
        em.persist(Etiq);
        em.getTransaction().commit();

    }

    public Long countEtiqs() {
        Long count = ((Number) em.createNativeQuery("select count(Etiq.id) from USUARIO").getSingleResult()).longValue();
        return count;
    }

    public void editarEtiq(Etiq editar, String Etiq) {
        em.getTransaction().begin();
        editar.setEtiq(Etiq);
        em.merge(editar);
        em.getTransaction().commit();

    }

    public void borrarEtiq(Long id) {
        em.getTransaction().begin();
        Etiq u = em.find(Etiq.class, id);
        em.remove(u);
        em.getTransaction().commit();

    }



    public List<Etiq> getEtiqs(Long idArt){
        List<Etiq> Etiqs = em.createQuery(
                "select e.listaEtiq from Art e where e.id = :art")
                .setParameter("art",idArt)
                .getResultList();

        return Etiqs;
    }


    public List<Etiq> checkEtiq() {
        try {
            List<Etiq> query = em.createQuery("select e from Etiq e")
                    .getResultList();
            return query;
        } catch (NoResultException e) {
            return null;
        }
    }
    
}
