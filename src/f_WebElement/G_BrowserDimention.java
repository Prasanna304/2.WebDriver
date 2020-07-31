package f_WebElement;

import java.io.File;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class G_BrowserDimention {

	public static void main(String[] args) {

		File f = new File("");
		String Path = f.getAbsolutePath();
		System.setProperty("webdriver.gecko.driver",Path+"/Driver/geckodriver");
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.navigate().to("https://www.google.com/");
		Dimension d = new Dimension(300, 500);
		wd.manage().window().setSize(d);
	}

}
