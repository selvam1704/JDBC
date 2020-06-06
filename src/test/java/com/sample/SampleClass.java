package com.sample;

import java.sql.SQLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.base.LibGlobal;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleClass extends LibGlobal {
	public static void main(String[] args) throws SQLException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys(getData("username"));
		driver.findElement(By.id("pass")).sendKeys(getData("password"));
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}

}
