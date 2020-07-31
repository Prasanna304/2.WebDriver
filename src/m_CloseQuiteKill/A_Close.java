package m_CloseQuiteKill;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A_Close {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.navigate().to("http://book.theautomatedtester.co.uk/chapter1");
		WebElement input = wd.findElement(By.xpath("//*[@id=\"multiplewindow\"]"));
		input.click();
		Set<String> windows = wd.getWindowHandles();
		Iterator<String> it =  windows.iterator();
		String parentid = it.next();
		String childid = it.next();
		wd.switchTo().window(childid);
		wd.close();	//close the current focus window
	}

}
