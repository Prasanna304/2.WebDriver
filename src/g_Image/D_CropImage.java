package g_Image;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class D_CropImage {

	public static void main(String[] args) throws IOException {
		
		//To crop a img we need axis and dimention
		File f = new File("");
		String Path = f.getAbsolutePath();
		System.setProperty("webdriver.gecko.driver",Path+"/Driver/geckodriver");
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com/");
		WebElement logo = wd.findElement(By.id("hplogo"));
		
		//To get axis
		
		Point point = logo.getLocation();
		int x = point.x;
		int y = point.y;
		
		//To get dimention
		
		Dimension d = logo.getSize();
		int h = d.height;
		int w = d.width;
		
		//To store it as file
		
		File src = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		
		//Crop image
		
		BufferedImage copy = ImageIO.read(src);	// to copy a image to crop
		BufferedImage crop = copy.getSubimage(x, y, w, h);	//Croping image
		ImageIO.write(crop, "png", src);	//	ImageIO.write(im, formatName, output) //renderedimage,format,output
		
		//Store image
		
		String b = Path+"/g_Image/sscrop.jpg";
		Files.copy(src,new File(b));
	}

}
