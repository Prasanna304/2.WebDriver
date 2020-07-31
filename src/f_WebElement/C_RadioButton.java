package f_WebElement;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class C_RadioButton {

	public static void main(String[] args) {
		
		File f = new File("");
		String Path = f.getAbsolutePath();
		System.setProperty("webdriver.gecko.driver",Path+"/Driver/geckodriver");
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("http://www.echoecho.com/htmlforms10.htm");
		List<WebElement> radio =  wd.findElements(By.name("group1"));
		for(int i=0;i<radio.size();i++) {
			String data = radio.get(i).getAttribute("value");
			System.out.println(data);
			if(data.equals("Cheese")) {
				radio.get(i).click();
				break;
			}
				
		}
	}

}
