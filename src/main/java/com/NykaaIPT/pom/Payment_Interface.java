package com.NykaaIPT.pom;

public interface Payment_Interface {

	String deliverbtn = "//button[text()='Deliver here']";
		
	String cardno = "//input[@placeholder='Card Number']";

	String expdate = "//input[@placeholder='Expiry (MM/YY)']";
	
	String cvvnum = "//input[@placeholder='CVV']";
	
	String proceedbtn = "//button[@class='css-v61n2j e8tshxd0']";

	String securecard = "//button[text()='Pay without securing card']"; 

	String paynow = "//button[text()='Pay Now']";

}
