package Module1_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabHomePage
{
	//1:Initialization
 @FindBy(xpath="//div[@class='bm-burger-button']")	private WebElement menu;
 
   WebDriver driver;
 //2:declaration
 public SwagLabHomePage(WebDriver driver)
 {
	this.driver=driver;
	 PageFactory.initElements(driver, this);
	//globalVariable=localVariable -> assign local driver info into global driver
	 
 }
 public void verifySwagLabHomePageTitle(String ExpTitle ) 
 {
	 String ActTitle = driver.getTitle();
	 if(ActTitle.equals(ExpTitle))
	 {
		 System.out.println("pass");		 
	 }
	 else
	 {
		 System.out.println("Fail");	 
	 }
	
}
 public String getSwagLabHomePageTitle() 
 {
	String ActTitle = driver.getTitle();
	return ActTitle;
   

 }
 public void clickSwagLabHomePagemenuBtn() 
 {
	menu.click();
 }
 

}
