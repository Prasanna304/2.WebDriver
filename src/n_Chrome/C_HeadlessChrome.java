package n_Chrome;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C_HeadlessChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//To change it as virtual browser
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--headless");
				
		File f = new File("");
		String Path = f.getAbsolutePath();
		System.setProperty("webdriver.chrome.driver",Path+"/Driver/chromedriver");
		WebDriver wd = new ChromeDriver(op);
		wd.manage().window().maximize();
		wd.get("https://www.google.com");
		System.out.println(wd.getTitle());
		WebElement input = wd.findElement(By.name("q"));
		input.sendKeys("chennai");
		input.submit();
		System.out.println(wd.getTitle());
		
		
	}

}
