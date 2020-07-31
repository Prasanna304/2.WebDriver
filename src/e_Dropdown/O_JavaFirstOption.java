package e_Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class O_JavaFirstOption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.tamildailycalendar.com/tamil_daily_calendar.php?msg=Tamil%20Daily%20Calendar%202019");
		WebElement month = wd.findElement(By.name("month"));
		List<WebElement> option = month.findElements(By.tagName("option"));
		String data = option.get(0).getText();
		System.out.println(data);
	}

}
