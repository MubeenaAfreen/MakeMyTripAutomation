package busBooking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FlightPage;
import utils.ConfigFileReader;

public class BookABusTest 
{
	WebDriver driver;
	ConfigFileReader configFileReader = new ConfigFileReader();
	FlightPage flightPage;
	@BeforeTest
	public void setUpBrowser()
	{
		System.setProperty("webdriver.chrome.driver", configFileReader.getDriverPath());				
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = configFileReader.getApplicationUrl();
		driver.get(url);
		flightPage = new FlightPage(driver);
	}
	
	@Test
	public void searchAFlight()
	{
	
	}

}