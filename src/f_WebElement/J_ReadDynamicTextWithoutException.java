package f_WebElement;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class J_ReadDynamicTextWithoutException {

	public static void main(String[] args) {
		
		File f = new File("");
		String Path = f.getAbsolutePath();
		System.setProperty("webdriver.gecko.driver",Path+"/Driver/geckodriver");
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("file:///"+Path+"/ExampleHTML/image.html");
		String startxpath = "/html/body/p[";
		String endxpath = "]";
		int i=1;
		while (true) {
			try {
			String fullxpath = startxpath + i + endxpath;
			i++;
			String data = wd.findElement(By.xpath(fullxpath)).getText();
			System.out.println(data);
			}
			catch(NoSuchElementException e) {	//nosuchelement =>openqa
				break;
			}
		}
	}

}
