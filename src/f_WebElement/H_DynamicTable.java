package f_WebElement;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class H_DynamicTable {

	public static void main(String[] args) {

		File f = new File("");
		String Path = f.getAbsolutePath();
		System.setProperty("webdriver.gecko.driver",Path+"/Driver/geckodriver");
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.w3schools.com/html/html_tables.asp");
		WebElement table = wd.findElement(By.id("customers"));
		List<WebElement> row = table.findElements(By.tagName("tr"));
		for(int i=0;i<row.size();i++) {
			List<WebElement> column = row.get(i).findElements(By.tagName("td"));
			for(int j=0;j<column.size();j++) {
				String data = column.get(j).getText();
				System.out.print(data+"");
			}
			System.out.println();
		}	
	}

}
