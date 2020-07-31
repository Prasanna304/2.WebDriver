package d_Action;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class D_Resize {

	public static void main(String[] args) {
		
		File f = new File("");
		String Path = f.getAbsolutePath();
		System.setProperty("webdriver.gecko.driver",Path+"/Driver/geckodriver");
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://jqueryui.com/resizable/");
		wd.switchTo().frame(0);
		WebElement resize = wd.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		Actions a = new Actions(wd);
		
		//a.clickAndHold(resize).moveToElement(resize, 80, 80).build().perform();
		//After finish it will strick with actions //run and check
		
		//a.clickAndHold(resize).moveToElement(resize, 80, 80).release().build().perform();
		//Relese will release the resize because we use build so all the action are build together
		
		a.clickAndHold(resize).perform();
		a.moveToElement(resize,80,80).perform();
		a.release(resize).perform();
	}

}
