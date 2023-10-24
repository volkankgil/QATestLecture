import javax.sound.midi.Soundbank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SelfIntroduction {

	public static void main(String[] args) {
		
		// İnvoking Browser
		
		// Chrome - ChromeDriver ->Methods
		// Firefox - FireFoxDriver ->methods if run different browser, the methods is same only we have to create browser object which we work currently
		
		
		System.setProperty("webdriver.chrome.driver","/Users/satınalma2.AYG01/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//Microsoft edge driver 
		//System.setProperty("webdriver.edge.driver","/Users/satınalma2.AYG01/msedgedriver.exe");
		//WebDriver driver=new EdgeDriver();
		
		driver.get("https://rahulshettyacademy.com/"); // sayfayı çalıştırıyor.
		System.out.println(driver.getTitle()); //sayfanın başlığını getiriyor.
		System.out.println(driver.getCurrentUrl()); //mevut url'yi ekrana bastırır.
		System.out.print(driver.getPageSource()); // sayfanın kaynak kodunu getiriyor
		//driver.close();
		//driver.quit(); // quit close'dan farklı olarak açılan ilişkili bütün pencereleri kapatır.
		
		
		


	}

}
