package SeleniumLesson2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import net.bytebuddy.implementation.bytecode.ShiftLeft;

public class actionsDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/satınalma2.AYG01/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		
		Actions a=new Actions(driver);

		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
		//Moves to specific element
		a.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[2]"))).contextClick().build().perform();

	}

}
