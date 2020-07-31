package d_Action;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class F_Slider {

	public static void main(String[] args) throws InterruptedException {
		
		File f = new File("");
		String Path = f.getAbsolutePath();
		System.setProperty("webdriver.gecko.driver",Path+"/Driver/geckodriver");
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://jqueryui.com/slider/");
		wd.switchTo().frame(0);
		WebElement slider = wd.findElement(By.xpath("/html/body/div/span"));
		Actions a = new Actions(wd);
		//a.dragAndDropBy(slider, 0, 80).build().perform();
		// It will change because try to move in y path
		a.dragAndDropBy(slider, 80, 0).build().perform();
		Thread.sleep(2000);
		a.dragAndDropBy(slider, -80, 0).build().perform();
	}

}
