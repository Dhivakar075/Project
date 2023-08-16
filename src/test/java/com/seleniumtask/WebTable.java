package com.seleniumtask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.mavenproject.Project_class.Base_Class;

public class WebTable extends Base_Class {

	public static void readAllData() {
		browserLaunch("chrome");
		getUrl("https://www.dezlearn.com/webtable-example/");
		WebElement table = driver.findElement(By.xpath("//table[@class='tg']"));
		System.out.println(table.getText());
		
	}
	
	public static void rangeOfData() {
		browserLaunch("chrome");
		getUrl("https://www.dezlearn.com/webtable-example/");
		WebElement table = driver.findElement(By.xpath("//table//tr/td[2]"));
		table.getText();
	}
	
	public static void main(String[] args) {
		rangeOfData();
		
	}

}
