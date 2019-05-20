package selenium.maven.selFrameworks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Locators {
	
public Locators()
{
	
	PageFactory.initElements(BaseClass.driver, this);
}
@FindBy (id="email")
private WebElement username;

@FindBy(id="pass")
private WebElement password;

@FindBy(id="loginbutton")
private WebElement button;

@FindBy(name="firstname")
private WebElement firstname;

@FindBy(name="lastname")
private WebElement lastname;

@FindBy(name="reg_email__")
private WebElement regEmail;

@FindBy(xpath="(//input[@type='password'])[2]")
private WebElement newPassword;

@FindBy(id="day")
private WebElement day;

@FindBy(id="month")
private WebElement month;

@FindBy(id="year")
private WebElement year;

@FindBy(id="u_0_9")
private WebElement female;

@FindBy(id="u_0_a")
private WebElement male;

public WebElement getFemale() {
	return female;
}

public WebElement getMale() {
	return male;
}

public WebElement getDay() {

	return day;
}

public WebElement getMonth() {
	return month;
}

public WebElement getYear() {
	return year;
}

public WebElement getUsername() {
	return username;
}

public WebElement getPassword() {
	return password;
}

public WebElement getButton() {
	return button;
}

public WebElement getFirstname() {
	return firstname;
}

public WebElement getLastname() {
	return lastname;
}

public WebElement getRegEmail() {
	return regEmail;
}

public WebElement getNewPassword() {
	return newPassword;
}



}
