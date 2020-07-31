/*
 * Need to check this later
 */


package o_FileUploadDownload;

import java.io.File;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class B_FileDownload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		FirefoxProfile profile = new FirefoxProfile();
		
		File fpath = new File("");
		String absolutePath = fpath.getAbsolutePath();
		String path = absolutePath+"/f_WebElement_DownloadFile";
		
		profile.setPreference("browser.download.folderList", 2);
		
		profile.setPreference("browser.download.dir", path);
		
		
		profile.setPreference("browser.download.manager.alertOnEXEOpen", false);
		profile.setPreference(
				"browser.helperApps.neverAsk.saveToDisk",
				"application/msword,application/csv,text/csv,image/png ,"
						+ "image/jpeg, application/pdf, text/html,text/plain,"
						+ "application/octet-stream"
						+ "application/x-msexcel,application/excel,application/x-excel,application/excel,"
						+ "application/x-excel,application/excel,application/vnd.ms-excel,"
						+ "application/x-excel,application/x-msexcel");
		
		
		profile.setPreference("browser.download.manager.showWhenStarting",
				false);
		profile.setPreference("browser.download.manager.focusWhenStarting",
				false);
		profile.setPreference("browser.helperApps.alwaysAsk.force", false);
		profile.setPreference("browser.download.manager.alertOnEXEOpen", false);
		profile.setPreference("browser.download.manager.closeWhenDone", false);
		profile.setPreference("browser.download.manager.showAlertOnComplete",
				false);
		profile.setPreference("browser.download.manager.useWindow", false);
		profile.setPreference("browser.download.manager.showWhenStarting",
				false);
		profile.setPreference(
				"services.sync.prefs.sync.browser.download.manager.showWhenStarting",
				false);
		profile.setPreference("pdfjs.disabled", true);
		
		
		File f = new File("");
		String driverPath = f.getAbsolutePath();
		System.setProperty("webdriver.gecko.driver",driverPath+"/Driver/geckodriver");
		 WebDriver wd=new FirefoxDriver();

		 wd.manage().window().maximize();
		 wd.get("https://www.resumeworld.ca/resume-templates/types-resume-templates/curriculum-vitae-resume-template.html");
		 WebElement input = wd.findElement(By.xpath("//*[@id=\"text\"]/div/table/tbody/tr[1]/td[1]/u/a"));
		 input.click();
	}

}
