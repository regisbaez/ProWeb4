package Datos;

import clases.Art;
import clases.Reacc;
import clases.Usua;

import javax.persistence.*;

public class ReacDatos {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("pUnit");
    EntityManager em = emf.createEntityManager();

    public void guardarLike(Reacc r){
        em.getTransaction().begin();
        em.persist(r);
        em.getTransaction().commit();

    }

    public Reacc checkLike(Usua Usua, Art Art){
        try{
            Query query = em.createQuery("select r from Reac r  where r.articulo = ?1 AND r.usuario = ?2")
                    .setParameter(1, Art)
                    .setParameter(2, Usua);
            return (Reacc) query.getSingleResult();
        } catch(NoResultException e){
            return null;
        }
    }

    public void deleteLike(Reacc r){
        em.getTransaction().begin();
        em.remove(r);
        em.getTransaction().commit();
    }

    public void updateLike(Reacc r, boolean valor){
        em.getTransaction().begin();
        r.setReacc(valor);
        em.merge(r);
        em.getTransaction().commit();
    }


}
