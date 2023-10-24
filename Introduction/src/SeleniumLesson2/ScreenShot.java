package SeleniumLesson2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ScreenShot {

	public static void main(String[] args) throws IOException {
		

			System.setProperty("webdriver.chrome.driver","/Users/satınalma2.AYG01/chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		
			//	driver.manage().deleteCookieNamed("sessionKey");

			//click on any link
			//login page- verify login url
			
			
			driver.get("http://google.com");
			
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src,new File("C:\\Users\\satınalma2.AYG01\\Pictures/screen.png"));
		
		
	}

}
