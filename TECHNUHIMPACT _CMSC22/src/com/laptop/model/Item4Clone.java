package com.laptop.model;

public class Item4Clone implements Cloning{
	private final String NAME = "Lenovo Chromebook Duet";

    @Override
    public Cloning clone() {
        return new Item4Clone();
    }

    @Override
    public String toString() {
        return NAME;
    }
}
