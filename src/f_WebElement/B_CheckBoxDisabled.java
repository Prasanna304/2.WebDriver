package f_WebElement;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class B_CheckBoxDisabled {

	public static void main(String[] args) throws InterruptedException {
		
		File f = new File("");
		String Path = f.getAbsolutePath();
		System.setProperty("webdriver.gecko.driver",Path+"/Driver/geckodriver");
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_checkbox_disabled2");
		wd.switchTo().frame(0);
		WebElement clicktry = wd.findElement(By.xpath("/html/body/button"));
		clicktry.click();
		Thread.sleep(4000);
		WebElement checkbox = wd.findElement(By.id("myCheck"));
		if(checkbox.isDisplayed()) { 
			System.out.println("CB is visible");
			if(checkbox.isEnabled()) {
				System.out.println("CB is enabled");
				if(checkbox.isSelected()) {
					System.out.println("CB is already selected");
				}
				else {
					System.out.println("not selected so click");
					checkbox.click();
				}
			}
		}
	}

}
