package com.orm.permits.dao;

import com.orm.permits.utils.EntityManagerUtilities;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public abstract class AbstractDao<T> implements DAO<T> {

    private EntityManager entityManager = EntityManagerUtilities.getEntityManager();
    //Sin inicializar dado que no sabemos en la clase abstracta que valor va a tomar
    //Para ello se crea un metodo set al final de la clase.
    private Class<T> clazz;

    @Override
    /**
     * By ID Search Function
     */
    public Optional<T> get(long id) {
        return Optional.ofNullable(entityManager.find(clazz,id));
    }

    @Override
    public List<T> getAll() {
        String allQuery = "FROM "+clazz.getName();
        Query qry = entityManager.createQuery(allQuery);
        return qry.getResultList();
    }

    @Override
    public void saveRecord(T t) {
        executeInsideTransaction(entityManager->entityManager.persist(t));
    }

    @Override
    public void updateRecord(T t) {
        executeInsideTransaction(entityManager->entityManager.merge(t));
    }

    @Override
    public void deleteRecord(T t) {
        executeInsideTransaction(entityManager->entityManager.remove(t));
    }

    public void setClazz(Class<T> clzz){
        this.clazz = clzz;
    }

    /**
     * Requestion Transactions and Execute it
     */

    private void executeInsideTransaction(Consumer<EntityManager> action){
        EntityTransaction tx = entityManager.getTransaction();
        try {
            tx.begin();
            action.accept(entityManager);
            tx.commit();

        }catch (RuntimeException e){
            tx.rollback();
            throw e;
        }
    }
}
