package com.ty;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetMobileByID {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Mobile mobile = entityManager.find(Mobile.class, 1);
		
		System.out.println("ID:" + mobile.getId());
		System.out.println("Name:" + mobile.getName());
		System.out.println("Cost:" + mobile.getCost());

		List<Sim> sim = mobile.getSim();

		for (Sim sim2 : sim) {
			System.out.println("Sim Id:" + sim2.getId());
			System.out.println("Sim provieder:" + sim2.getProvider());
			System.out.println("Sim imrc" + sim2.getImrc());
		}

	}
}
