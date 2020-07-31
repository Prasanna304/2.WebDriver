package c_Locator;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A_LocatorByName {

	public static void main(String[] args) {
		
		File f = new File("");
		String Path = f.getAbsolutePath();
		System.setProperty("webdriver.gecko.driver",Path+"/Driver/geckodriver");
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com");
		// Find element is to find the single elements like dropdown
		// Find elements is to find multi values like list in the dropdoen
		// Store in list because to not remove duplicates and to show in given order
		// Right click the page -> Inspect -> Element -> Left corner arror element click 
		// It will show that the path -> in the path name is q
		// wd.findElement(By.name("q")); // return type is webelement so store it as
		WebElement input = wd.findElement(By.name("q"));
		input.sendKeys("chennai");	
	}

}
