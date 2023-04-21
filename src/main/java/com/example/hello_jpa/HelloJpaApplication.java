package com.example.hello_jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.time.LocalDateTime;
import java.util.List;

public class HelloJpaApplication {

	public static void main(String[] args) {

		Integer a = 10;
		int b = a;

		a=20;

		System.out.println("a = " + a);
		System.out.println("b = " + b);


//
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
//
//		EntityManager em = emf.createEntityManager();
//
//		EntityTransaction tx = em.getTransaction();
//		tx.begin();
//
//		try {
//
//			Child child1 = new Child();
//			Child child2 = new Child();
//
//			Parent parent =new Parent();
//			parent.addChild(child1);
//			parent.addChild(child2);
//
//			em.persist(parent);
//
//			tx.commit();
//		} catch (Exception e){
//			tx.rollback();
//		} finally {
//			em.close();
//		}
//		emf.close();
	}

}
