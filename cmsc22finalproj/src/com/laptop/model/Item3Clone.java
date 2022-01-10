package com.laptop.model;

public class Item3Clone implements Cloning{

	private final String NAME = "Asus ROG Zephyrus G15";

    @Override
    public Cloning clone() {
        return new Item3Clone();
    }

    @Override
    public String toString() {
        return NAME;
    }
}
