package com.xworkz.CRUD;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.function.Supplier;

public class CRUDSportRunner {
    public static void main(String[] args) {
      EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
     EntityManager em = emf.createEntityManager();
        System.out.println(em);

      EntityTransaction et = em.getTransaction();
        System.out.println(et);

        et.begin();
        System.out.println("Begin!!!!!!!!!!");



           // Create .................
//        System.out.println("Get..........");
//        SportsEntityCRUD sportsEntityCRUD = new SportsEntityCRUD(1,"Cricket", "INDIA", "Mahamad Shami", 11);
//        em.persist(sportsEntityCRUD);
//        System.out.println("!!!!!!!!!!!!!!!!!!!");


        // Read......

//        SportsEntityCRUD read = em.find(SportsEntityCRUD.class,1);
//        System.out.println(read);

        // UPDATE.............
//        System.out.println("Update Start  ,,,,,,,,,,,,,,");
//        SportsEntityCRUD update = em.find(SportsEntityCRUD.class,1);
//        if(update != null){
//            update.setTotalPlayer(22);
//            em.merge(update);
//
//            System.out.println("____________________");
//
//        }



        // DELETE...........
        System.out.println("Delete Opertion,,,,,,,,,,,,,");
        SportsEntityCRUD delete =  em.find(SportsEntityCRUD.class,1);
         if(delete!=null){
             em.remove(delete);
         }

        et.commit();
        System.out.println("commit");


        em.close();
        emf.close();
    }
}
