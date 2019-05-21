package selenium.maven.selFrameworks;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FacebookTest extends BaseClass{
public static WebDriver driver=null;
Locators loc=new Locators();
@ BeforeClass
public static void beforeClass(){
driver=BaseClass.launchBrowser("https://www.facebook.com/");
}
@AfterClass
public static void afterClass(){
	BaseClass.closePage(driver);
	
}

@Before
public void startTime(){
	Date d=new Date();
	System.out.println(d);
	
}

@After
public void endTime(){
	Date d=new Date();
	System.out.println(d);
}

/*@Test
public void logic(){
	Locators loc=new Locators();
	inputData(loc.getUsername(), "Ramza12345");
	inputData(loc.getPassword(),"12345");
	inputData(loc.getFirstname(), "Ramya");
	inputData(loc.getLastname(), "ZamZam");
	inputData(loc.getNewPassword(), "bazinga");
	inputData(loc.getRegEmail(), "ramza@gmail.com");
	dropDown(loc.getDay(), 1);
	dropDown(loc.getMonth(), 1);
	dropDown(loc.getYear(), 1);
	clickButton(loc.getFemale());
	clickButton(loc.getMale());
	clickButton(loc.getButton());
	
}*/
@Test
public void aLoginDetails(){
	inputData(loc.getUsername(), "Ramza12345");
	inputData(loc.getPassword(),"12345");
}

@Test
public void bCreateAccount(){
	inputData(loc.getFirstname(), "Ramya");
	inputData(loc.getLastname(), "ZamZam");
	inputData(loc.getNewPassword(), "bazinga");
	inputData(loc.getRegEmail(), "ramza@gmail.com");
	dropDown(loc.getDay(), 1);
	dropDown(loc.getMonth(), 1);
	dropDown(loc.getYear(), 1);
	clickButton(loc.getFemale());
	clickButton(loc.getMale());
}

@Test
public void cLogInButton(){
	clickButton(loc.getButton());
}
}

