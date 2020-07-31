package b_Browse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A_OpenBrowser {
	
	public static void main(String[] args) {
		
		WebDriver wd = new FirefoxDriver();
		// firefoxdriver is constructor which opens firefox
		
			// FirefoxDriver fd = new FirefoxDriver();
			// ChromeDriver cd = new ChromeDriver();
			// fd.kill();	// kd.kill will not come 		
			// cd.kill();	// cd.kill will not come
		
		WebDriver cd = new ChromeDriver();
	}
}
