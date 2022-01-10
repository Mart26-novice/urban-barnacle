package com.laptop.model;

public class Item2Clone implements Cloning{
	private final String NAME = "Spectre x360 14";

    @Override
    public Cloning clone() {
        return new Item2Clone();
    }

    @Override
    public String toString() {
        return NAME;
    }
}
