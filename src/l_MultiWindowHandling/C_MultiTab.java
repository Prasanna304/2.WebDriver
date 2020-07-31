package l_MultiWindowHandling;

import java.io.File;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class C_MultiTab {

	public static void main(String[] args) throws InterruptedException {
		
		File f = new File("");
		String Path = f.getAbsolutePath();
		System.setProperty("webdriver.gecko.driver",Path+"/Driver/geckodriver");
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.navigate().to("file:///F:/Automation/WorkSpace/WebDriver/HTML%20Folder/mutiwindow.html");
		WebElement input = wd.findElement(By.xpath("/html/body/form/input"));
		input.click();
		Thread.sleep(2000);
		Set<String> windows = wd.getWindowHandles();
		Iterator<String> it =  windows.iterator();
		/*
		 	while(it.hasNext()) {
			System.out.println(it.next());
		}
		*/
		String parrent = it.next();
		String first = it.next();
		String second = it.next();
		String third = it.next();
		wd.switchTo().window(parrent);
		String parrentTitle = wd.getTitle();
		System.out.println(parrentTitle);
		wd.switchTo().window(first);
		String title1 = wd.getTitle();
		System.out.println(title1);
		wd.switchTo().window(second);
		String title2 = wd.getTitle();
		System.out.println(title2);
		wd.switchTo().window(third);
		String title3 = wd.getTitle();
		System.out.println(title3);
	}
}
