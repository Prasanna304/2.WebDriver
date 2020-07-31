package g_Image;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class C_Dimention {

	public static void main(String[] args) {
		
		File f = new File("");
		String Path = f.getAbsolutePath();
		System.setProperty("webdriver.gecko.driver",Path+"/Driver/geckodriver");
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com/");
		WebElement logo = wd.findElement(By.id("hplogo"));
		Dimension d = logo.getSize();
		System.out.println(d);
		int h = d.height;
		int w = d.width;
		System.out.println(h);
		System.out.println(w);
	}

}
