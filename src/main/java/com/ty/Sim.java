package com.ty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sim {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int id;
	private String provider;
	private String imrc;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getImrc() {
		return imrc;
	}

	public void setImrc(String imrc) {
		this.imrc = imrc;
	}

}
