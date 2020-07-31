package f_WebElement;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class I_ReadDynamicTextWithException {

	public static void main(String[] args) {
		
		File f = new File("");
		String Path = f.getAbsolutePath();
		System.setProperty("webdriver.gecko.driver",Path+"/Driver/geckodriver");
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("file:///"+Path+"/ExampleHTML/image.html");
		// Xpath is /html/body/p[1]
		String startxpath = "/html/body/p[";
		String endxpath = "]";
		int i=1;
		while (true) {
			String fullxpath = startxpath + i + endxpath;
			i++;
			String data = wd.findElement(By.xpath(fullxpath)).getText();
			System.out.println(data);
		}
	}

}
