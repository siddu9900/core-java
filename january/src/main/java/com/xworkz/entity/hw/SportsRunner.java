package com.xworkz.entity.hw;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SportsRunner {
    public static void main(String[] args) {
      EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
      EntityManager em = emf.createEntityManager();
        System.out.println(em);

        EntityTransaction et = em.getTransaction();
        System.out.println(et);

        et.begin();
        SportsEntity sportsEntity = new SportsEntity(1,"Cricket", 11,"BCCI","India" );
        em.persist(sportsEntity);
        et.commit();

        em.close();
        emf.close();

    }
}
