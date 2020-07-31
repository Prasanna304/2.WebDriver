package e_Dropdown;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class M_JavaIndex {

	public static void main(String[] args) {
		
		File f = new File("");
		String Path = f.getAbsolutePath();
		System.setProperty("webdriver.gecko.driver",Path+"/Driver/geckodriver");
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.tamildailycalendar.com/tamil_daily_calendar.php?msg=Tamil%20Daily%20Calendar%202019");
		WebElement month = wd.findElement(By.name("month"));
		List<WebElement> option = month.findElements(By.tagName("option"));
		System.out.println("count"+option.size());
		for(int i=0;i<option.size();i++) {
			//System.out.println(option.get(i).getText());
			String data = option.get(i).getText();
			if (i==5) {
				option.get(i).click();
				break;
			}
			
		}	
	}

}
