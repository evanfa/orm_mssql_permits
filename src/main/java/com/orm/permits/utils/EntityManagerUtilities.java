package com.orm.permits.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerUtilities {
    public static EntityManager getEntityManager() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("agency_db");
        EntityManager manager = factory.createEntityManager();
        return manager;
    }

    /*public static void main(String[] args) {
        EntityManager manager = EntityManagerUtilities.getEntityManager();
        System.out.println("Entity Manager Class ==> "+manager.getClass().getCanonicalName());
    }*/
}
