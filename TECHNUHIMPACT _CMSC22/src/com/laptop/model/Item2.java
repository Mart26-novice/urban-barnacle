package com.laptop.model;

import com.laptop.cpu.model.Cpu;

public class Item2 extends Laptop {

	private Cpu cpu;
	
	public Cpu getCpu() {
		return cpu;
	}

	public void setCpu(Cpu cpu) {
		this.cpu = cpu;
	}
	
	@Override
	public void viewBrand() {
		System.out.println("Brand: HP");
	}
	
	@Override
	public void viewModel() {
		System.out.println("Model: Spectre x360 14");

	}

	@Override
	public void viewPrice() {
		System.out.println("Price: $1,100");
	}
	
	@Override
	public void viewSpecs() {
		System.out.println("Details: The HP Spectre x360 14 is the best 2-in-1 laptop of 2021."
				+ "The Spectre includes a roomy 3:2 display, and if FHD resolution doesn’t suit your fancy, there are OLED and 1,000-nit options available.");
	}
}