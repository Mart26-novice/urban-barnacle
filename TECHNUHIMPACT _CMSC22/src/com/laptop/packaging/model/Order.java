package com.laptop.packaging.model;

import java.util.ArrayList;

import java.util.List;
public class Order {
   private List<Package> packages = new ArrayList<Package>();	

   public void addContent(Package p){
      packages.add(p);
   }

   public void showContent(){
      for (Package p : packages) {
         System.out.print(p.name());
         System.out.print("\nPackaging: " + p.packing().pack() + " wrapped in " + p.outerPacking().pack());
      }		
   }	
}



