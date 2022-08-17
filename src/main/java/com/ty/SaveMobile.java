package com.ty;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveMobile {
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		
		EntityManager  entityManager =  entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction =  entityManager.getTransaction();
		
		Mobile mobile =  new Mobile();
		
		mobile.setName("NOkIA");
		mobile.setCost(15754);
		
		Sim sim =  new Sim();
		sim.setProvider("JIO");
		sim.setImrc("SB41LM");
		
		Sim sim1 =  new Sim();
		sim1.setProvider("VODAfone");
		sim1.setImrc("SB45LM");
		
		Sim sim2 =  new Sim();
		sim2.setProvider("BSNL");
		sim2.setImrc("SB42LM");
		
		
		List<Sim> al =  new ArrayList();
		
		al.add(sim);
		al.add(sim1);
		al.add(sim2);
		
		mobile.setSim(al);

		
		entityTransaction.begin();
		
		entityManager.persist(mobile);
		entityManager.persist(sim);
		entityManager.persist(sim1);
		entityManager.persist(sim2);
		
		entityTransaction.commit();
		
		System.out.println("------Data Stored-----");
		
	}

}
