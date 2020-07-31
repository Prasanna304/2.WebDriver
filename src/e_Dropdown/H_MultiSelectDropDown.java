package e_Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class H_MultiSelectDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		wd.switchTo().frame(0);
		WebElement name = wd.findElement(By.name("cars"));
		Select s = new Select(name);
		s.selectByIndex(0);// inbuild => ctrl+click
		s.selectByIndex(2);
		s.selectByIndex(3);
	}

}
