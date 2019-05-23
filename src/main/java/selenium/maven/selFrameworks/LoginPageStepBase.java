package selenium.maven.selFrameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageStepBase{
public  WebDriver driver;
Locators loc;

	@Given("^User launches the facebook application from BaseClass method$")
	public  void user_launches_the_facebook_application_from_BaseClass_method() {
		driver=BaseClass.launchBrowser("https://www.facebook.com/");
	}
	@When("^User enters username from BaseClass method$")
	public void user_enters_username_from_BaseClass_method() {
		loc=new Locators();
	   BaseClass.inputData(loc.getUsername(), "Ramza123");
	}

	@When("^User enters password from BaseClass method$")
	public void user_enters_password_from_BaseClass_method() {
		
	   BaseClass.inputData(loc.getPassword(),"12345");
	}

	@When("^User clicks login button from BaseClass method$")
	public void user_clicks_login_button_from_BaseClass_method() {
		
		BaseClass.clickButton(loc.getButton());
	}

	@Then("^User checks navigation of URL$")
	public void user_checks_navigation_of_URL() {
		String Url = driver.getCurrentUrl();
	    if(Url.contains("attempt")){
	    	System.out.println("expected URL");
	    }
	    else{
	    	System.out.println("Unexpected URL");
	    }
	}

	@Then("^User closes browser from BaseClass method$")
	public void user_closes_browser_from_BaseClass_method() {
	   BaseClass.closePage(driver);
	}


}
