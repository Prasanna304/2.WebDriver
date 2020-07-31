package r_wait;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class B_ExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		
		File f = new File("");
		String Path = f.getAbsolutePath();
		System.setProperty("webdriver.gecko.driver",Path+"/Driver/geckodriver");
		WebDriver wd = new FirefoxDriver();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.manage().window().maximize();
		wd.get("https://www.google.com/");
		WebDriverWait wait = new WebDriverWait(wd, 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")));
		WebElement input = wd.findElement(By.name("q"));
		input.sendKeys("chennai");
		Thread.sleep(2000);
		input.submit();
	}

}
