package p_Frame;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A_IframeCount {

	public static void main(String[] args) {
		
		File f = new File("");
		String Path = f.getAbsolutePath();
		System.setProperty("webdriver.gecko.driver",Path+"/Driver/geckodriver");
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");
		List<WebElement> iframe = wd.findElements(By.tagName("iframe"));
		System.out.println("iframe count" + iframe.size());
		// wd.switchTo().frame(0);	// Index Specific
		// wd.switchTo().frame("")	//By id or name or class
		wd.switchTo().frame(0);
		List<WebElement> frameset = wd.findElements(By.tagName("frameset"));
		System.out.println("frameset count" + frameset.size());
		List<WebElement> frame = wd.findElements(By.tagName("frame"));
		System.out.println("frame count" + frame.size());
	}

}
