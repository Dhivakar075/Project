package com.NykaaIPT.pom;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class NykaaProperties {

static FileInputStream fis;
static File file;

public static Properties getProp() {
	
file = new File("C:\\Users\\DELL\\eclipse-workspace\\dhivakar\\NykaaIPT\\src\\main\\java\\Nykaa.properties");

try {
	fis = new FileInputStream(file);
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

Properties prop = new Properties();
try {
	prop.load(fis);
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
return prop;
}

public String getBrowser() {
	String browser = getProp().getProperty("browser");
	return browser;
}

public String getUrl() {
	String url = getProp().getProperty("url");
	return url;
}

public String getMobNumber() {
	
	String mobno = getProp().getProperty("mobilenumber");
	return mobno;
}

public String getCardno() {
	String cardno = getProp().getProperty("cardno");
	return cardno;
}

public String getExpdate() {
	String expdate = getProp().getProperty("expdate");
	return expdate;
}
public String getCvv() {
	String cvv = getProp().getProperty("cvv");
	return cvv;
}



}
