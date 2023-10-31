package com.jsp.package1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.GeneratedValue;
import javax.persistence.Persistence;

public class SaveEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
//		e.setId(102); //uncommented as we are using @GeneratedValue
		e.setName("Ram");
		e.setSal(50000);
		e.setAddress("Maharastra");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("simha");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(e);
		et.commit();
		System.out.println("Data saved Successfully");

	}

}
