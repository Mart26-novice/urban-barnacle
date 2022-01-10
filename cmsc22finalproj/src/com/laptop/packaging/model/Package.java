package com.laptop.packaging.model;

public interface Package {
	public String name();
	public Packaging packing();
	public Packaging outerPacking();
}