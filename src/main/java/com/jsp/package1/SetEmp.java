package com.jsp.package1;
//Insert Operation
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

//Update employee table
public class SetEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("simha");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		Employee e = em.find(Employee.class, 101);
		e.setName("Raj");
		e.setSal(100000);
		em.merge(e);
		et.commit();
		System.out.println("Data updated Successfully");

	}

}
