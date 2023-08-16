package com.NykaaIPT.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.NykaaIPT.base.Base_Class;

public class Login extends Base_Class {


	public Login(){
		PageFactory.initElements(driver, this);
	}

	public WebElement getSigninbtn() {
		return signinbtn;
	}

	public WebElement getSigninmob() {
		return signinmob;
	}

	public WebElement getMobileno() {
		return mobileno;
	}

	public WebElement getSubmitbtn() {
		return submitbtn;
	}

	public WebElement getVerifybtn() {
		return verifybtn;
	}

	@FindBy(xpath = Login_Interface.signinbtn)
	private	WebElement signinbtn; 
	
	@FindBy(xpath = Login_Interface.signinmob)
	private WebElement signinmob;

	@FindBy(xpath = Login_Interface.mobileno)
	private WebElement mobileno;
		
	@FindBy(id = Login_Interface.submitbtn)
	private WebElement submitbtn;
	
	@FindBy(xpath = Login_Interface.verifybtn)
	private WebElement verifybtn;



}
