package b_Browse;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class B_MaxWindow {

	public static void main(String[] args) {
		
		// Download the firefox driver here https://github.com/mozilla/geckodriver/releases
		// Copy paste the driver to project and give the path as below 
		File f = new File("");
		String Path = f.getAbsolutePath();
		System.setProperty("webdriver.gecko.driver",Path+"/Driver/geckodriver");
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		// Manage will handle 3 things in major (Timeout, Window resize, Cookie handling)

	}

}
