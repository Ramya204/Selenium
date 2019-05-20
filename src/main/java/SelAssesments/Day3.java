package SelAssesments;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day3 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Selenium/SeleniumTest/driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		WebElement message= driver.findElement(By.xpath("//*[contains(text(),'Always')]"));
		System.out.println(message.getText());
		driver.findElement(By.xpath("//strong[text()='Partial Link Test']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Ramya");
		driver.findElement(By.name("lastname")).sendKeys("R");
		Date date = new Date();  
	    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
	    String strDate= formatter.format(date); 
		driver.findElement(By.id("datepicker")).sendKeys(strDate);
		
		//RADIOBUTTON
		WebElement sex=driver.findElement(By.id("sex-1"));
		sex.click();
		System.out.println("gender is selected:"+sex.getAttribute("value")+sex.isSelected());
		WebElement exp=driver.findElement(By.id("exp-4"));
		exp.click();
		System.out.println("number of experience"+exp.getAttribute("value")+exp.isSelected());
	    
		//CHECKBOX
		driver.findElement(By.id("profession-1")).click();
		driver.findElement(By.id("tool-2")).click();
		
		//UPLOAD FILE
		driver.findElement(By.id("photo")).sendKeys("C:\\Users\\habib\\Desktop\\aaa.png");
		
		//DROP DOWN SELECT SINGLE VALUE
		WebElement cont=driver.findElement(By.id("continents"));
		Select s=new Select(cont);
		System.out.println("can we select many"+s.isMultiple());
		s.selectByIndex(1);
		
		//DROP DOWN SELECT MULTIPLE VALUEs
		WebElement comm=driver.findElement(By.id("selenium_commands"));
		Select se=new Select(comm);
		System.out.println("can we select many"+se.isMultiple());
		List<WebElement> options = se.getOptions();
		for (WebElement web : options) {
			String str=web.getText();
			System.out.println("List of options:"+str);
			if(str.equals("Browser Commands")||(str.equals("WebElement Commands"))){
				se.selectByVisibleText(str);
			}
		}
			List<WebElement> allSelectedOptions = se.getAllSelectedOptions();
			for (WebElement webE : allSelectedOptions) {
				System.out.println("List of selected options:"+webE.getText());
			}
			String text = se.getFirstSelectedOption().getText();
			System.out.println("first selected option:"+text);
			Thread.sleep(1000);
			se.deselectByVisibleText(text);
		
	}

}
