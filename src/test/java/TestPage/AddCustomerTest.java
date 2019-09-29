package TestPage;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.TestBase;
import TestUtile.ExcelRead;
import pages.Addcustomer;

public class AddCustomerTest extends TestBase {

	Addcustomer cust;
	String sheetName = "Sheet1";

	public AddCustomerTest() {
		super();
	}

	@BeforeClass
	public void setup() throws Exception {
		initilization();
		cust = new Addcustomer();

	}

	@Test(dataProvider = "getTestData")
	public void Addcustomer(String first, String second, String third) {
		cust.AddCustomerData(first, second, third);
		System.out.println("Add Data");
	}

	@DataProvider
	public Object[][] getTestData() throws InvalidFormatException {
		Object data[][] = ExcelRead.getTestData(sheetName);
		System.out.println(data);
		return data;
	}

}
