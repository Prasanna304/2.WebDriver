package d_Action;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class I_RightClickKeybourdActions {
	public static void main(String[] args) throws InterruptedException {
		
		File f = new File("");
		String Path = f.getAbsolutePath();
		System.setProperty("webdriver.gecko.driver",Path+"/Driver/geckodriver");
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com/");
		WebElement gmail = wd.findElement(By.linkText("Gmail"));
		Actions a = new Actions(wd);
		a.contextClick(gmail).build().perform();
		Thread.sleep(2000);
		a.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(2000);
		a.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(2000);
		a.sendKeys(Keys.ENTER).build().perform();
	}
}