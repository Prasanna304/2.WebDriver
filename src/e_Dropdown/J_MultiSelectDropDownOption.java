package e_Dropdown;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class J_MultiSelectDropDownOption {

	public static void main(String[] args) {
		
		File f = new File("");
		String Path = f.getAbsolutePath();
		System.setProperty("webdriver.gecko.driver",Path+"/Driver/geckodriver");
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		wd.switchTo().frame(0);
		WebElement name = wd.findElement(By.name("cars"));
		Select s = new Select(name);
		s.selectByIndex(0);// inbuild => ctrl+click
		s.selectByIndex(2);
		s.selectByIndex(3);
		List<WebElement> option = s.getAllSelectedOptions();
		System.out.println(option.size());
		
		for(int i=0;i<option.size();i++) {
			String data = option.get(i).getText();
			//get(i) => Return type is webelement because we give list as webelement
			System.out.println(data);
		}
	}

}
