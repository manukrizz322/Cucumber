package com.helper.automation.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;



public class Configuration_Reader {
	
	public Properties p;
	
	
	public Configuration_Reader() throws IOException {
		File fi= new File("C:\\Users\\Manojkrishnan\\eclipse-workspace\\Cucumber\\src\\main\\java\\com\\properties\\Automation_Practice.properties");
		FileInputStream fis = new FileInputStream(fi);
		 p = new Properties();
         p.load(fis);
	}
	
	public String getchrome() {
		String property = p.getProperty("chrome");
		return property;

	}
public String geturl() {
	String property = p.getProperty("url");
	return property;

}
public String getEmail() {
	String property = p.getProperty("email");
	return property;

}
public String getPassword() {
	String property = p.getProperty("password");
	return property;

}
public String getscrollby() {
	String property = p.getProperty("scrollby");
	return property;

}
public String getscrollinto() {
	String property = p.getProperty("scrollinto");
	return property;

}
public String getwindowscroll() {
	String property = p.getProperty("windowscroll");
	return property;

}
public String getmovetoelement() {
	String data = p.getProperty("movetoelement");
return data;

}
public String getclick() {
	String data = p.getProperty("click");
return data;
}









}
