package l_MultiWindowHandling;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A_MultipleWindowHandling {

	public static void main(String[] args) {
		
		File f = new File("");
		String Path = f.getAbsolutePath();
		System.setProperty("webdriver.gecko.driver",Path+"/Driver/geckodriver");
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.navigate().to("http://book.theautomatedtester.co.uk/chapter1");
		WebElement input = wd.findElement(By.xpath("//*[@id=\"multiplewindow\"]"));
		input.click();
		WebElement text = wd.findElement(By.xpath("//*[@id=\"html5div\"]"));
		String data = text.getText();
		System.out.println(data);
	}

}
