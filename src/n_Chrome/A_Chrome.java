package n_Chrome;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_Chrome {

	public static void main(String[] args) {
		
		File f = new File("");
		String Path = f.getAbsolutePath();
		System.setProperty("webdriver.chrome.driver",Path+"/Driver/chromedriver");
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com");
	}

}
