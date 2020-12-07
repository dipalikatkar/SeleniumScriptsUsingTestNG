package com.orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {
	
	WebDriver driver;
	void openBrowser() {
		//open the browser window		
		System.setProperty("webdriver.chrome.driver", "E:\\onlinefeb2020\\ASDM\\chromedriver.exe");//selenium site download driver of chrome
		 driver=new ChromeDriver();								
	}
	void enterUrl() {
		//pass the url
		 driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
	}
	void login() {
		
		 //locate the username element and pass text data into it
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");//By -->class
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		
	}

	public static void main(String[] args) {
			
		SeleniumDemo sd=new SeleniumDemo();
		sd.openBrowser();
		sd.enterUrl();
		sd.login();
	

	}

}
