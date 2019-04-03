package utils;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


@Test
public class DataProvider 
{
	 private String sTestCaseName;
	 
	 private int iTestCaseRow;
	 
	 WebDriver driver;
	 
	
	 
	  public void f(String sUserName, String sPassword) {
	 
	     driver.findElement(By.xpath(".//*[@id='account']/a")).click();
	 
	     driver.findElement(By.id("log")).sendKeys(sUserName);
	 
	 System.out.println(sUserName);
	 
	     driver.findElement(By.id("pwd")).sendKeys(sPassword);
	 
	 System.out.println(sPassword);
	 
	     driver.findElement(By.id("login")).click();
	 
	     System.out.println(" Login Successfully, now it is the time to Log Off buddy.");
	 
	     driver.findElement(By.xpath(".//*[@id='account_logout']/a")).click();
	 
	  }
	 
	 
	 // @DataProvider	 
	  public Object[][] Authentication() throws Exception
	  {	 	 
	   ExcelUtils.setExcelFile("TestData.xlsx","Sheet1");
	 
	 sTestCaseName = this.toString();
	 
	    sTestCaseName = ExcelUtils.getTestCaseName(this.toString());
	 
	   
	 iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,0);
	 
	     Object[][] testObjArray = ExcelUtils.getTableArray("TestData.xlsx","Sheet1",iTestCaseRow);
	 
	      return (testObjArray);
	 
	 }
}
	
	
