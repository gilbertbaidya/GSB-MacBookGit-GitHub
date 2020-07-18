package June_28_2020_ClassAssignment.FB;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

public class ClassAssignment_June28_2020 {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		browser("firefox", "https://google.com");
		
		WebElement FirstName = driver.findElement(By.xpath("//*[contains (@name, 'firstname')]"));
		FirstName.sendKeys("Gilbert");
	//	Thread.sleep(1000);
		
		WebElement LastName = driver.findElement(By.xpath("//*[contains (@name, 'lastname')]"));
		LastName.sendKeys("Baidya");
	//	Thread.sleep(1000);
		
		WebElement EmailID = driver.findElement(By.xpath("//*[contains (@name, 'reg_email__')]"));
		EmailID.sendKeys("tilbert.baidya.tester@gmail.com");
	//	Thread.sleep(2000);
		
		WebElement ReEmailID = driver.findElement(By.xpath("//*[contains (@name, 'reg_email_confirmation__')]"));
		ReEmailID.sendKeys("tilbert.baidya.tester@gmail.com");
	//	Thread.sleep(2000);
		
		WebElement NewPassword = driver.findElement(By.xpath("//*[contains (@name, 'reg_passwd__')]"));
		NewPassword.sendKeys("JoyJishu");
	//	Thread.sleep(2000);
		
		WebElement NewBirthMonth = driver.findElement(By.xpath("//*[contains (@name, 'birthday_month')]"));
		Select MonthIndex = new Select(NewBirthMonth);
	//	Thread.sleep(2000);
		MonthIndex.selectByIndex(11);
		
		WebElement NewBirthDate = driver.findElement(By.xpath("//*[contains (@name, 'birthday_day')]"));
		Select DateIndex = new Select(NewBirthDate);
	//	Thread.sleep(2000);
		DateIndex.selectByIndex(23);
		
		WebElement NewBirthYear = driver.findElement(By.xpath("//*[contains (@name,'birthday_year')]"));
		Select YearIndex = new Select(NewBirthYear);
	//	Thread.sleep(1000);
		YearIndex.selectByVisibleText("1983");
		
		WebElement RadioButton = driver.findElement(By.xpath("//*[contains (@id, 'u_0_7')]"));
		RadioButton.click();
	//	Thread.sleep(1000);
		
		WebElement SignUpButton = driver.findElement(By.xpath("//*[contains (@name, 'websubmit')]"));
		SignUpButton.click();
		Thread.sleep(1000);
		
		//driver.navigate().back();
		//driver.get("https://facebook.com");
		
		WebElement Log_in_field = driver.findElement(By.xpath("//*[contains (@data-testid, 'royal_email')]"));
		Log_in_field.sendKeys("tilbert.baidya.tester@gmail.com");
		
		WebElement Log_in_pass = driver.findElement(By.xpath("//*[contains (@data-testid, 'royal_pass')]"));
		Log_in_pass.sendKeys("HijiBiji");
	//	Thread.sleep(2000);
		
		WebElement Login_Button = driver.findElement(By.xpath("//*[contains(@data-testid, 'royal_login_button' )]"));
		Login_Button.click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		WebElement Forgot_ac_Link = driver.findElement(By.linkText("Forgot account?"));
		Forgot_ac_Link.click();
		Thread.sleep(2000);
		driver.quit();
		
		
	}

	public static void browser (String browser, String url) throws InterruptedException {

		if (browser.equalsIgnoreCase("edge")) {

			System.setProperty("webdriver.edge.driver", "/Volumes/George/Selenium Browser Drivers/June 27 2020 Driver DL/msedgedriver 2");
			driver = new EdgeDriver();
			driver.get(url);
			System.out.println(driver.getTitle());
			driver.manage().window().maximize();
			driver.get("https://fb.com");
			Thread.sleep(3000);
			System.out.println(driver.getTitle());
			driver.close();
			driver.quit();

		}	else if (browser.equalsIgnoreCase("safari")) {

			driver = new SafariDriver();
			driver.get(url);
			Thread.sleep(3000);
			System.out.println(driver.getTitle());
			driver.manage().window().maximize();
			driver.get("https://fb.com");
			Thread.sleep(3000);
			System.out.println(driver.getTitle());
			driver.close();
			driver.quit();
		
		}	else if (browser.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver", "/Volumes/George/Selenium Browser Drivers/June 27 2020 Driver DL/geckodriver 3");
			driver = new FirefoxDriver();
			driver.get(url);
			Thread.sleep(3000);
			System.out.println(driver.getTitle());
			driver.manage().window().maximize();
			driver.get("https://fb.com");
			Thread.sleep(3000);
			System.out.println(driver.getTitle());
			//driver.close();
			//driver.quit();
		} else if (browser.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "/Volumes/George/Selenium Browser Drivers/June 27 2020 Driver DL/chromedriver 5");
			driver = new ChromeDriver();
			driver.get(url);
			Thread.sleep(3000);
			System.out.println(driver.getTitle());
			driver.manage().window().maximize();
			driver.get("https://fb.com");
			Thread.sleep(3000);
			System.out.println(driver.getTitle());
			//driver.close();
			//driver.quit();
		} else {
			
			System.out.println("Wrong Browser Selection!");
		}
		

		
	}

}
