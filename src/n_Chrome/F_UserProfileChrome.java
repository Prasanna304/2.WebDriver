package n_Chrome;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Date;
import java.util.StringTokenizer;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class F_UserProfileChrome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*
		 * shows exception need to set property WebDriver wd = new ChromeDriver();
		 * wd.manage().window().maximize(); wd.get("https://www.google.com");
		 */

		File f = new File("");
		String Path = f.getAbsolutePath();
		System.setProperty("webdriver.chrome.driver",Path+"/Driver/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("user-data-dir=/Users/Personal/Library/Application Support/Google/Chrome/");
		options.addArguments("--profile-directory=Default");
		WebDriver wd = new ChromeDriver(options);
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		wd.manage().window().maximize();

		
/*		
 		File file = new File("Cookies.data");
		try {
			// Delete old file if exists
			file.delete();
			file.createNewFile();
			FileWriter fileWrite = new FileWriter(file);
			BufferedWriter Bwrite = new BufferedWriter(fileWrite);
			// loop for getting the cookie information

			// loop for getting the cookie information
			for (Cookie ck : wd.manage().getCookies()) {
				Bwrite.write((ck.getName() + ";" + ck.getValue() + ";" + ck.getDomain() + ";" + ck.getPath() + ";"
						+ ck.getExpiry() + ";" + ck.isSecure()));
				Bwrite.newLine();
			}
			Bwrite.close();
			fileWrite.close();

		} catch (Exception ex) {
			ex.printStackTrace();
		}
*/
/*
		try {

			File file1 = new File("Cookies.data");
			FileReader fileReader = new FileReader(file1);
			BufferedReader Buffreader = new BufferedReader(fileReader);
			String strline;
			while ((strline = Buffreader.readLine()) != null) {
				StringTokenizer token = new StringTokenizer(strline, ";");
				while (token.hasMoreTokens()) {
					String name = token.nextToken();
					String value = token.nextToken();
					String domain = token.nextToken();
					String path = token.nextToken();
					Date expiry = null;

					String val;
					if (!(val = token.nextToken()).equals("null")) {
						expiry = new Date(val);
					}
					Boolean isSecure = new Boolean(token.nextToken()).booleanValue();
					Cookie ck = new Cookie(name, value, domain, path, expiry, isSecure);
					System.out.println(ck);
					wd.manage().addCookie(ck); // This will add the stored cookie to your current session
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		wd.get("https://web.whatsapp.com/");
		Thread.sleep(10000);
		WebElement searchName = wd.findElement(By.xpath("//*[@id=\"side\"]/div[1]/div/label/input"));
		searchName.sendKeys("viswa");
		searchName.sendKeys(Keys.ENTER);
		//WebElement clickName = wd.findElement(By.xpath("//*[@id=\"pane-side\"]/div[1]/div/div/div[3]/div/div/div[2]/div[1]/div[1]/span/span/span"));
		//clickName.click();
		Thread.sleep(10000);		
		WebElement getLastSceen = wd.findElement(By.xpath("//*[@id=\"main\"]/header/div[2]/div[2]/span"));
		String stng = getLastSceen.getText();
		System.out.println(stng);
		WebElement sendMessage = wd.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div[2]/div/div[2]"));
		sendMessage.sendKeys("Automated Message");
		WebElement clickSendMessage = wd.findElement(By.className("_3M-N-"));
		clickSendMessage.click();
*/
	}

}
