package com.laptop.model;

import com.laptop.cpu.model.Cpu;

public class Item5 extends Laptop {

	private Cpu cpu;
	
	public Cpu getCpu() {
		return cpu;
	}

	public void setCpu(Cpu cpu) {
		this.cpu = cpu;
	}
	
	@Override
	public void viewBrand() {
		System.out.println("Brand: Razer");
	}
	
	@Override
	public void viewModel() {
		System.out.println("Model: Razer Book 13");
	}

	@Override
	public void viewPrice() {
		System.out.println("Price: $1,000");
	}
	
	@Override
	public void viewSpecs() {
		System.out.println("Details: Razer is best known for its gaming laptops, but the company is making a big splash in the business and productivity space with its new Razer Book 13."
				+ "At 0.6 inches thick and 3.09 pounds, the Book 13 is a portable workstation with a gorgeous and sturdy aluminum build.");
	}
}