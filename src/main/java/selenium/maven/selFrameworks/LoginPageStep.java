package selenium.maven.selFrameworks;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
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
	
	//+++++++++++++++++++++++++++++++++++++pass arguments as Map++++++++++++++++++++++++++++++++++++++++++	
	@When("^User enters username$")
	public void user_enters_username(DataTable user) {
		Map<String,String> map = user.asMap(String.class,String.class);
	driver.findElement(By.id("email")).sendKeys(map.get("aaaa"));
	}
	
	@When("^User enters password$")
	public void user_enters_password(DataTable pass) {
		Map<String,String> map = pass.asMap(String.class,String.class);
		driver.findElement(By.id("pass")).sendKeys(map.get("eeee"));
	}
	
	//+++++++++++++++++++++++++++++++++++++pass arguments as List++++++++++++++++++++++++++++++++++++++++++	
	/*@When("^User enters username$")
	public void user_enters_username(DataTable user) {
		List<String> list = user.asList(String.class);
	driver.findElement(By.id("email")).sendKeys(list.get(1));
	}
	
	@When("^User enters password$")
	public void user_enters_password(DataTable pass) {
		List<String> list = pass.asList(String.class);
		driver.findElement(By.id("pass")).sendKeys(list.get(3));
	}*/
	
	//+++++++++++++++++++++++++++++++++++++pass arguments as List of list++++++++++++++++++++++++++++++++++++++++++	
	/*@When("^User enters username$")
	public void user_enters_username(DataTable user) {
		List<List<String>> list = user.asLists(String.class);
	driver.findElement(By.id("email")).sendKeys(list.get(1).get(1));
	}
	
	@When("^User enters password$")
	public void user_enters_password(DataTable pass) {
		List<List<String>> list = pass.asLists(String.class);
		driver.findElement(By.id("pass")).sendKeys(list.get(0).get(0));
	}*/
	
	//+++++++++++++++++++++++++++++++++++++pass arguments as List of map++++++++++++++++++++++++++++++++++++++++++
/*		@When("^User enters username$")
		public void user_enters_username(DataTable user) {
			List<Map<String,String>> map = user.asMaps(String.class, String.class);
		driver.findElement(By.id("email")).sendKeys(map.get(0).get("u1"));
		}
		
		@When("^User enters password$")
		public void user_enters_password(DataTable pass) {
			List<Map<String,String>> map = pass.asMaps(String.class, String.class);
			driver.findElement(By.id("pass")).sendKeys(map.get(0).get("p2"));
		}*/
	
//+++++++++++++++++++++++++++++++++++++pass arguments from feature file++++++++++++++++++++++++++++++++++++++++++
/*	@When("^User enters username \"([^\"]*)\"$")
	public void user_enters_username(String user) {
		driver.findElement(By.id("email")).sendKeys(user);
	}

	@When("^User enters password \"([^\"]*)\"$")
	public void user_enters_password(String pass) {
		driver.findElement(By.id("pass")).sendKeys(pass);
	}*/
/*	@When("^User enters username$")
	public void user_enters_username() {
		WebElement email= driver.findElement(By.id("email"));
		email.sendKeys("Ramya");
	}
	@When("^User enters password$")
	public void user_enters_password() {
		WebElement pass=driver.findElement(By.id("pass"));
		pass.sendKeys("password");
	}*/
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
