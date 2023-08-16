package com.NykaaIPT.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.NykaaIPT.base.Base_Class;

public class Remove_ItemPom extends Base_Class {
	
	public Remove_ItemPom() {
	PageFactory.initElements(driver, this);
	}

	@FindBy(css = Remove_Interface.close)
	private WebElement close;	
	
	@FindBy(xpath = Remove_Interface.bagitem)
	private WebElement bagitem;
	
	@FindBy(xpath = Remove_Interface.editbtn)
	private WebElement editbtn;

	@FindBy(xpath = Remove_Interface.deletebtn)
	private WebElement deletebtn;
	
	@FindBy(xpath = Remove_Interface.removebtn)
	private WebElement removebtn;

	public WebElement getClose() {
		return close;
	}

	public WebElement getBagitem() {
		return bagitem;
	}

	public WebElement getEditbtn() {
		return editbtn;
	}

	public WebElement getDeletebtn() {
		return deletebtn;
	}

	public WebElement getRemovebtn() {
		return removebtn;
	}	
	
}
