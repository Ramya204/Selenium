package SelAssesments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day8Alerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Selenium/SeleniumTest/driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
		driver.manage().window().maximize();
		
//SIMPLE ALERT
		driver.findElement(By.xpath("//button[text()='Simple Alert']"))
		.click();
		Alert simple=driver.switchTo().alert();
		simple.accept();
		
		Thread.sleep(1000);
		
//CONFIRM ALERT
		driver.findElement(By.xpath("//button[text()='Confirm Pop up']"))
		.click();
		Alert confirm=driver.switchTo().alert();
		confirm.dismiss();
		
		Thread.sleep(1000);
		
//PROMPT ALERT
		driver.findElement(By.xpath("//button[text()='Prompt Pop up']"))
		.click();
		Alert prompt=driver.switchTo().alert();
		prompt.sendKeys("yes");
		prompt.accept();
	}

}
