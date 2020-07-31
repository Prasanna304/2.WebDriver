package k_JavaScript;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class E_Enable {

	public static void main(String[] args) {
		
		File f = new File("");
		String Path = f.getAbsolutePath();
		System.setProperty("webdriver.gecko.driver",Path+"/Driver/geckodriver");
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("file:///F:/Automation/WorkSpace/WebDriver/HTML%20Folder/EnableField.html");
		WebElement input = wd.findElement(By.name("lname"));
		JavascriptExecutor js = (JavascriptExecutor)wd;
		js.executeScript("arguments[0].removeAttribute('disabled')", input);
		input.sendKeys("chennai");
	}

}
