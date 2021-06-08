package com.cyient.dynamic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RoyalSignTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.get("https://www.royalcaribbean.com/account/create");
		  driver.findElement(By.xpath("//input[@data-placeholder='First name/Given name']")).sendKeys("Daniel");
		  driver.findElement(By.xpath("//input[@data-placeholder='Last name/Surname']")).sendKeys("Richardson");
          driver.findElement(By.xpath("//span[text()='Month']")).click();
          driver.findElement(By.xpath("//span[text()=' July ']")).click();
          driver.findElement(By.xpath("//span[text()='Day']")).click();
          driver.findElement(By.xpath("//span[text()=' 5 ']")).click();
          driver.findElement(By.xpath("//input[@data-placeholder='Year']")).sendKeys("2020");
          //driver.findElement(By.xpath("//span[text()='Year']")).sendKeys("2020");
        //tagname[contains(text(),'')]
          //driver.findElement(By.xpath("//span[text()='Country/Region of residence']")).click();
          //driver.findElement(By.xpath("//span[contains(text(),'Country/Region of residence']")).click();
          driver.findElement(By.xpath("//span[text()='Country/Region of residence']")).click();
          driver.findElement(By.xpath("//span[text()=' India ']")).click();
          Thread.sleep(3000);
          driver.findElement(By.xpath("//input[@data-placeholder='Email address']")).sendKeys("den@gmail.com");
          driver.findElement(By.xpath("//input[@data-placeholder='Create new password']")).sendKeys("den011111");
         driver.findElement(By.xpath("//span[text()='Select one security question']")).click();
         driver.findElement(By.xpath("//span[text()=' What was your first car's make or model? ']")).click();
         driver.findElement(By.xpath("//input[@data-placeholder='Answer']")).sendKeys("al");
         driver.findElement(By.xpath("//input[@type='checkbox']/..")).click();
         driver.findElement(By.xpath("//button[text()=' Done ']")).click();
         
	}

}


//Navigate onto https://www.royalcaribbean.com/account/create
	//First Name as Daniel 
	//Last Name as Richardson
	//Select Month as July 
	//Day as 5
	//Year as 2020
	//Country as India
	//Any email address and password 
	//Select as “What was your first car's make or model?”
	//Type answer 
	//Accept the terms and condition 
	//Click done
