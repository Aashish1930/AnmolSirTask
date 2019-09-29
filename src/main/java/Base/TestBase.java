package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.log4testng.Logger;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;

	public TestBase() {

		try {
			prop = new Properties();

			FileInputStream f = new FileInputStream("E:\\code\\temp\\src\\main\\java\\config\\config.properties");
			prop.load(f);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void initilization() throws Exception {

		if (prop.getProperty("browser").equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"E:\\selenium\\firefox update driver\\geckodriver-v0.24.0-win32\\geckodriver.exe");
			driver = new FirefoxDriver();
			System.out.println("Firefox is Load");

		} else if (prop.getProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\selenium\\ChromeUpdate-76\\chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("Load chrome");

		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.way2automation.com/angularjs-protractor/banking/#/manager/addCust");

	}

}
