package com.laptop.model;

public class Item5Clone implements Cloning{

	private final String NAME = "Razer Book 13";

    @Override
    public Cloning clone() {
        return new Item5Clone();
    }

    @Override
    public String toString() {
        return NAME;
    }
}
