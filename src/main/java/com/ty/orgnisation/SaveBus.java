package com.ty.orgnisation;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveBus 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		
		EntityManager  entityManager =  entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction =  entityManager.getTransaction();
		
		Organistation organistation = new Organistation();
		
		organistation.setName("KSRTC");
		organistation.setAddress("Banglore");

		Bus bus =  new Bus();
		
		bus.setCapacity(45);
		bus.setType("Sleeper");
		
		Bus bus1 =  new Bus();
		bus1.setCapacity(40);
		bus1.setType("AC-Sleeper");
		
		Bus bus2 =  new Bus();
		bus2.setCapacity(55);
		bus2.setType("AC-Normal");
		
		Bus bus3 =  new Bus();
		bus3.setCapacity(48);
		bus3.setType("AC-Lexury");
		
		List<Bus> al =  new ArrayList();
		
		al.add(bus);
		al.add(bus1);
		al.add(bus2);
		al.add(bus3);
		
		organistation.setBus(al);
		
		entityTransaction.begin();
		
		entityManager.persist(organistation);
		entityManager.persist(bus);
		entityManager.persist(bus1);
		entityManager.persist(bus2);
		entityManager.persist(bus3);
		
		entityTransaction.commit();
		
		System.out.println("Data Saved");
		
		
		
		
		
		
		
		
	}

}
