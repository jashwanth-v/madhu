package com;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveCustomer {

	
	public static void main(String[]args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
	    Customer customer = new Customer();
	    customer.setId(101);
	    customer.setName("jashu");
	    customer.setAge(22);
	    customer.setGender("male");
	    customer.setPhno(830970457);
	    customer.setGmail("jashwanthvalleru777@gmail.com");
	    
	    entityTransaction.begin();
	    entityManager.persist(customer);
	    entityTransaction.commit();
	    
	    
	}
}
