package k_JavaScript;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class B_Highlight {

	public static void main(String[] args) throws IOException {
		
		File f = new File("");
		String Path = f.getAbsolutePath();
		System.setProperty("webdriver.gecko.driver",Path+"/Driver/geckodriver");
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com/");
		WebElement searchbox = wd.findElement(By.id("hplogo"));
		JavascriptExecutor js = (JavascriptExecutor)wd;
		js.executeScript("arguments[0].style.border ='5px solid red'", searchbox);
		File src = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		String b = Path+"/g_Image/Highlet.jpg";
		Files.copy(src,new File(b));
		//FileUtils.copyFile(src, new File("F:\\Automation\\WorkSpace\\WebDriver\\ScreenShot\\Highlet.jpg"));
		
	}

}
