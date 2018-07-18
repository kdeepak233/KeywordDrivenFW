package com.letzautomate.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
	
	public static void main(String[] args){
		
		String projPath = System.getProperty("user.dir");
		System.out.println(projPath);
		System.setProperty("webdriver.chrome.driver", projPath+"/src/test/resources/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	}

}
