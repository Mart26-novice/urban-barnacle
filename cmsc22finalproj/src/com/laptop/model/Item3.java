package com.laptop.model;

import com.laptop.cpu.model.Cpu;

public class Item3 extends Laptop {

	private Cpu cpu;
	
	public Cpu getCpu() {
		return cpu;
	}

	public void setCpu(Cpu cpu) {
		this.cpu = cpu;
	}
	
	@Override
	public void viewBrand() {
		System.out.println("Brand: Asus");
	}
	
	@Override
	public void viewModel() {
		System.out.println("Model: Asus ROG Zephyrus G15");
	}

	@Override
	public void viewPrice() {
		System.out.println("Price: $2,200");
	}
	
	@Override
	public void viewSpecs() {
		System.out.println("Details: The Asus ROG Zephyrus G15 is one of the best gaming laptops that you can currently purchase."
				+ "Despite not having a webcam, it’s tough to beat the performance for the cost.");
	}
}