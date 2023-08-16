package com.NykaaIPT.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.NykaaIPT.base.Base_Class;

public class Payment extends Base_Class {
	
	public Payment() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = Payment_Interface.deliverbtn)
	private WebElement deliverbtn;
	

	
	@FindBy(xpath = Payment_Interface.cardno)
	private WebElement cardno;
	
	@FindBy(xpath = Payment_Interface.expdate)
	private WebElement expdate;
	
	@FindBy(xpath = Payment_Interface.cvvnum)
	private WebElement cvvnum;

	@FindBy(xpath = Payment_Interface.proceedbtn)
	private WebElement proceedbtn;

	@FindBy(xpath = Payment_Interface.securecard)
	private WebElement securecard; 

	@FindBy(xpath = Payment_Interface.paynow)	
	private WebElement paynow;

	public WebElement getDeliverbtn() {
	return deliverbtn;
	}


	public WebElement getCardno() {
	return cardno;
	}


	public WebElement getExpdate() {
	return expdate;
	}


	public WebElement getCvvnum() {
	return cvvnum;
	}


	public WebElement getProceedbtn() {
	return proceedbtn;
	}


	public WebElement getSecurecard() {
	return securecard;
	}


	public WebElement getPaynow() {
	return paynow;
	}			
}
