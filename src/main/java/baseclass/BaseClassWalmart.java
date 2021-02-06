package baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.WalmartUtility.UlilityWalmart;
import com.WalmartUtility.WalmartWebEventListener;



public class BaseClassWalmart {

	public static WebDriver driver;
	public static Properties prop;
	public  static EventFiringWebDriver e_driver;
	public static WalmartWebEventListener eventListener;
	
	public BaseClassWalmart() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream ("C:\\Users\\Mayank Gohil\\eclipse-workspace\\Wlamart_Project\\src\\main\\java\\com\\environment\\config.properties");
			
			prop.load(ip);
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		}
	public static void  initialization() {
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\selenium testing related\\chromedriver.exe");
			 driver=new ChromeDriver();
		}else if(browserName.equals("Firefox")) {
		System.setProperty("webdriver.gecko.driver","C:\\selenium testing related\\geckodriver.exe");
			driver=new FirefoxDriver();}
		e_driver = new EventFiringWebDriver(driver);
		// Now create object of EventListerHandler to register it with EventFiringWebDriver
		eventListener = new WalmartWebEventListener();
		e_driver.register(eventListener);
		driver = e_driver;
		

		driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().pageLoadTimeout(UlilityWalmart.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(UlilityWalmart.IMPLICIT_WAIT, TimeUnit.SECONDS);
	    
	    driver.get(prop.getProperty("url"));
}

}
