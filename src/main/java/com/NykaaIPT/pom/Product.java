package com.NykaaIPT.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.NykaaIPT.base.Base_Class;


public class Product extends Base_Class {
	
	public Product() {
		PageFactory.initElements(driver,this);
	}

	public WebElement getMombabytab() {
		return mombabytab;
	}

	public WebElement getPowderbtn() {
		return powdertab;
	}

	public WebElement getPowder() {
		return powder;
	}

	@FindBy(xpath = Product_Interface.mombabytab)
	private WebElement mombabytab;
	
//		a.moveToElement(mombabytab).build().perform();
		
	@FindBy(xpath = Product_Interface.powdertab)
	private	WebElement powdertab;

//	a.click(powderbtn).build().perform();
//		Thread.sleep(3000);
		
//		r.keyPress(KeyEvent.VK_PAGE_DOWN);

	//Window Handles
		
//		Set<String> windowHandles = driver.getWindowHandles();
//		for (String string : windowHandles) {
//			driver.switchTo().window(string);
//		}
//		Thread.sleep(3000);

@FindBy(xpath = Product_Interface.powder)
private	WebElement powder;

//		a.click(powder).build().perform();
//	Thread.sleep(4000);
		


}