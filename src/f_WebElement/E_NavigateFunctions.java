package f_WebElement;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class E_NavigateFunctions {

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
		// Go Back
		wd.navigate().back();
		Thread.sleep(2000);
		// Go forword
		wd.navigate().forward();
		Thread.sleep(2000);
		// Reload
		wd.navigate().refresh();
	}

}
