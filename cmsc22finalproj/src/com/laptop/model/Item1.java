package com.laptop.model;

import com.laptop.cpu.model.Cpu;

public class Item1 extends Laptop {

	private Cpu cpu;
	
	public Cpu getCpu() {
		return cpu;
	}

	public void setCpu(Cpu cpu) {
		this.cpu = cpu;
	}
	
	@Override
	public void viewBrand() {
		System.out.println("Brand: Apple");
	}
	
	@Override
	public void viewModel() {
		System.out.println("Model: MacBook Air (late 2020)");
	}

	@Override
	public void viewPrice() {
		System.out.println("Price: $999");
	}
	
	@Override
	public void viewSpecs() {
		System.out.println("Details: The MacBook Air is a competent, reliable device with a stellar processor."
				+ "Powered by Apple’s M1 processor, is the best laptop you can buy."
				+ "The base model, which includes 8GB of RAM and 256 GB of storage.");
	}
}
