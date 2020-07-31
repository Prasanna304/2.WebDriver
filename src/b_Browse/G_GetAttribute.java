package b_Browse;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class G_GetAttribute {

	public static void main(String[] args) throws InterruptedException {
		
		File f = new File("");
		String Path = f.getAbsolutePath();
		System.setProperty("webdriver.gecko.driver",Path+"/Driver/geckodriver");
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com");
		WebElement input = wd.findElement(By.name("q"));
		input.sendKeys("chennai");
		Thread.sleep(2000);
		System.out.println("input"+input.getText());// this will not work
		//get text is used to get values from <p> </p> i.e paragraph
		// in this case <input> value="" </input> => i.e attribute
		System.out.println("input "+input.getAttribute("value"));
	}

}
