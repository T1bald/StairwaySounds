package facades;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.Collection;

/**
 * Created by user on 01.12.2014.
 */
public abstract class AbstractFacade<T> {
    @PersistenceContext
    private EntityManager em;

    protected EntityManager getEntityManager(){
        return em;
    }

    public T getBy (String queryString){
        Query query = em.createQuery(queryString);
        return (T)query.getSingleResult();
    }

    public Collection<T> getAll (String queryString){
        Query query = em.createQuery(queryString);
        return (Collection<T>)query.getResultList();
    }
    public boolean insert (T value){
        try {
            em.getTransaction().begin();
            em.persist(value);
            em.getTransaction().commit();
        }
        catch(Exception ex) {
            System.err.println(ex.getMessage());
            ex.printStackTrace();
            em.getTransaction().rollback();
            return false;
        }

        return true;
    }
    public boolean delete (T value){
        try{
            em.getTransaction().begin();
            em.remove(value);
            em.getTransaction().commit();
        }
        catch(Exception ex){
            System.err.println(ex.getMessage());
            ex.printStackTrace();
            em.getTransaction().rollback();
            return false;
        }
        return true;

    }
}
