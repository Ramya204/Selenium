package selenium.maven.selFrameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;

public class AdactinBookings extends AdactinBase{
	public static AdactinLocators l;
@Before
public void launchAdactinBrowser(){
	LaunchBrowser("http://www.adactin.com/HotelApp/index.php");
}

@After
public void closeAdactinBrowser(){
	closeBrowser();
}

@Given("^user enters username and password and logs in \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_enters_username_and_password_and_logs_in_and(String user, String pass) {
	l=new AdactinLocators();
	sendKeysValue(l.getUsername(), user);
	sendKeysValue(l.getPassword(), pass);
	click(l.getLogin()); 
    
}

@Given("^user enters location hotel roomtype roomno \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"$")
public void user_enters_location_hotel_roomtype_roomno_and(String loc, String hotel, String type, String no) {
	dropdownValue(l.getLocation(), loc);
	dropdownValue(l.getHotels(),hotel );
	dropdownValue(l.getRoom_type(), type);
	dropdownValue(l.getRoom_nos(), no);
    
}

@When("^also enters indate outdate adults childrens and submits \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"$")
public void also_enters_indate_outdate_adults_childrens_and_submits_and(String in, String out, String adult, String child) {
	click(l.getDatepick_in());
	robotClass();
	sendKeysValue(l.getDatepick_in(), in);		
	click(l.getDatepick_out());
	robotClass();
	sendKeysValue(l.getDatepick_out(), out);			
	dropdownValue(l.getAdult_room(), adult);			
	dropdownValue(l.getChild_room(), child);			
	click(l.getSubmit());
    
}

@When("^enters fname lname and address \"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"$")
public void enters_fname_lname_and_address_and(String fname, String lname, String address) {
	click(l.getRadiobutton_0());
	click(l.getContinuee());
	sendKeysValue(l.getFirst_name(), fname);
	sendKeysValue(l.getLast_name(), lname);
	sendKeysValue(l.getAddress(), address);
	
}

@When("^also enters cardno cardtype expmonth expyear cvv and books \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"$")
public void also_enters_cardno_cardtype_expmonth_expyear_cvv_and_books_and(String card, String type, String mon, String yr, String cvv) {
	sendKeysValue(l.getCc_num(), card);
	dropdownValue(l.getCc_type(), type);
	dropdownValue(l.getCc_exp_month(), mon);
	dropdownValue(l.getCc_exp_year(), yr);
	sendKeysValue(l.getCc_cvv(), cvv);
	click(l.getBook_now());
    
}

@Then("^prints booking id and clicks itenary$")
public void prints_booking_id_and_clicks_itenary() {
    
	WebDriverWait explicitWait=new WebDriverWait(driver, 20000);
	WebElement orderNumber=explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("order_no")));
	String attribute = orderNumber.getAttribute("value");
	System.out.println("Your booking Id is: "+attribute);
	click(l.getMy_itinerary());			
	
}

@Then("^user selects all the bookins and cancel it$")
public void user_selects_all_the_bookins_and_cancel_it() {
	click(l.getCheck_all());			
	click(l.getCancelall());			
	alertWindow();			
	l.getLogout().click();
    
}


}
