package c_Locator;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class D_LocatorByXpath {

	public static void main(String[] args) {
		
		File f = new File("");
		String Path = f.getAbsolutePath();
		System.setProperty("webdriver.gecko.driver",Path+"/Driver/geckodriver");
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("http://www.bing.com");
		// Right click the element that you want to check the xpath and click copy xpath
		// WebElement input = wd.findElement(By.xpath("//*[@id='sb_form_q']")); //change it in '' or add \
		WebElement input = wd.findElement(By.xpath("//*[@id=\"sb_form_q\"]"));
		input.sendKeys("chennai");
	}

}
