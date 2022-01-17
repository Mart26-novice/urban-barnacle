package com.laptop.order.model;

import com.laptop.utility.LuhnTest;

public class CreditCard {
	public String creditCardNumber;
	public String creditCardStatus;
	
	public static boolean validate(String creditCardNumber) {
		if (LuhnTest.luhnTest(creditCardNumber) == true){
			return true;	
		} else
			return false;
	}

	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}
}	
