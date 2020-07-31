package o_FileUploadDownload;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A_FileUpload {

	public static void main(String[] args) {
		
		File f = new File("");
		String Path = f.getAbsolutePath();
		System.setProperty("webdriver.gecko.driver",Path+"/Driver/geckodriver");
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.navigate().to("http://www.tinyupload.com/");
		WebElement input = wd.findElement(By.xpath("/html/body/table/tbody/tr[4]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[1]/input[2]"));
		input.sendKeys(Path+"/g_Image/ss.jpg");
		WebElement clickme = wd.findElement(By.xpath("/html/body/table/tbody/tr[4]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[1]/img"));
		clickme.click();
	}

}
