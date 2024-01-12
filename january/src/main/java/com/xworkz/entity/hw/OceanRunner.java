package com.xworkz.entity.hw;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class OceanRunner {
    public static void main(String[] args) {
     EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
  EntityManager em= emf.createEntityManager();
        System.out.println(em);

        EntityTransaction et = em.getTransaction();
        System.out.println(et);

        et.begin();

        OceanEntity oceanEntity = new OceanEntity(1,"Murdeswar Ocean", "SaltWater", "India","Karnataka");
        em.persist(oceanEntity);

        et.commit();

        em.close();
        emf.close();

    }
}
