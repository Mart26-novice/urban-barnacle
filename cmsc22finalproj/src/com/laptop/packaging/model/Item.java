package com.laptop.packaging.model;

public abstract class Item implements Package{
	   @Override
	   public Packaging packing() {
	      return new Box();
	   }
	   
	   @Override
	   public Packaging outerPacking() {
		  return new BubbleWrap();
	   }
}

