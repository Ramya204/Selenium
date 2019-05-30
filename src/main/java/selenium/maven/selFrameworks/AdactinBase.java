package selenium.maven.selFrameworks;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdactinBase {
	public static WebDriver driver=null;
	public static Select selected;
public static String LaunchBrowser(String url){
	System.setProperty("webdriver.chrome.driver", "C:/Selenium/chromedriver/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	return url;
}
public static void sendKeysValue(WebElement element,String str){
	element.sendKeys(str);
}
public static void click(WebElement element){
	element.click();
}
public static void dropdownValue(WebElement element,String value) {
	selected=new Select(element);
		selected.selectByValue(value);
	}
public static void dropdownIndex(WebElement element,Integer value) {
	selected=new Select(element);
		selected.selectByIndex(value);
	}

public static void robotClass(){
	Robot r;
	try {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
	} catch (AWTException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public static void getText(WebElement element){
	String text = element.getAttribute("value");
	System.out.println("order id is"+text);
}
public static void alertWindow(){
	Alert alert=driver.switchTo().alert();
	alert.accept();
}
public static void closeBrowser(){
	driver.quit();
}
}

