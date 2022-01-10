package com.laptop.utility;

import com.laptop.model.*;
import com.laptop.cpu.model.*;

public interface AbstractFactory {
	Laptop getLaptop(String input); 
	Cpu getCpu(String name);
}

