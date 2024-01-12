package com.xworkz.entity.hw;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TrafficRunner {
    public static void main(String[] args) {
     EntityManagerFactory emf =  Persistence.createEntityManagerFactory("x-workz");
            EntityManager em = emf.createEntityManager();
        System.out.println(em);
        EntityTransaction et = em.getTransaction();
        System.out.println( et);
        et.begin();
        System.out.println("ET Begin");
        System.out.println("Starting Operation");

        TrafficEntity trafficEntity = new TrafficEntity(1,"BhasyamCircleSignal", "RajajiNagar", "English", "Mr. Amith");
        em.persist(trafficEntity);
        System.out.println("Opertaion Complete");

        et.commit();
        System.out.println("Entity Commit");

        em.close();
        emf.close();
    }
}
