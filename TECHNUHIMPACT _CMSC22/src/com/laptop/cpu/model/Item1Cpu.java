package com.laptop.cpu.model;

public class Item1Cpu extends Cpu {

	@Override
	public void displayCpuType() {
		System.out.println("CPU for Item 1: MacBook Air (late 2020)");
	}

	@Override
	public void displayCpuDetails() {
		System.out.println("Apple M1 chip");
	}
}