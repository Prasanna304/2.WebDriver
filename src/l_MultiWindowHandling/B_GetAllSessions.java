package l_MultiWindowHandling;

import java.io.File;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class B_GetAllSessions {

	public static void main(String[] args) throws InterruptedException {
		
		File f = new File("");
		String Path = f.getAbsolutePath();
		System.setProperty("webdriver.gecko.driver",Path+"/Driver/geckodriver");
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.navigate().to("http://book.theautomatedtester.co.uk/chapter1");
		WebElement input = wd.findElement(By.xpath("//*[@id=\"multiplewindow\"]"));
		input.click();
		Set<String> windows = wd.getWindowHandles();
		Iterator<String> it =  windows.iterator();
		/*while(it.hasNext()) {
			System.out.println(it.next());
		}*/
		//Returns 2 seasons 1st parent 2nd child because by default it store it has linkedhashset
		String parentid = it.next();
		String childid = it.next();
		wd.switchTo().window(childid);
		Thread.sleep(2000);
		WebElement childval = wd.findElement(By.xpath("//*[@id=\"popuptext\"]"));
		String childdata = childval.getText();
		System.out.println(childdata);
		WebElement close = wd.findElement(By.id("closepopup"));
		close.click();
		//switch to parent because child window closed, it doesn't know to switch
		wd.switchTo().window(parentid);
		Thread.sleep(2000);
		WebElement clickme = wd.findElement(By.xpath("//*[@id=\"secondajaxbutton\"]"));
		clickme.click();
		WebElement printval = wd.findElement(By.xpath("//*[@id=\"html5div\"]/div"));
		String val = printval.getText();
		System.out.println(val);
	}

}
