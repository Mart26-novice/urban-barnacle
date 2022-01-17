package com.laptop.order.model;

import java.util.*;
import com.laptop.utility.OrderListIterator;
import com.laptop.order.model.OrderBean;


public class OrderList implements OrderListIterator{		
	ArrayList<OrderBean> orders;
	
	public OrderList() {
		orders = new ArrayList<OrderBean>();
		
		addToList("ITEM5", 5, 1000, 5000, "5105105105105100", "VALID");
		addToList("ITEM3", 1, 2200, 2200, "5105105105105100", "VALID");
	}
	
	public void addToList(String itemCode, int itemQuantity, double itemPrice,
					double orderTotal, String creditCardNumber, String creditCardStatus){
			
		OrderBean o = new OrderBean(itemCode, itemQuantity, itemPrice, orderTotal, creditCardNumber, creditCardStatus);
		orders.add(o);
	}


	public Iterator createIterator() {
		return orders.iterator();
	}
}


