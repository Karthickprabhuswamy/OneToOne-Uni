package com.ty.food;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveItems {

	public static void main(String[] args) 
	{
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		FoodOrder foodOrder = new FoodOrder();

		foodOrder.setCustname("sann");
		foodOrder.setAddress("BTR");
		foodOrder.setPhone(98765423);

		Items items = new Items();
		items.setName("Jamoon");
		items.setQuantity(10);
		items.setCost(100);

		Items items1 = new Items();
		items1.setName("Berfi");
		items1.setQuantity(20);
		items1.setCost(1000);

		Items items2 = new Items();
		items2.setName("kaaju-Berfi");
		items2.setQuantity(15);
		items2.setCost(1500);

		List<Items> al = new ArrayList<Items>();

		al.add(items);
		al.add(items1);
		al.add(items2);

		foodOrder.setItems(al);

		entityTransaction.begin();

		entityManager.persist(foodOrder);
		entityManager.persist(items);
		entityManager.persist(items1);
		entityManager.persist(items2);
		entityTransaction.commit();
		System.out.println("Data Saved");

	}
}
