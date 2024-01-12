package com.xworkz.entity.hw;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ActorRunner {
    public static void main(String[] args) {
     EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
        EntityManager em = emf.createEntityManager();
        System.out.println(em);

        EntityTransaction et = em.getTransaction();
        System.out.println(et);

        et.begin();

        ActorEntity actorEntity = new ActorEntity(1,"Yash", "KGF", "Radhika Pandith", 20000.00);
        em.persist(actorEntity);

        et.commit();

        em.close();
        emf.close();
    }
}
