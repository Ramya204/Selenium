package selenium.maven.selFrameworks;
import selenium.maven.selFrameworks.AdactinBase;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdactinExe extends AdactinBase {
	public static AdactinLocators l;
		public static void main(String[] args) throws InterruptedException, AWTException {
			
			//launch browser
			LaunchBrowser("http://www.adactin.com/HotelApp/index.php");
			
			//login page
			l=new AdactinLocators();
			sendKeysValue(l.getUsername(), "Pubg12345");
			sendKeysValue(l.getPassword(), "1234567890");
			click(l.getLogin());
			
			//user room select page
			dropdownValue(l.getLocation(), "Sydney");
			dropdownValue(l.getHotels(),"Hotel Creek" );
			dropdownValue(l.getRoom_type(), "Double");
			dropdownValue(l.getRoom_nos(), "1");			
			click(l.getDatepick_in());
			robotClass();
			sendKeysValue(l.getDatepick_in(), "07/06/2019");		
			click(l.getDatepick_out());
			robotClass();
			sendKeysValue(l.getDatepick_out(), "09/06/2019");			
			dropdownValue(l.getAdult_room(), "2");			
			dropdownIndex(l.getChild_room(), 0);			
			click(l.getSubmit());
			
			//user details and payment page
			click(l.getRadiobutton_0());
			click(l.getContinuee());
			sendKeysValue(l.getFirst_name(), "Pepper");
			sendKeysValue(l.getLast_name(), "potts");
			sendKeysValue(l.getAddress(), "Brittany");
			sendKeysValue(l.getCc_num(), "1234567890098765");
			dropdownValue(l.getCc_type(), "AMEX");
			dropdownValue(l.getCc_exp_month(), "2");
			dropdownValue(l.getCc_exp_year(), "2020");
			sendKeysValue(l.getCc_cvv(), "1122");
			click(l.getBook_now());
			
			//check itenary page
			WebDriverWait explicitWait=new WebDriverWait(driver, 20000);
			WebElement orderNumber=explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("order_no")));
			String attribute = orderNumber.getAttribute("value");
			System.out.println("Your booking Id is: "+attribute);
			click(l.getMy_itinerary());			
			click(l.getCheck_all());			
			click(l.getCancelall());			
			alertWindow();			
			l.getLogout().click();
			
			//close browser
			closeBrowser();
			}

	}


