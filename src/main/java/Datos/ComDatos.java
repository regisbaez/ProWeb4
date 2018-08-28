package Datos;

import clases.Com;

import javax.persistence.*;
import java.util.List;
@PersistenceContext(type = PersistenceContextType.EXTENDED)
public class ComDatos {

    public EntityManagerFactory emf = Persistence.createEntityManagerFactory("pUnit");
    EntityManager em = emf.createEntityManager();

    public void guardarCom(Com Com) {

        em.getTransaction().begin();
        em.persist(Com);
        em.getTransaction().commit();

    }

    public Long countComs() {
        Long count = ((Number) em.createNativeQuery("select count(Com.id) from USUARIO").getSingleResult()).longValue();
        return count;
    }

    public void editarCom(Com editar) {
        em.getTransaction().begin();
        Com u = em.find(Com.class, editar.getId());
        u = editar;
        em.getTransaction().commit();

    }

    public void borrarCom(Long id) {
        em.getTransaction().begin();
        Com u = em.find(Com.class, id);
        em.remove(u);
        em.getTransaction().commit();

    }

    public List<Com> getCom(Long idArticulo){
        Query query = em.createQuery("select c from Com c where Art.id = ?1")
                .setParameter(1,idArticulo);
        return (List<Com>)query.getResultList();
    }


}
