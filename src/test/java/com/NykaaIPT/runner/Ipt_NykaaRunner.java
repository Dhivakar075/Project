package com.NykaaIPT.runner;

import java.util.Set;
import com.NykaaIPT.base.Base_Class;
import com.NykaaIPT.pom.Page_Object_Manager;


public class Ipt_NykaaRunner extends Base_Class {

static	Page_Object_Manager pom = new Page_Object_Manager();

public static void browserOpen() {

	
		browserLaunch(pom.getProperty().getBrowser());
		getUrl(pom.getProperty().getUrl());
	}
	
public static void logIn() throws Throwable {

		
		clickingWebElement(pom.getLogin().getSigninbtn());
		clickingWebElement(pom.getLogin().getSigninmob());
		Thread.sleep(2000);
		sendKeys(pom.getLogin().getMobileno(), pom.getProperty().getMobNumber());
		clickingWebElement(pom.getLogin().getSubmitbtn());
		Thread.sleep(12000);
		clickingWebElement(pom.getLogin().getVerifybtn());
	}
	
public static void productSearch() throws Throwable {

	
	actionWebElement(pom.getProduct().getMombabytab(), "Move to Webelement");
	actionWebElement(pom.getProduct().getPowderbtn(), "click WebElement");
	Thread.sleep(3000);
	robotClass("pagedown");

//Window Handles
	
	Set<String> windowHandles = driver.getWindowHandles();
	for (String string : windowHandles) {
		driver.switchTo().window(string);
	}
	Thread.sleep(3000);
	actionWebElement(pom.getProduct().getPowder(), "click WebElement");
	Thread.sleep(4000);
	}
	
public static void addToCart() throws Throwable {
		
//Window Handle
		
		Set<String> windowHandles = driver.getWindowHandles();
		for (String string : windowHandles) {
			driver.switchTo().window(string);
		}
		robotClass("pagedown");
		robotClass("pagedown");
		
	dropdown(pom.getCart().getDropdown(),"Value","2");
	clickingWebElement(pom.getCart().getAddtobag());
	}
	
public static void bagFrame() throws Throwable { 
	clickingWebElement(pom.getCart().getBag());
	Thread.sleep(4000);

	frameWebElement(pom.getCart().getFrame());
	Thread.sleep(5000);
	
	clickingWebElement(pom.getCart().getQuant());
	Thread.sleep(2000);
	
	clickingWebElement(pom.getCart().getQuannos());
	Thread.sleep(5000);
	
	clickingWebElement(pom.getCart().getProceedbtn());
	}
	

public static void paymentPage() throws Throwable {

	Thread.sleep(3000);
	clickingWebElement(pom.getPayment().getDeliverbtn());
	Thread.sleep(5000);
	clickingWebElement(pom.getPayment().getCardno());
	Thread.sleep(5000);
	sendKeys(pom.getPayment().getCardno(),pom.getProperty().getCardno());
	Thread.sleep(2000);
	robotClass("tab");
	Thread.sleep(2000);
	sendKeys(pom.getPayment().getExpdate(), pom.getProperty().getExpdate());
	Thread.sleep(2000);
	robotClass("tab");
	Thread.sleep(3000);
	sendKeys(pom.getPayment().getCvvnum(), pom.getProperty().getCvv());
	Thread.sleep(2000);
	clickingWebElement(pom.getPayment().getProceedbtn());
	Thread.sleep(3000);
	clickingWebElement(pom.getPayment().getSecurecard());
	Thread.sleep(4000);
	clickingWebElement(pom.getPayment().getPaynow());	
	Thread.sleep(9000);
	TakeScreenshot("Payment Screenshot");
}

public static void removeItem() throws Throwable {

	clickingWebElement(pom.getRemove_ItemPom().getClose());
	Thread.sleep(3000);
	clickingWebElement(pom.getRemove_ItemPom().getBagitem());
	Thread.sleep(3000);
	clickingWebElement(pom.getRemove_ItemPom().getEditbtn());
	Thread.sleep(3000);
	clickingWebElement(pom.getRemove_ItemPom().getDeletebtn());
	Thread.sleep(3000);
	clickingWebElement(pom.getRemove_ItemPom().getRemovebtn());
	
	System.out.println("Git Status Check");
	
}

		public static void main(String[] args) throws Throwable	{
		
			browserOpen();
			logIn();
			productSearch();
			addToCart();
			bagFrame();
			paymentPage();
			removeItem();
		}

}