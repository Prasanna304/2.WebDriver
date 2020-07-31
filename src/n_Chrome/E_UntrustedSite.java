package n_Chrome;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class E_UntrustedSite {

	public static void main(String[] args) {
		
		// Unexpected site => I understand the risk => Add Exception
		FirefoxProfile profile = new FirefoxProfile();
		profile.setAcceptUntrustedCertificates(true);
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com");
		String title = wd.getTitle();
		System.out.println(title);
		
		/*
		 *  
		   	// It create firefox profile
			FirefoxProfile profile=new FirefoxProfile();
			 
			// This will set the true value
			profile.setAcceptUntrustedCertificates(true);
			 
			// This will open  firefox browser using above created profile
			WebDriver driver=new FirefoxDriver(profile);
			 
			driver.get("pass the url as per your requirement");
			
			Since Firefox comes default browser in Selenium so for other browsers like Chrome, IE, Safari we have to use below technique.
			
			Handle untrusted certificate in Chrome
			
			// Create object of DesiredCapabilities class
			DesiredCapabilities cap=DesiredCapabilities.chrome();
			
			// Set ACCEPT_SSL_CERTS  variable to true
			cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			
			// Set the driver path
			System.setProperty("webdriver.chrome.driver","Chrome driver path");
			
			// Open browser with capability
			WebDriver driver=new ChromeDriver(cap);
			 
			
			Handle untrusted certificate in IE
			
			// Create object of DesiredCapabilities class
			DesiredCapabilities cap=DesiredCapabilities.internetExplorer();
			
			// Set ACCEPT_SSL_CERTS  variable to true
			cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			
			// Set the driver path
			System.setProperty("webdriver.ie.driver","IE driver path");
			
			// Open browser with capability
			WebDriver driver=newInternetExplorerDriver(cap);
			
			
			
			Handle untrusted certificate in Safari
			
			// Create object of DesiredCapabilities class
			DesiredCapabilities cap=DesiredCapabilities.safari();
			
			// Set ACCEPT_SSL_CERTS  variable to true
			cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			
			// Set the driver path
			System.setProperty("webdriver.safari.driver","Safari driver path");
			
			// Open browser with capability
			WebDriver driver=new SafariDriver(cap);
			
		 */
	}

}
