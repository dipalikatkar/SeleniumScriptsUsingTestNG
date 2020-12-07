package com.orangehrmlive;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class DataProviderTest {
  @Test(dataProvider = "dpTest")
  public void f(String uname,String pass) 
  {
	  System.out.println("Username :"+uname);
	  System.out.println("Password :"+pass);
	  
	  System.setProperty("webdriver.chrome.driver", "E:\\prasaddata\\ASDM\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

		driver.findElement(By.name("txtUsername")).sendKeys(uname);
		driver.findElement(By.id("txtPassword")).sendKeys(pass);
		driver.findElement(By.name("Submit")).click();

  }

  @DataProvider(name="dpTest")
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "test","test123" },
      new Object[] { "Admin","admin123" },
    };
  }
}
