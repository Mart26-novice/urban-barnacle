package com.laptop.model;

import com.laptop.cpu.model.Cpu;

public class Item4 extends Laptop {

	private Cpu cpu;
	
	public Cpu getCpu() {
		return cpu;
	}

	public void setCpu(Cpu cpu) {
		this.cpu = cpu;
	}
	
	@Override
	public void viewBrand() {
		System.out.println("Brand: Lenovo");
	}
	
	@Override
	public void viewModel() {
		System.out.println("Model: Lenovo Chromebook Duet");
	}

	@Override
	public void viewPrice() {
		System.out.println("Price: $299");
	}
	
	@Override
	public void viewSpecs() {
		System.out.println("Details: The Chromebook Duet boasts long battery life and has a 16:10 aspect ratio display to fit more content on the screen at once."
				+ "The Duet can be used as a tablet or a laptop. On the downside, it has just one USB-C port and no 3.5mm headphone jack.");
	}
}