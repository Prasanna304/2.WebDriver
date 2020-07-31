package d_Action;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class E_GetText {

	public static void main(String[] args) {
		
		File f = new File("");
		String Path = f.getAbsolutePath();
		System.setProperty("webdriver.gecko.driver",Path+"/Driver/geckodriver");
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://jqueryui.com/resizable/");
		WebElement text = wd.findElement(By.xpath("//*[@id=\"content\"]/p[1]"));
		String data = text.getText();
		System.out.println(data);
	}

}
