import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/satınalma2.AYG01/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));   //ekranda gözüken yazıların bekleme süresi için bekleme veriyoruz ki ilgili selector aktif hale gelsin. 
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.id("inputUsername")).sendKeys("Marin");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademyy");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // forgot your password'a basınca aynı sayflar arasında geçiş olduğu için 1 sn işlem selenium'a yaptırmıyoruz. 
		
		driver.findElement( By.xpath("//input[@placeholder='Name']")).sendKeys("Marin");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("volkankgil@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("volkankgil@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("14142421441");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.className("go-to-login-btn")).click();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // forgot your password'a basınca aynı sayflar arasında geçiş olduğu için 1 sn işlem selenium'a yaptırmıyoruz. 
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("marin");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/form/button")).click();
	}
}
