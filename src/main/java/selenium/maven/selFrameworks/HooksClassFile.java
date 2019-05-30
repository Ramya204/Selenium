package selenium.maven.selFrameworks;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HooksClassFile {
WebDriver driver;
String Url;
//commented because it interferes with AdactinBookings.java
/*	@Before
	public void launchBrowser(){
		System.setProperty("webdriver.chrome.driver", "/Selenium/SeleniumTest/driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}*/

	@Given("^User get the Url and Title$")
	public void user_get_the_Url_and_Title() {
	Url= driver.getCurrentUrl();
	String title = driver.getTitle();
	System.out.println("Current Url"+Url);
	System.out.println("Title"+title);
}

	@When("^User enters name$")
	public void user_enters_name() {
	driver.findElement(By.id("email")).sendKeys("cucumber");
}

	@When("^User enters pass$")
	public void user_enters_pass() {
	driver.findElement(By.id("pass")).sendKeys("122334455667788990");
}

	@When("^User click login button$")
	public void user_click_login_button(){
	WebElement button=driver.findElement(By.id("loginbutton"));
	button.click();
}
	@Then("^User check navigation to correct url$")
	public void user_check_navigation_to_correct_url() {
    if(Url.contains("attempt")){
    	System.out.println("expected URL");
    }
    else{
    	System.out.println("Unexpected URL");
    }
}
	//commented because it interferes with AdactinBookings.java
/*	@After
	public void closeBrowser(){
	driver.close();
}*/
}


