package bookAFlight;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FlightPage;
import utils.ConfigFileReader;

public class OnewayFlightBookTest
{
	ConfigFileReader configFileReader = new ConfigFileReader();
	FlightPage flightPage;
	@BeforeTest
	public void setUpBrowser()
	{
		System.setProperty("webdriver.chrome.driver", configFileReader.getDriverPath());				
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = configFileReader.getApplicationUrl();
		driver.get(url);
		flightPage = new FlightPage(driver);
	}
	
	@Test
	public void searchAFlight()
	{
		WebElement fromCity = flightPage.getFromCity();
		fromCity.sendKeys("Mumbai");
		fromCity.click();
	}

}
