package com.xworkz.CRUD;

import com.xworkz.CRUD.TrafficFineEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TrafficFineRunner {
    public static void main(String[] args) {

        // CRUD Operation....
        // Create ....


//     EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
//    EntityManager em = emf.createEntityManager();
//        System.out.println(em);
//  EntityTransaction et = em.getTransaction();
//        System.out.println(et);
//
//        et.begin();
//        System.out.println("Start Begin");
//
//        System.out.println("Operation Start...........");
//        TrafficFineEntity trafficFineEntity = new TrafficFineEntity(2,"Rash Driving", "KA-71-J-2200","Amith", 2500);
//        em.persist(trafficFineEntity);
//        System.out.println("Operation Closed..............");
//
//        et.commit();
//        System.out.println("Let Entity Commit");
//
//
//        em.close();
//        emf.close();
//



        // Read................

//         EntityManagerFactory emf =Persistence.createEntityManagerFactory("x-workz");
//          EntityManager em = emf.createEntityManager();
//        System.out.println(em);
//        EntityTransaction et =  em.getTransaction();
//        System.out.println(et);
//
//        et.begin();
//        System.out.println("Begin");
//        System.out.println("Start The Fetching the data  Operation");
//      TrafficFineEntity trafficFineEntity =  em.find(TrafficFineEntity.class,1);
//     // TrafficFineEntity trafficFineEntity1 = em.find(TrafficFineEntity.class,2);
//
//        System.out.println(trafficFineEntity);
//        //System.out.println(trafficFineEntity1);
//        System.out.println("End the data Fetching.........");
//        et.commit();
//
//        em.close();
//        emf.close();



        // UPDATE..................
//
//      EntityManagerFactory emf =  Persistence.createEntityManagerFactory("x-workz");
//             EntityManager  em = emf.createEntityManager();
//        System.out.println(em);
//
//     EntityTransaction et =   em.getTransaction();
//        System.out.println(et);
//
//
//        et.begin();
//        System.out.println("Start to update ....");
//        TrafficFineEntity trafficFineEntity = em.find(TrafficFineEntity.class,1);
//
//
//         trafficFineEntity.setOwnerName("Amith");
//        System.out.println(trafficFineEntity);
//
//        et.commit();
//
//        em.close();
//        emf.close();

        //DELETE..............

     EntityManagerFactory emf =   Persistence.createEntityManagerFactory("x-workz");
 EntityManager em =  emf.createEntityManager();
        System.out.println("Entity Manager FFactroy is " + em);

       EntityTransaction et = em.getTransaction();
        System.out.println("Entity Transaction is " + et);

        et.begin();
        System.out.println("Start Begin opertaion");

        System.out.println("Deleting operation is Start ");

     TrafficFineEntity trafficFineEntity =     em.find(TrafficFineEntity.class,1);
         if(trafficFineEntity != null){
             em.remove(trafficFineEntity);
             System.out.println("Data is  Succsusfully Delete.............");

         }else {
             System.out.println("Data is Not Delete.............");
         }
         et.commit();
        System.out.println("Commit");

        em.close();
        emf.close();

    }
}
