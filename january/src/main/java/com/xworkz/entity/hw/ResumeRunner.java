package com.xworkz.entity.hw;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ResumeRunner {
    public static void main(String[] args) {
       EntityManagerFactory emf =Persistence.createEntityManagerFactory("x-workz");
        EntityManager em=emf.createEntityManager();
        System.out.println(em);

        EntityTransaction et = em.getTransaction();
        System.out.println(et);

        et.begin();
        ResumeEntity resumeEntity = new ResumeEntity(1,"Siddu", "sidduchannannavar4@gmail.com", "9900644178","Sustainable Consrete Using Basalt Powder");
        em.persist(resumeEntity);

        et.commit();

        em.close();
        emf.close();
    }
}
