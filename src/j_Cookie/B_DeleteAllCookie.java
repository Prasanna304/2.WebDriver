package j_Cookie;

import java.io.File;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class B_DeleteAllCookie {

	public static void main(String[] args) {
		
		File f = new File("");
		String Path = f.getAbsolutePath();
		System.setProperty("webdriver.gecko.driver",Path+"/Driver/geckodriver");
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.navigate().to("https://apps.na.collabserv.com/manage/account/dashboardHandler/input");
		//Delete All
		wd.manage().deleteAllCookies();
		//Read All
		Set<Cookie> s = wd.manage().getCookies();
		// if i use set we need to use iterator
		Iterator<Cookie> it = s.iterator();
		while(it.hasNext()) {
			Cookie c = it.next();
			System.out.println(c.getDomain()+"---"+
								c.getName()+"---"+
								c.getPath()+"---"+
								c.getValue()+"---"+
								c.getExpiry()+"---");
		}
	}

}
