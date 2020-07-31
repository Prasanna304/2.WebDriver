/*
 * If a element fails in regression for some times we use Javascript
 * If we use via java script its a compulsory click
 */

package k_JavaScript;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.ExecuteScript;

public class A_ScrollDown {

	public static void main(String[] args) throws InterruptedException {
		
		File f = new File("");
		String Path = f.getAbsolutePath();
		System.setProperty("webdriver.gecko.driver",Path+"/Driver/geckodriver");
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com/");
		WebElement searchbox = wd.findElement(By.name("q"));
		searchbox.sendKeys("chennai");
		searchbox.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)wd;
		//js.executeScript(arg0, arg1)	//overloaded func so we can use single or double argu
										//if i use it in entire webdriver (wd)
										// if i use it as inside wd (wd,arg1)
		js.executeScript("window.scrollBy(0, 1500)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0, -500)");
	}

}
