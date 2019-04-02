package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightPage
{
	WebDriver driver;
	@FindBy(xpath= "//*[@id='root']/div/div[2]/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input")
	//input[@placeholder='From']	
	public WebElement fromCity;
	
	
	
	
	@FindBy(xpath="//*[@id='react-autowhatever-1-section-0-item-0']/div/div[1]")
	public WebElement firstElement;
	
	@FindBy(xpath="//input[@placeholder='To']")
	WebElement toCity;
	
	@FindBy(xpath="")
	WebElement departureDate;
	
	@FindBy(xpath="")
	WebElement searchButton;
	
	@FindBy(xpath="")
	WebElement returnDate;
	
	@FindBy(xpath="")
	WebElement oneWay;
	
	//List<WebElement> list = new List();
	
	
	
	public FlightPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getFromCity()
	{
		return fromCity;
	}
	public WebElement getFirstElement()
	{
		return firstElement;
	}
	
    public WebElement getToCity()
    {
    	return toCity;
    }
    public WebElement getDepartureDate()
    {
    	return departureDate;
    }
    public WebElement getSearchButton()
    {
    	return searchButton;
    }
    public WebElement getReturnDate()
    {
    	return returnDate;
    }
    
    
}
