package com.laptop.utility;

import com.laptop.cpu.model.*;
import com.laptop.model.Laptop;

public class CpuFactory implements AbstractFactory {
	
	public Cpu getCpu(String name) {
		Cpu cpu = null;
		
		if(name.equalsIgnoreCase("Item1")) {
			cpu = new Item1Cpu();
		} else if (name.equalsIgnoreCase("Item2")) {
			cpu = new Item2Cpu();
		} else if(name.equalsIgnoreCase("Item3")) {
			cpu = new Item3Cpu();
		} else if(name.equalsIgnoreCase("Item4")) {
			cpu = new Item4Cpu();
		} else if(name.equalsIgnoreCase("Item5")) {
			cpu = new Item5Cpu();
		} 
		return cpu;
	}

	@Override
	public Laptop getLaptop(String input) {
		return null;
	}
}


