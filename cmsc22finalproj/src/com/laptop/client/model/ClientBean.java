package com.laptop.client.model;

import java.io.Serializable;

public class ClientBean implements Serializable{
	public String name;
	public String address;

	public ClientBean() {	
	}
	
	public ClientBean(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public String getName(){
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
		
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
