package f_WebElement;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class K_GoogleReadAllLink {

	public static void main(String[] args) {
		
		// Link => <a> => Tag and href => attribute
		File f = new File("");
		String Path = f.getAbsolutePath();
		System.setProperty("webdriver.gecko.driver",Path+"/Driver/geckodriver");
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com");
		List<WebElement> tag = wd.findElements(By.tagName("a"));
		System.out.println("Link Count - "+tag.size());
		for(int i=0; i<tag.size();i++) {
			String data = tag.get(i).getText();
			//System.out.println(data);//prints invisible link also
			if(!data.isEmpty()) {
				System.out.println(data);
			}
		}	
	}
}