package com.hibernate.Service;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.Product;
import com.hibernate.util.HibernateUtil;

public class ProductService {

	static SessionFactory sessionFactoryObj;
	static Session sessionObj;

	/*---------------------------POST request----------------------------------*/

	/* Method to CREATE an Product in the database business logic */
	public Integer addProduct(String pname, String bname, int cost) {

		Transaction tx = null;
		Integer ProductID = null;

		try {

			sessionObj = HibernateUtil.buildSessionFactory().openSession();
			tx = sessionObj.beginTransaction();

			Product Product = new Product(pname, bname, cost);// created the object of Product class
			ProductID = (Integer) sessionObj.save(Product); // save the object or insert the recording

			tx.commit();// Explicitly call the commit ensure that auto commite should be false
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			sessionObj.close();
		}
		return ProductID;
	}

	/*---------------------------GET request----------------------------------*/

	// list

	/* Method to CREATE an Product in the database business logic */
	public void ListAllProduct() {
		System.out.println(" *************from inside  ListAllProduct()**********************  ");
		Transaction tx = null;
		try {

			sessionObj = HibernateUtil.buildSessionFactory().openSession();
			tx = sessionObj.beginTransaction();
			// Retrieve logic
			List Products = sessionObj.createQuery("From Product").list(); // select * from Product: "Product refer
																			// Product class
			Iterator iterator = Products.iterator();
			while (iterator.hasNext()) {
				Product Product1 = (Product) iterator.next();
				System.out.println("Product  name  " + Product1.getProductName());
				System.out.println("Brand  name  " + Product1.getProductBrand());
				System.out.println("cost    " + Product1.getcost());
			}

			tx.commit();// Explicitly call the commit ensure that auto commit should be false
		} catch (

		HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			sessionObj.close();
		}
	}

	/*----------------------------- update ------------------------------------*/

	/*---------------------------PUT request   id -----------------------------*/

	/* Method to update an Product in the database business logic */
	public void updateProductDetails(Integer ProductId, int cost) {
		System.out.println(" *************from inside  updateProductDetails()**********************  ");
		Transaction tx = null;
		try {

			sessionObj = HibernateUtil.buildSessionFactory().openSession();
			tx = sessionObj.beginTransaction();
			// update logic

			Product Product = (Product) sessionObj.get(Product.class, ProductId);

			Product.setcost(cost);

			sessionObj.update(Product);// hibernate will form update query automatically

			System.out.println("update sucessfully...");

			tx.commit();// Explicitly call the commit ensure that auto commit should be false
		} catch (

		HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			sessionObj.close();
		}

	}

	/*----------------------------- delete ------------------------------------*/

	/*---------------------------PUT request   id -----------------------------*/

	/* Method to update an Product in the database business logic */
	public void deleteProductDetailsById(Integer ProductId, int cost) {
		System.out.println(" *************from inside  deleteProductDetailsById()**********************  ");
		Transaction tx = null;
		try {

			sessionObj = HibernateUtil.buildSessionFactory().openSession();
			tx = sessionObj.beginTransaction();
			// update logic

			Product Product = (Product) sessionObj.get(Product.class, ProductId);

			Product.setcost(cost);

			sessionObj.delete(Product);// hibernate will form delete query automatically

			System.out.println("deleted sucessfully..." + Product.getId());

			tx.commit();// Explicitly call the commit ensure that auto commit should be false
		} catch (

		HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			sessionObj.close();
		}

	}

}