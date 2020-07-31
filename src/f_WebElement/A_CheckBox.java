package f_WebElement;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A_CheckBox {

	public static void main(String[] args) {
		
		File f = new File("");
		String Path = f.getAbsolutePath();
		System.setProperty("webdriver.gecko.driver",Path+"/Driver/geckodriver");
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_checkbox");
		wd.switchTo().frame(0);
		WebElement checkbox = wd.findElement(By.xpath("/html/body/form/input[3]"));
		/*checkbox.click();		
		 * we have to precheck something before click
		 * Checkbox is there or it is in DOM(Visibility)
		 * Checkbox is enable or disable
		 * Checkbox is prechecked or empty
		 */
		if(checkbox.isDisplayed()) { 
			System.out.println("CB is visible");
			if(checkbox.isEnabled()) {
				System.out.println("CB is enabled");
				if(checkbox.isSelected()) {
					System.out.println("CB is already selected");
				}
				else {
					System.out.println("not selected so click");
					checkbox.click();
				}
			}
		}
	}
}
