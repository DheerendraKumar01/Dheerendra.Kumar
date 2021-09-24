package com.hibernate;

import org.hibernate.HibernateException; 
import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class ManageProduct {

	
	   static SessionFactory sessionFactoryObj;
	   static Session sessionObj;
	 
	    private static SessionFactory buildSessionFactory() {
	        // Creating Configuration Instance & Passing Hibernate Configuration File
	        Configuration configObj = new Configuration();
	        configObj.configure("hibernate.cfg.xml");
	 
	        // Since Hibernate Version 4.x, ServiceRegistry Is Being Used
	        ServiceRegistry serviceRegistryObj = new StandardServiceRegistryBuilder().applySettings(configObj.getProperties()).build(); 
	 
	        // Creating Hibernate SessionFactory Instance
	        sessionFactoryObj = configObj.buildSessionFactory(serviceRegistryObj);
	        return sessionFactoryObj;
	    }
	
	
	
   public static void main(String[] args) {

      try {
    	   sessionObj = buildSessionFactory().openSession();
           sessionObj.beginTransaction();

      } catch (Exception me) { 
         System.err.println("Failed to create sessionFactory object." + me);
         
      }
      
      ManageProduct ME = new ManageProduct();

      /* Add few Product records in database */
      Integer prodID1 = ME.addProduct("Dantkanti", "Patanjali", 1000);	//Assigned values from here
      Integer prodID2 = ME.addProduct("Honey", "Dabur", 50000);			//assigned values from here


   }
   
   /* Method to CREATE an Product in the database   business logic*/
   public Integer addProduct(String pname, String bname, int cost){
     sessionObj = sessionFactoryObj.getCurrentSession();
      Transaction tx = null;
      Integer ProductID = null;
      
      try {
         tx = sessionObj.beginTransaction();
         Product Product = new Product(pname, bname, cost);//created the object of Product class
         ProductID = (Integer) sessionObj.save(Product); //save the object or insert the recording
       
         tx.commit();//explictiy call  the commit esure that auto commite should be false
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
    	  sessionObj.close(); 
      }
      return ProductID;
   }
   
}