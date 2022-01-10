package com.laptop.controller;

import java.util.Iterator;

import com.laptop.utility.OrderListIterator;
import com.laptop.order.model.OrderList;
import com.laptop.model.*;
import com.laptop.order.model.OrderBean;
import com.laptop.cpu.model.*;
import com.laptop.utility.*;
import com.laptop.view.Display;
import com.laptop.client.model.*;

public class Client {
	static OrderList list;
	static OrderListIterator iter;
	
	public static void initialize (OrderListIterator newOrders) {
		iter = newOrders;
	}
	
	public static void main(String[] args) {
		ClientBean client = new ClientBean();
		System.out.println("A pleasant day! Welcome to TECHNUH IMPACT BAZAAR!\n"
				+ "\r\n[We Have 100% Authentic Branded Deals, Catch Exclusive Offers Now.]\r\n"
				+ "\r\n[Whats More? Discover Best Deals. Free Shipping, Delivery,"
				+ "\nLow Price & Genuine Reviews. Buy Anytime, Anywhere.]\r\n"
				+ "\r\n[Here in TECHNUH IMPACT BAZAAR, we serve our customers with a smile and a heart!]\r\n");
		client.name = Reader.getString("May I take your name, please?");
		System.out.println("\r\n[Terms and Agreement: I have agreed to share may personal information\n"
						+ "and provide valid data for the said transaction. TECHNUH IMPACT BAZZAR\n"
						+ "respect, secure, and provide privacy to our beloved customers.]\r\n");
		System.out.println("Hello! " + client.name + ", Welcome to TECHNUH IMPACT BAZZAR.");
		client.address = Reader.getString("Can I have your address, please?");
		
		System.out.println("\nThe following products are available:");
		System.out.println("Type => [ITEM1] for MacBook Air (late 2020)");
		System.out.println("\r\n[Description: The MacBook Air is a competent,\n"
				         + "reliable device with a stellar processor. Powered\n"
				         + "by Apple’s M1 processor, is the best laptop you\n"
				         + "can buy. The base model which includes 8GB of RAM\n"
				         + "and 256 GB of storage.]\r\n");
		
		System.out.println("Type => [ITEM2] for Spectre x360 14");
		System.out.println("\r\n[Description: The HP Spectre x360 14 is the best\n"
				         + "2-in-1 laptop of 2021. The Spectre includes a roomy\n"
				         + "3:2 display, and if FHD resolution doesn’t suit your\n"
				         + "fancy, there are OLED and 1,000-nit options available.]\r\n");
		
		System.out.println("Type => [ITEM3] for Asus ROG Zephyrus G15");
		System.out.println("\r\n[Description: The Asus ROG Zephyrus G15 is one of the\n"
				 		+ "best gaming laptops that you can currently purchase. Despite\n"
				 		+ "not having a webcam, it’s tough to beat the performance for the cost.]\r\n");
		
		System.out.println("Type => [ITEM4] for Lenovo Chromebook Duet");
		System.out.println("\r\n[Description: The Chromebook Duet boasts long battery life\n"
						+ "and has a 16:10 aspect ratio display to fit more content on the\n"
						+ "screen at once. The Duet can be used as a tablet or a laptop. On\n"
						+ "the downside, it has just one USB-C port and no 3.5mm headphone jack.]\r\n");
		
		System.out.println("Type => [ITEM5] for Razer Book 13");
		System.out.println("\r\nDescription: Razer is best known for its gaming laptops,\n"
				+ "but the company is making a big splash in the business and productivity\n"
				+ "space with its new Razer Book 13. At 0.6 inches thick and 3.09 pounds,\n"
				+ "the Book 13 is a portable workstation with a gorgeous and sturdy aluminum build.]\r\n");
		
		list = new OrderList();
		initialize(list);
		System.out.println("You previously purchased:");
		printList(iter); 
		
		System.out.println("\nWhat would you like to purchase today?");
		
		OrderBean order = new OrderBean();
		order.process();
		
		System.out.println("\nPlease expect your delivery at " + client.address + " by tomorrow.");
		while(true) {
		String go = com.laptop.utility.Reader.getString("\nDo you want to place another order [Y/N]?");
			if (go.equalsIgnoreCase("Y")) {
				System.out.println("\nWelcome! The following products are available:");
				System.out.println("Type => [ITEM1] for Dell XPS 15 2021");
				System.out.println("\r\n[Description: The MacBook Air is a competent,\n"
				         + "reliable device with a stellar processor. Powered\n"
				         + "by Apple’s M1 processor, is the best laptop you\n"
				         + "can buy. The base model which includes 8GB of RAM\n"
				         + "and 256 GB of storage.]\r\n");
				
				System.out.println("Type => [ITEM2] for Dell Inspirion 15 3501-1605S");
				System.out.println("\r\n[Description: The HP Spectre x360 14 is the best\n"
				         + "2-in-1 laptop of 2021. The Spectre includes a roomy\n"
				         + "3:2 display, and if FHD resolution doesn’t suit your\n"
				         + "fancy, there are OLED and 1,000-nit options available.]\r\n");
				
				System.out.println("Type => [ITEM3] for DELL VOSTRO 5402 NOTEBOOK");
				System.out.println("\r\n[Description: The Asus ROG Zephyrus G15 is one of the\n"
				 		+ "best gaming laptops that you can currently purchase. Despite\n"
				 		+ "not having a webcam, it’s tough to beat the performance for the cost.]\r\n");
				
				System.out.println("Type => [ITEM4] for Dell G15");
				System.out.println("\r\n[Description: The Chromebook Duet boasts long battery life\n"
						+ "and has a 16:10 aspect ratio display to fit more content on the\n"
						+ "screen at once. The Duet can be used as a tablet or a laptop. On\n"
						+ "the downside, it has just one USB-C port and no 3.5mm headphone jack.]\r\n");
				
				System.out.println("Type => [ITEM5] for DELL ALIENWARE X15 R1\n");
				System.out.println("\r\nDescription: Razer is best known for its gaming laptops,\n"
						+ "but the company is making a big splash in the business and productivity\n"
						+ "space with its new Razer Book 13. At 0.6 inches thick and 3.09 pounds,\n"
						+ "the Book 13 is a portable workstation with a gorgeous and sturdy aluminum build.]\r\n");
				
				OrderBean newOrder = new OrderBean();
				newOrder.process();
				
				System.out.println("\nHello, " + client.name + ". Please expect your delivery at " +
				client.address + " by tomorrow.");
			} else if (go.equalsIgnoreCase("N")) {
				break;
			} else {
				System.out.print("Try Again With (Y/N) only! ");
			}
		}	
	}
	
	public static void printList(OrderListIterator iterator) {
		Iterator<OrderBean> orderIterator = iterator.createIterator();
			
		while(orderIterator.hasNext()){
			OrderBean previousTransaction = (OrderBean) orderIterator.next();
			
			System.out.println("\nItem Code: " + previousTransaction.getItemCode());
			System.out.println("Item Quantity: " + previousTransaction.getItemQuantity());
		}	
	}
}


