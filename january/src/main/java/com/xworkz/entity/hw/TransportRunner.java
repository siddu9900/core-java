package com.xworkz.entity.hw;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TransportRunner {
    public static void main(String[] args) {
     EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
    EntityManager em =  emf.createEntityManager();
        System.out.println(em);

        EntityTransaction et = em.getTransaction();
        System.out.println(et);

        et.begin();
        TransportEntity transportEntity = new TransportEntity(1,"ABC","Road","Innova","Karnataka");
        em.persist(transportEntity);
        et.commit();

        em.close();
        emf.close();
    }
}
