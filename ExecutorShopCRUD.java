package com.xworkz.CRUD;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ExecutorShopCRUD {
    public static void main(String[] args) {
    EntityManagerFactory emf =    Persistence.createEntityManagerFactory("x-workz");
  EntityManager em =   emf.createEntityManager();
        System.out.println("Entity Manager Is That .. " + em);

      EntityTransaction et = em.getTransaction();
        System.out.println("Entity Transaction is " + et);

        et.begin();
        System.out.println("Begin");


         // Create Operation.............
//        System.out.println("Create is .............");
//
//       ShopEntityCRUD shopEntityCRUD = new ShopEntityCRUD(1,"Joshi Mess", 25,"Marenahalli",560020);
//       em.persist(shopEntityCRUD);
//
//        System.out.println("End The Operation....");

           // Read Operation............

//        System.out.println("Start The Read Opertion..............");
//       ShopEntityCRUD shopEntityCRUD =    em.find(ShopEntityCRUD.class,1);
//        System.out.println(shopEntityCRUD);
//        System.out.println("End !!!!!!!!!!!!");


          // UPDATE Operation...............

//        System.out.println("Update Operation is ........./..");
//       ShopEntityCRUD shopEntityCRUD =  em.find(ShopEntityCRUD.class,1);
//        if(shopEntityCRUD != null){
//             shopEntityCRUD.setAddress("Delhi");
//             em.merge(shopEntityCRUD);
//            System.out.println("!!!!!!!!!!!!!!");
//        }


          // DELETE Operation................


        System.out.println("Delete Operation is ..............");
       ShopEntityCRUD deleteEntity= em.find(ShopEntityCRUD.class,1);
        if(deleteEntity!=null){
            em.remove(deleteEntity);
            System.out.println("Remove the data");

        }
        else{
            System.out.println("Data is Not Delete");
        }

        et.commit();
        System.out.println("Commit");

        em.close();
        emf.close();




      }

}
