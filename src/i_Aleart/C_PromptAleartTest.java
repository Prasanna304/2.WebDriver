package i_Aleart;

import java.io.File;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class C_PromptAleartTest {

	public static void main(String[] args) throws InterruptedException {
		
		File f = new File("");
		String Path = f.getAbsolutePath();
		System.setProperty("webdriver.gecko.driver",Path+"/Driver/geckodriver");
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("file:///"+Path+"/ExampleHTML/prompt.html");
		WebElement clickbox = wd.findElement(By.xpath("/html/body/form/input"));
		clickbox.click();
		Alert a = wd.switchTo().alert();
		String data = a.getText();
		System.out.println(data);
		a.sendKeys("chennai");
		Thread.sleep(2000);
		a.accept();
	}

}
