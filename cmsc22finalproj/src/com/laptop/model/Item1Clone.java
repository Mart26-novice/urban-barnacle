package com.laptop.model;

public class Item1Clone implements Cloning{

	private final String NAME = "MacBook Air (late 2020)";

    @Override
    public Cloning clone() {
        return new Item1Clone();
    }

    @Override
    public String toString() {
        return NAME;
    }
}
