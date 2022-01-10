package com.laptop.utility;

import java.util.HashMap;
import java.util.Map;
import com.laptop.model.*;

public class PrototypeFactory {

	private static final Map<String, Cloning> prototypes = new HashMap<>();

	//eager loading/instantiation
    static {
        prototypes.put("ITEM1", (Cloning) new Item1Clone());
        prototypes.put("ITEM2", (Cloning) new Item2Clone());
        prototypes.put("ITEM3", (Cloning) new Item3Clone());
        prototypes.put("ITEM4", (Cloning) new Item4Clone());
        prototypes.put("ITEM5", (Cloning) new Item5Clone());
    }

    public static Cloning getPrototype(String type) {
    	System.out.println("\nCreating new laptop now...");
    	try {
            return prototypes.get(type).clone();
        } catch (NullPointerException ex) {
            System.out.println("Prototype with name: " + type + ", doesn't exist");
            return null;
        }	
    }
}

