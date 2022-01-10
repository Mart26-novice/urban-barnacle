package com.laptop.model;

import com.laptop.cpu.model.*;

public abstract class Laptop {

	public abstract void setCpu(Cpu cpu);
	public abstract Cpu getCpu();
	
	public abstract void viewBrand();
	public abstract void viewModel();
	public abstract void viewPrice();
	public abstract void viewSpecs();
}

