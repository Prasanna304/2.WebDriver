/*
 * There are 3 types of wait
 * Implicit (time<30) 
 		* If 1st element comes in 5 sec it wait for 5 sec
 		* If 2nd element comes in 25 sec it will wait for 25 sec and goes to next step
 * Explicit (time<30) 
 		* It will explicitly wait for 30 sec
 		* Handles property also like Visibility, already checked, Enable/Disable etc
 * Fluence 
 */

package r_wait;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A_ImplicitWait {

	public static void main(String[] args) throws InterruptedException {
		
		File f = new File("");
		String Path = f.getAbsolutePath();
		System.setProperty("webdriver.gecko.driver",Path+"/Driver/geckodriver");
		WebDriver wd = new FirefoxDriver();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.manage().window().maximize();
		wd.get("https://www.google.com/");
		WebElement input = wd.findElement(By.name("q"));
		input.sendKeys("chennai");
		Thread.sleep(2000);
		input.submit();
	}

}
