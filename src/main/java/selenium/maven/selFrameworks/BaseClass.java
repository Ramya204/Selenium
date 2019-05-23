package selenium.maven.selFrameworks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	public static WebDriver driver=null;
	
public static WebDriver launchBrowser(String url){
	System.setProperty("webdriver.chrome.driver", "C:/Selenium/chromedriver/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	return driver;
	
}
public static void inputData(WebElement e,String s)
{
e.sendKeys(s);	
}
public static void clickButton(WebElement  clk)
{
	clk.click();
}
public static void closePage(WebDriver driver)
{
	driver.quit();
}
public static void dropDown(WebElement sin,int index)
{
Select sel=new Select(sin)	;
sel.selectByIndex(index);
}

}
