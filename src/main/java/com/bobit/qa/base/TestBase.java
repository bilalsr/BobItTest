package com.bobit.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.imageio.IIOException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.bobit.qa.util.TestUtil;
import com.bobit.qa.util.WebEventListener;
// author: Bill
public class TestBase {
	
	public static WebDriver driver; // import org.openqa.selenium.WebDriver;
	public static Properties prop;
	public  static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	
	public TestBase() throws IOException  {
		//base classa ait constructor olusturuyoruz
		
		try {
			prop = new Properties();
			
			FileInputStream ip = new FileInputStream("C:\\Users\\ASUS\\eclipse-workspace\\BobItTest\\src\\main\\java\\com\\bobit\\qa\\config\\config.properties");
			prop.load(ip);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IIOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void initialization() throws IOException {
		
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Java\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		
		e_driver = new EventFiringWebDriver(driver);
		// Now create object of EventListerHandler to register it with EventFiringWebDriver
		eventListener = new WebEventListener();
		e_driver.register(eventListener);
		driver = e_driver;
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);//util paketinin altina yaptigimiz clasda zamani global hale getirdik
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS); //util paketinin altina yaptigimiz clasda zamani global hale getirdik
		
		driver.get(prop.getProperty("url"));
		
		
		
		
	}

}
