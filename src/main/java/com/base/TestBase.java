package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream ip=new FileInputStream("C:\\Users\\dell\\Downloads\\Framework1\\src\\main\\java\\com\\config\\config.properties");
			prop.load(ip);							
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}	
	
	public static void initialization() {
		String browserName = prop.getProperty("browser");
			if(browserName.equals("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}else if(browserName.equalsIgnoreCase("FF"))
			{
				WebDriverManager.edgedriver().setup();
				driver = new FirefoxDriver();
			}
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get(prop.getProperty("url"));
	}
	

	
	
}
