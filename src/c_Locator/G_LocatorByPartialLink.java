package c_Locator;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class G_LocatorByPartialLink {

	public static void main(String[] args) throws IOException {
		
		File f = new File("");
		String Path = f.getAbsolutePath();
		System.setProperty("webdriver.gecko.driver",Path+"/Driver/geckodriver");
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com/");
		WebElement gmail = wd.findElement(By.partialLinkText("mail"));
		//if i use "ma" in partial it will search the first on in the html
		gmail.click();
		
	}

}
