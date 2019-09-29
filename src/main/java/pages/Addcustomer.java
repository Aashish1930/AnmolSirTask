package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class Addcustomer extends TestBase {

	
	public Addcustomer() {
		PageFactory.initElements(driver, this);

	}

	
	@FindBy(xpath="//button[@class='btn btn-default']")
	WebElement add;
	
	
	@FindBy(xpath="//input[@placeholder='First Name']")
	WebElement First;
	
	@FindBy(xpath="//input[@placeholder='Last Name']")
	WebElement Second;
	
	@FindBy(xpath="//input[@placeholder='Post Code']")
	WebElement Third;
	

	
	public void AddCustomerData(String first, String second, String third) {
		First.sendKeys(first);
		Second.sendKeys(second);
		Third.sendKeys(third);
		add.click();
		
	}

	
	
	
	
	
}
