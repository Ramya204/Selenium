package selenium.maven.selFrameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExecutableClass extends BaseClass{

	public static WebDriver driver=null;
	
	public static void main(String[] args) {
		driver=launchBrowser("https://www.facebook.com/");
		Locators loc=new Locators();
		inputData(loc.getUsername(), "Ramza123");
		inputData(loc.getPassword(),"12345");
		inputData(loc.getFirstname(), "Ramya");
		inputData(loc.getLastname(), "ZamZam");
		inputData(loc.getNewPassword(), "bazinga");
		inputData(loc.getRegEmail(), "ramza@gmail.com");
		dropDown(loc.getDay(), 1);
		dropDown(loc.getMonth(), 1);
		dropDown(loc.getYear(), 1);
		clickButton(loc.getFemale());
		clickButton(loc.getButton());
		closePage(driver);

	}

}
