package com.laptop.view;

import com.laptop.cpu.model.*;
import com.laptop.model.*;

public class Display {

	public static void viewDetails(Laptop laptopType) {
		if (laptopType instanceof Item1) {
			Item1 item1 = (Item1) laptopType;
			item1.viewBrand();
			item1.viewModel();
			item1.viewPrice();
			//item1.viewSpecs();
			
			Item1Cpu cpu = (Item1Cpu) laptopType.getCpu();
			cpu.displayCpuType();
			cpu.displayCpuDetails();
		} else if (laptopType instanceof Item2) {
			Item2 item2 = (Item2) laptopType;
			item2.viewBrand();
			item2.viewModel();
			item2.viewPrice();
			//item2.viewSpecs();
			
			Item2Cpu cpu = (Item2Cpu) laptopType.getCpu();
			cpu.displayCpuType();
			cpu.displayCpuDetails();
		} else if (laptopType instanceof Item3) {
			Item3 item3 = (Item3) laptopType;
			item3.viewBrand();
			item3.viewModel();
			item3.viewPrice();
			//item3.viewSpecs();
			
			Item3Cpu cpu = (Item3Cpu) laptopType.getCpu();
			cpu.displayCpuType();
			cpu.displayCpuDetails();
		} else if (laptopType instanceof Item4) {
			Item4 item4 = (Item4) laptopType;
			item4.viewBrand();
			item4.viewModel();
			item4.viewPrice();
			//item4.viewSpecs();
			
			Item4Cpu cpu = (Item4Cpu) laptopType.getCpu();
			cpu.displayCpuType();
			cpu.displayCpuDetails();
		} else if (laptopType instanceof Item5) {
			Item5 item5 = (Item5) laptopType;
			item5.viewBrand();
			item5.viewModel();
			item5.viewPrice();
			//item5.viewSpecs();
			
			Item5Cpu cpu = (Item5Cpu) laptopType.getCpu();
			cpu.displayCpuType();
			cpu.displayCpuDetails();
		}
	}
	
	public static void viewName(Laptop laptopType) {
		if (laptopType instanceof Item1) {
			Item1 item1 = (Item1) laptopType;
			item1.viewModel();
		} else if (laptopType instanceof Item2) {
			Item2 item2 = (Item2) laptopType;
			item2.viewModel();
		} else if (laptopType instanceof Item3) {
			Item3 item3 = (Item3) laptopType;
			item3.viewModel();
		} else if (laptopType instanceof Item4) {
			Item4 item4 = (Item4) laptopType;
			item4.viewModel();
		} else if (laptopType instanceof Item5) {
			Item5 item5 = (Item5) laptopType;
			item5.viewModel();
		}
	}
	
	public static void viewPrice(Laptop laptopType) {
		if (laptopType instanceof Item1) {
			Item1 item1 = (Item1) laptopType;
			item1.viewPrice();
		} else if (laptopType instanceof Item2) {
			Item2 item2 = (Item2) laptopType;
			item2.viewPrice();
		} else if (laptopType instanceof Item3) {
			Item3 item3 = (Item3) laptopType;
			item3.viewPrice();
		} else if (laptopType instanceof Item4) {
			Item4 item4 = (Item4) laptopType;
			item4.viewPrice();
		} else if (laptopType instanceof Item5) {
			Item5 item5 = (Item5) laptopType;
			item5.viewPrice();
		}
	}
	
	
}

