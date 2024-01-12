package com.xworkz.entity.hw;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ShopRunner {
    public static void main(String[] args) {

        EntityManagerFactory emf =Persistence.createEntityManagerFactory("x-workz");
        EntityManager em=emf.createEntityManager();
        System.out.println(em);

        EntityTransaction et = em.getTransaction();
        System.out.println(et);

        et.begin();

        ShopEntity shopEntity = new ShopEntity(1,"Gajanana Store", "VijayaNagar", "Gajanana@gmail.com", "Goa");
         em.persist(shopEntity);
        et.commit();

        em.close();
        emf.close();


    }
}
