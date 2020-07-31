package p_Frame;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class B_FrameText {

	public static void main(String[] args) {

		File filename = new File("");
		String Path = filename.getAbsolutePath();
		System.setProperty("webdriver.gecko.driver",Path+"/Driver/geckodriver");
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		// wd.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_frame_cols");
		wd.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");
		List<WebElement> iframe = wd.findElements(By.tagName("iframe"));
		System.out.println("iframe count" + iframe.size());
		wd.switchTo().frame(0);
		List<WebElement> fs = wd.findElements(By.tagName("frameset"));
		System.out.println("frameset count" + fs.size());
		List<WebElement> f = wd.findElements(By.tagName("frame"));
		System.out.println("frame count" + f.size());
		wd.switchTo().frame(0);
		WebElement text = wd.findElement(By.xpath("/html/body"));
		String data = text.getText();
		System.out.println(data);
		
		wd.switchTo().parentFrame();
		
		wd.switchTo().frame(1);
		WebElement text1 = wd.findElement(By.xpath("/html/body"));
		String data1 = text1.getText();
		System.out.println(data1);
		
		wd.switchTo().parentFrame();
		
		wd.switchTo().frame(2);
		WebElement text2 = wd.findElement(By.xpath("/html/body"));
		String data2 = text2.getText();
		System.out.println(data2);
	}
}
