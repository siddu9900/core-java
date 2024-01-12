package com.xworkz.entity.hw;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FilmRunner {
    public static void main(String[] args) {
      EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");

        EntityManager em= emf.createEntityManager();
        System.out.println(em);

       EntityTransaction et = em.getTransaction();
        System.out.println(et);

       et.begin();

        System.out.println("Starting the Opertion");
       FilmEntity filmEntity = new FilmEntity(1,"Katera", "Kannada", "Rockline Venkatesh", "30 Crore");
       em.persist(filmEntity);
        System.out.println("Operation is Complete");
       et.commit();



       em.close();
       emf.close();

    }
}
