package com.seleniumtask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IPT_Task {

	static WebDriver driver;	
	public static void login() {
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://gor-pathology.web.app/");
	}
	

	
	public static void main(String[] args) {
		login();
	}
}
