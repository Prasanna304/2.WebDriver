package h_ElementStaleReferanceException;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class B_InputBoxStaleReferenceException {

	public static void main(String[] args) throws InterruptedException {
		
		File f = new File("");
		String Path = f.getAbsolutePath();
		System.setProperty("webdriver.gecko.driver",Path+"/Driver/geckodriver");
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.navigate().to("https://www.google.com/");
		WebElement ip = wd.findElement(By.name("q"));
		ip.sendKeys("chennai");
		ip.submit();
		Thread.sleep(2000);
		wd.navigate().back();
		ip.sendKeys("Guindy");
	}

}
