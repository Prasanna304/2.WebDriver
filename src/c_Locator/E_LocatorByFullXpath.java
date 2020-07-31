package c_Locator;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class E_LocatorByFullXpath {

	public static void main(String[] args) {
		
		File f = new File("");
		String Path = f.getAbsolutePath();
		System.setProperty("webdriver.gecko.driver",Path+"/Driver/geckodriver");
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("http://www.bing.com");
		WebElement input = wd.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/form/input[1]"));
		input.sendKeys("chennai");
	}

}
