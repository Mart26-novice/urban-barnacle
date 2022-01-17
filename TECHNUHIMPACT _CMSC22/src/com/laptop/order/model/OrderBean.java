package com.laptop.order.model;

import java.io.Serializable;
import java.util.*;
import com.laptop.order.model.OrderList;
import com.laptop.cpu.model.Cpu;
import com.laptop.model.Cloning;
import com.laptop.model.Laptop;
import com.laptop.packaging.model.*;
import com.laptop.utility.CpuFactory;
import com.laptop.utility.Facade;
import com.laptop.utility.LaptopFactory;
import com.laptop.utility.OrderListIterator;
import com.laptop.utility.PrototypeFactory;
import com.laptop.utility.Reader;
import com.laptop.view.*;

public  class OrderBean implements Facade{
	public String itemCode;
	public int itemQuantity;
	public double itemPrice;
	public double orderTotal;
	public String creditCardNumber;
	public String creditCardStatus;

	public OrderBean() {	
	}
	
	public OrderBean(String itemCode, int itemQuantity, double itemPrice,
			double orderTotal, String creditCardNumber, String creditCardStatus) {
		this.itemCode = itemCode;
		this.itemQuantity = itemQuantity;
		this.itemPrice = itemPrice;
		this.orderTotal = orderTotal;
		this.creditCardNumber = creditCardNumber;
		this.creditCardStatus = creditCardStatus;
	}
	
	public String getItemCode(){
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	
	public int getItemQuantity() {
		return itemQuantity;
	}
	
	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	public double getItemPrice() {
		return itemPrice;
	}
	
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	
	public double getOrderTotal() {
		return orderTotal;
	}
	
	public void setOrderTotal(double orderTotal) {
		this.orderTotal = orderTotal;
	}
	
	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}
		
	private void orderMethods() {					
		//Client enters item number of chosen laptop
		boolean valid = false;
		
		String itemChoice = Reader.getString("Enter item of choice").toUpperCase();
		
		while(!valid) {
			switch (itemChoice) {
			case "ITEM1":
				valid = true;
				break;
			case "ITEM2":
				valid = true;
				break;
			case "ITEM3":
				valid = true;
				break;
			case "ITEM4":
				valid = true;
				break;			
			case "ITEM5":
				valid = true;
				break;			
			default:
				valid = false;
				System.out.println("\nINCORRECT INPUT! Please try again!");
				System.out.print("Choose from the list given above.");
				itemChoice = Reader.getString("\nEnter item of choice").toUpperCase();
				break;
			}
		}
		
		double total = 0;

		OrderBean order = new OrderBean();
		CreditCard creditCard = new CreditCard();
		
		order.itemCode = itemChoice;
		order.itemQuantity = Reader.getInt("Enter item quantity");
		
		switch (order.itemCode) {
		case "ITEM1":
			order.itemPrice = 999;
			break;
		case "ITEM2":
			order.itemPrice = 1100;
			break;
		case "ITEM3":
			order.itemPrice = 2200;
			break;
		case "ITEM4":
			order.itemPrice = 299;
			break;			
		case "ITEM5":
			order.itemPrice = 1000;	
			break;
		}
		
		order.orderTotal = order.itemQuantity * order.itemPrice;		
		order.creditCardNumber = Reader.getString("Enter credit card number");
		creditCard.setCreditCardNumber(order.creditCardNumber);
		if(creditCard.validate(creditCard.getCreditCardNumber())== true){
			this.creditCardStatus = "VALID";
						
			//now we create an object based on the client's preference
			Laptop clientLaptop = new LaptopFactory().getLaptop(itemChoice.toUpperCase());
				
			//set the CPU
			Cpu cpu = new CpuFactory().getCpu(itemChoice);
				
			//set the ownership of the created CPU to the laptop created
			clientLaptop.setCpu(cpu);
			
			System.out.println("\nYou successfully ordered.");
			//created object is passed to view for printing
			Display.viewDetails(clientLaptop);
			
			Cloning prototype =  PrototypeFactory.getPrototype(itemChoice); 
	        if (prototype != null) {
	             System.out.println(prototype + " CREATION SUCCESSFUL");
	        }

	        OrderBuilder orderBuilder = new OrderBuilder();
		    Order item = orderBuilder.packOrder();
		    item.showContent();
		    
		    System.out.println("\n\n****************************************");
		    System.out.println("**********  --ORDER RECEIPT-- **********");
		    System.out.println("****************************************");
		    Display.viewName(clientLaptop);
		    Display.viewPrice(clientLaptop);
		    System.out.println("Quantity: " + order.itemQuantity);
		    System.out.println("\n\nTotal: $" + order.orderTotal);
		    System.out.println("****************************************");
		} else {
			System.out.println("ALERT!!!! Invalid Credit Card. Failed transaction.");
		}
	}
		
	@Override
	public void process() {
		orderMethods();
	}
}
