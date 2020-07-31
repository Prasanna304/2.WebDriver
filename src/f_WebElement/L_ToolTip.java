package f_WebElement;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class L_ToolTip {

	public static void main(String[] args) {
		
		// Tool tip is a mouse action but we did it through web element
		// Because it is easy to find i.e, can't inspect tool tip (mouse over)
		File f = new File("");
		String Path = f.getAbsolutePath();
		System.setProperty("webdriver.gecko.driver",Path+"/Driver/geckodriver");
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.navigate().to("https://jqueryui.com/tooltip");
		wd.switchTo().frame(0);
		WebElement ip = wd.findElement(By.id("age"));
		String data = ip.getAttribute("title");
		System.out.println(data);
	}

}
