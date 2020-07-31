/*
 * Webdrive has only overload function
 * Switch to 
 		* Frame
 		* Window
 		* Alert
 * Frame
 		* Overload with string (Id, Name, Class Name)
 		* With Index
 		* With Webelement
 */


package d_Action;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class C_DragAndDrop {

	public static void main(String[] args) {
		
		File f = new File("");
		String Path = f.getAbsolutePath();
		System.setProperty("webdriver.gecko.driver",Path+"/Driver/geckodriver");WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://jqueryui.com/droppable/");
		wd.switchTo().frame(0);
		WebElement drag = wd.findElement(By.id("draggable"));
		WebElement drop = wd.findElement(By.id("droppable"));
		Actions a = new Actions(wd);
		//a.dragAndDrop(drag, drop);
		// if i use actions build and perform are compulsory
		//a.dragAndDrop(drag, drop).perform(); // can be used but buind.perform is preffered
		a.dragAndDrop(drag, drop).build().perform();
	}

}
