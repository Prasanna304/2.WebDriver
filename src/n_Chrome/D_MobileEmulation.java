package n_Chrome;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class D_MobileEmulation {

	public static void main(String[] args) {
		
		//copy first 4 lines from http://chromedriver.chromium.org/mobile-emulation
		Map<String, String> mobileEmulation = new HashMap<>();
		mobileEmulation.put("deviceName", "Nexus 5");
		ChromeOptions op = new ChromeOptions();
		op.setExperimentalOption("mobileEmulation", mobileEmulation);
		File f = new File("");
		String Path = f.getAbsolutePath();
		System.setProperty("webdriver.chrome.driver",Path+"/Driver/chromedriver");
		WebDriver wd = new ChromeDriver(op);
		wd.manage().window().maximize();
		wd.get("https://www.google.com");
	}

}
