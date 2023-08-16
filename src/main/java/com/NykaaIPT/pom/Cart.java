package com.NykaaIPT.pom;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.NykaaIPT.base.Base_Class;

public class Cart extends Base_Class {

public Cart() {
	PageFactory.initElements(driver, this);
}

public WebElement getDropdown() {
	return dropdown;
}

public WebElement getAddtobag() {
	return addtobag;
}

public WebElement getBag() {
	return bag;
}

public WebElement getFrame() {
	return frame;
}

public WebElement getQuant() {
	return quantity;
}

public WebElement getQuannos() {
	return quannos;
}

public WebElement getProceedbtn() {
	return proceedbtn;
}

@FindBy(css = Cart_Interface.dropdown )
private WebElement dropdown;


@FindBy(xpath = Cart_Interface.addtobag)
private WebElement addtobag;

@FindBy(xpath = Cart_Interface.bag)
private WebElement bag;

@FindBy(xpath = Cart_Interface.frame)
private WebElement frame;

@FindBy(xpath = Cart_Interface.quantity)
private WebElement quantity;

@FindBy(xpath = Cart_Interface.quantitynos)
private WebElement quannos;

@FindBy(xpath = Cart_Interface.proceedbtn)
private WebElement proceedbtn;



}
