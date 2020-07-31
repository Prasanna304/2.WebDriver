package g_Image;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class A_ScreenShot {

	public static void main(String[] args) throws IOException {
		
		File f = new File("");
		String Path = f.getAbsolutePath();
		System.setProperty("webdriver.gecko.driver",Path+"/Driver/geckodriver");
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com/");
		
		/*	TakesScreenshot	//to take screenshot
			(TakesScreenshot)wd	//to take screenshot of that webdriver
			((TakesScreenshot)wd).getScreenshotAs(arg0)	//we need a SS as some format 
			((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);	//output type as file	
		*/
		
		// Save in src file
		File src = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		
		// To store in device
		// FileUtils is Apachi jar will import it
		// FileUtils.copyFile(src, new File(Path+"/Driver/geckodriver/g_Image"));
		
		// Or you can do like this after java 7
		String b = Path+"/g_Image/ss.jpg";
		Files.copy(src,new File(b));
		// If i change google as flipkart it takes end to end ss
	}

}
