package selenium.maven.selFrameworks;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinLocators extends AdactinBase{

	public AdactinLocators()
	{
		PageFactory.initElements(driver, this);
	}
@FindBy (id="username")
private WebElement username;

public WebElement getUsername() {
	return username;
}

public WebElement getPassword() {
	return password;
}

public WebElement getLogin() {
	return login;
}

public WebElement getLocation() {
	return location;
}

public WebElement getHotels() {
	return hotels;
}

public WebElement getRoom_type() {
	return room_type;
}

public WebElement getRoom_nos() {
	return room_nos;
}

public WebElement getDatepick_in() {
	return datepick_in;
}

public WebElement getDatepick_out() {
	return datepick_out;
}

public WebElement getAdult_room() {
	return adult_room;
}

public WebElement getChild_room() {
	return child_room;
}

public WebElement getSubmit() {
	return Submit;
}

public WebElement getRadiobutton_0() {
	return radiobutton_0;
}

public WebElement getContinuee() {
	return continuee;
}

public WebElement getFirst_name() {
	return first_name;
}

public WebElement getLast_name() {
	return last_name;
}

public WebElement getAddress() {
	return address;
}

public WebElement getCc_num() {
	return cc_num;
}

public WebElement getCc_type() {
	return cc_type;
}

public WebElement getCc_exp_month() {
	return cc_exp_month;
}

public WebElement getCc_exp_year() {
	return cc_exp_year;
}

public WebElement getCc_cvv() {
	return cc_cvv;
}

public WebElement getBook_now() {
	return book_now;
}

public WebElement getOrder_no() {
	return order_no;
}

public WebElement getMy_itinerary() {
	return my_itinerary;
}

public WebElement getCheck_all() {
	return check_all;
}

public WebElement getCancelall() {
	return cancelall;
}

public WebElement getLogout() {
	return logout;
}
@FindBy (id="password")
private WebElement password;

@FindBy (id="login")
private WebElement login;

@FindBy (id="location")
private WebElement location;

@FindBy (id="hotels")
private WebElement hotels;

@FindBy (id="room_type")
private WebElement room_type;

@FindBy (id="room_nos")
private WebElement room_nos;

@FindBy (id="datepick_in")
private WebElement datepick_in;

@FindBy (id="datepick_out")
private WebElement datepick_out;

@FindBy (id="adult_room")
private WebElement adult_room;

@FindBy (id="child_room")
private WebElement child_room;

@FindBy (id="Submit")
private WebElement Submit;

@FindBy (id="radiobutton_0")
private WebElement radiobutton_0;

@FindBy (id="continue")
private WebElement continuee;

@FindBy (id="first_name")
private WebElement first_name;

@FindBy (id="last_name")
private WebElement last_name;

@FindBy (id="address")
private WebElement address;

@FindBy (id="cc_num")
private WebElement cc_num;

@FindBy (id="cc_type")
private WebElement cc_type;

@FindBy (id="cc_exp_month")
private WebElement cc_exp_month;

@FindBy (id="cc_exp_year")
private WebElement cc_exp_year;

@FindBy (id="cc_cvv")
private WebElement cc_cvv;

@FindBy (id="book_now")
private WebElement book_now;

@FindBy (id="order_no")
private WebElement order_no;

@FindBy (id="my_itinerary")
private WebElement my_itinerary;

@FindBy (id="check_all")
private WebElement check_all;

@FindBy (name="cancelall")
private WebElement cancelall;

@FindBy (id="logout")
private WebElement logout;
}
