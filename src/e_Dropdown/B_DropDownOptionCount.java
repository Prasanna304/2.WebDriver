package e_Dropdown;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class B_DropDownOptionCount {

	public static void main(String[] args) {
		
		File f = new File("");
		String Path = f.getAbsolutePath();
		System.setProperty("webdriver.gecko.driver",Path+"/Driver/geckodriver");
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.tamildailycalendar.com/tamil_daily_calendar.php?msg=Tamil%20Daily%20Calendar%202019");
		WebElement month = wd.findElement(By.name("month"));
		Select s = new Select(month);
		//s.getOptions(); returns list
		List<WebElement> option = s.getOptions();
		System.out.println(option.size());
	}

}
