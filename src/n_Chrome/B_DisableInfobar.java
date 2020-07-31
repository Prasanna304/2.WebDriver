package n_Chrome;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class B_DisableInfobar {

	public static void main(String[] args) {
		
		// This will not work in latest chrome version
		ChromeOptions op = new ChromeOptions();
		op.addArguments("diable_infobars");
		File f = new File("");
		String Path = f.getAbsolutePath();
		System.setProperty("webdriver.chrome.driver",Path+"/Driver/chromedriver");
		WebDriver wd = new ChromeDriver(op);
		wd.manage().window().maximize();
		wd.get("https://www.google.com");
	}
}
