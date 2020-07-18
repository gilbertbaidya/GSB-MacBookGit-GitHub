package com.test;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeMakesPerfect {
	
	public static WebDriver driver; 
	
	public static void main(String[] args) throws InterruptedException {
		
		browser("chrome", "url");
		
		WebElement Log_in_field = driver.findElement(By.xpath("//*[contains (@data-testid, 'royal_email')]"));
		Log_in_field.sendKeys("gilbert.baidya.tester@gmail.com");
		
		WebElement Log_in_pass = driver.findElement(By.xpath("//*[contains (@data-testid, 'royal_pass')]"));
		Log_in_pass.sendKeys("HijiBiji");
		Thread.sleep(2000);
		
		WebElement Login_Button = driver.findElement(By.xpath("//*[contains(@data-testid, 'royal_login_button' )]"));
		Login_Button.click();
		
		driver.navigate().back();
		
		WebElement Forgot_ac_Link = driver.findElement(By.linkText("Forgot account?"));
		Forgot_ac_Link.click();
		
	}
	
	public static void browser (String browser, String url) {
		
		System.setProperty("webdriver.chrome.driver", "/Volumes/George/Selenium Browser Drivers/June 27 2020 Driver DL/chromedriver 5");
		driver = new ChromeDriver();
		driver.get("https://fb.com");
	
		
	}

}
