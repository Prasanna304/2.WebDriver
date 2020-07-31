package g_Image;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class B_Point {

	public static void main(String[] args) {
		
		File f = new File("");
		String Path = f.getAbsolutePath();
		System.setProperty("webdriver.gecko.driver",Path+"/Driver/geckodriver");
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com/");
		WebElement logo = wd.findElement(By.id("hplogo"));
		Point point = logo.getLocation();
		System.out.println(point);
		int x = point.x;
		int y = point.y;
		System.out.println(x);
		System.out.println(y);
	}

}
