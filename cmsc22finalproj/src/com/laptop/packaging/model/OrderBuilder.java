package com.laptop.packaging.model;

import com.laptop.packaging.model.*;

public class OrderBuilder {
	  public Order packOrder(){
	      Order order = new Order();
	      order.addContent(new PackItem());
	      return order;
	  } 
}
