package selenium.maven.selFrameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageStep {
	WebDriver driver;
	@Given("^User launches the facebook application$")
	public void user_launches_the_facebook_application() {
		System.setProperty("webdriver.chrome.driver", "/Selenium/SeleniumTest/driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

	@When("^User enters username$")
	public void user_enters_username() {
		WebElement email= driver.findElement(By.id("email"));
		email.sendKeys("Ramya");
	}

	@When("^User enters password$")
	public void user_enters_password() {
		WebElement pass=driver.findElement(By.id("pass"));
		pass.sendKeys("password");
	}

	@When("^User clicks login button$")
	public void user_clicks_login_button() {
		WebElement button=driver.findElement(By.id("loginbutton"));
		button.click();
	}

	@Then("^User checks navigation to correct url$")
	public void user_checks_navigation_to_correct_url() {
	    String Url = driver.getCurrentUrl();
	    if(Url.contains("attempt")){
	    	System.out.println("expected URL");
	    }
	    else{
	    	System.out.println("Unexpected URL");
	    }
	}

	@Then("^User closes browser$")
	public void user_closes_browser() {
		driver.quit();
	}


}
