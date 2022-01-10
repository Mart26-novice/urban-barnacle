package com.laptop.utility;

import com.laptop.cpu.model.*;
import com.laptop.model.*;

public class LaptopFactory implements AbstractFactory {
	public Laptop getLaptop(String input) {
		Laptop laptop = null;
		
		switch(input) {
			case "ITEM1":
				laptop = new Item1();
				break;
			case "ITEM2":
				laptop = new Item2();
				break;
			case "ITEM3":
				laptop = new Item3();
				break;
			case "ITEM4":
				laptop = new Item4();
				break;
			case "ITEM5":
				laptop = new Item5();
				break;
		}
		return laptop;
	}

	@Override
	public Cpu getCpu(String name) {
		return null;
	}
}
