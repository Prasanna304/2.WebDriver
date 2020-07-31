package e_Dropdown;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class C_DropDownListAllOptions {

	public static void main(String[] args) {
		
		File f = new File("");
		String Path = f.getAbsolutePath();
		System.setProperty("webdriver.gecko.driver",Path+"/Driver/geckodriver");
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.tamildailycalendar.com/tamil_daily_calendar.php?msg=Tamil%20Daily%20Calendar%202019");
		WebElement month = wd.findElement(By.name("month"));
		Select s = new Select(month);
		List<WebElement> option = s.getOptions();
		System.out.println(option.size());
		
		for(int i=0;i<option.size();i++) {
			String data = option.get(i).getText();
			//get(i) => Return type is webelement because we give list as webelement
			System.out.println(data);
		}
			
	}

}
