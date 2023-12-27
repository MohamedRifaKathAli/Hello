package com.Maven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static WebDriver browserLaunch(String URL) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohamed Rifakathali\\Downloads\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		driver.get(URL);
		return driver;
	}
	
	
	public static void keysToSend(WebElement ele,String input) {

		ele.sendKeys(input);
	}
	
	
	
	public static void clickElement(WebElement ele) {

		ele.click();
	}
	
	

}
