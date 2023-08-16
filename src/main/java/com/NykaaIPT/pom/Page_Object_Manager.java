package com.NykaaIPT.pom;

import org.openqa.selenium.support.PageFactory;

import com.NykaaIPT.base.Base_Class;

public class Page_Object_Manager extends Base_Class {

	public Page_Object_Manager() {
		PageFactory.initElements(driver, this);
	}
	
private Login login;

public Login getLogin() {
	login = new Login();
	return login;
}
	
private Product pro;

public Product getProduct() {
	pro = new Product();
	return pro;
}
	
private Cart cart;

public Cart getCart() {
	cart = new Cart();
	return cart;
}


private Payment pay;

public Payment getPayment() {
	pay = new Payment();
	return pay;
}

private Remove_ItemPom rip;

public Remove_ItemPom getRemove_ItemPom() {
	rip = new Remove_ItemPom();
	return rip;
}

NykaaProperties nyprop;

public NykaaProperties getProperty() {
	nyprop = new NykaaProperties();
	return nyprop;
}
}
