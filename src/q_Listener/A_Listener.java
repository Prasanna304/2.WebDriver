package q_Listener;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class A_Listener extends B_MyListener{

	public static void main(String[] args) throws InterruptedException {
		
		File f = new File("");
		String Path = f.getAbsolutePath();
		System.setProperty("webdriver.gecko.driver",Path+"/Driver/geckodriver");
		WebDriver wd = new FirefoxDriver();
		
		// Create a new class 
		// Open the class and add the methods
		// To call non static function in static create a object
		
		EventFiringWebDriver efwd = new EventFiringWebDriver(wd);
		B_MyListener m = new B_MyListener();
		efwd.register(m);
		wd.manage().window().maximize();
		wd.get("https://www.google.com/");
		WebElement input = wd.findElement(By.name("q"));
		input.sendKeys("chennai");
		input.submit();
		
		Thread.sleep(2000);
		wd.navigate().back();
		
		Thread.sleep(2000);
		wd.navigate().forward();
		
		Thread.sleep(2000);
		wd.navigate().back();
		
		Thread.sleep(2000);
		wd.navigate().forward();
	}

}
