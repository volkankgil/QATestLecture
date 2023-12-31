package SeleniumLesson2;

import java.util.List;

import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.Assertion;

import dev.failsafe.internal.util.Assert;
import io.netty.handler.codec.http.cookie.CookieHeaderNames.SameSite;

public class JavaScriptExecution {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/Users/satınalma2.AYG01/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,500)"); //site içerisinde scroll ile aşağıya iniyoruz.
		
		Thread.sleep(4000);
		
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000"); // tablo içinde scroll ile aşağıya iniyoruz
		
		List<WebElement>values=driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)")); // tablo içindeki amountların elementi
		
		int sum=0;
		
		for(int i=0;i<values.size();i++) {
			
		sum+=Integer.parseInt(values.get(i).getText()); // tablodaki amountları topluyoruz

		}

		System.out.println(sum);
		
		int total=Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
	
		System.out.println(total);
		
		org.testng.Assert.assertEquals(sum, total);
	}
}
