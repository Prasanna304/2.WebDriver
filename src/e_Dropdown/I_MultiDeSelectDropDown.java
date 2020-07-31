package e_Dropdown;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class I_MultiDeSelectDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		File f = new File("");
		String Path = f.getAbsolutePath();
		System.setProperty("webdriver.gecko.driver",Path+"/Driver/geckodriver");
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		wd.switchTo().frame(0);
		WebElement name = wd.findElement(By.name("cars"));
		Select s = new Select(name);
		s.selectByIndex(0);
		s.selectByIndex(2);
		s.selectByIndex(3);
		Thread.sleep(2000);
		s.deselectByIndex(0);
		Thread.sleep(2000);
		s.deselectByIndex(2);
		Thread.sleep(2000);
		s.deselectByIndex(3);
		//s.deselectByIndex(1);//no error no select
		//s.deselectByIndex(4); // this will show error
		//s.deselectAll(); //simple way to deselect all
	}

}
