import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class Locators2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","/Users/satınalma2.AYG01/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));   //ekranda gözüken yazıların bekleme süresi için bekleme veriyoruz ki ilgili selector aktif hale gelsin. 
		String password=getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.id("inputUsername")).sendKeys("Marin");
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("#root > div > div > div > p")).getText());
		Assert.assertEquals(driver.findElement(By.cssSelector("#root > div > div > div > p")).getText(),"You are successfully logged in."); // assert ile beklenilen sonuc gelip gelmediği kontrol ediliyor. yazı veya rakam olabilir.
		Thread.sleep(3000);
		driver.findElement(By.className("logout-btn")).click();
		driver.close();

	}
	
	public static String getPassword(WebDriver driver) {
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passwordText=driver.findElement(By.cssSelector("form p")).getText();
		
		//Please use temporary password 'rahulshettyacademy' to Login.
		String [] passwordArray=passwordText.split("'");
		
		// Oth index  - Please use temporary password
		// 1th index  - raulshettyacademy' to Login.
		
		String [] passwordArray2=passwordArray[1].split("'");
		
		// Oth index  - raulshettyacademy
		// 1th index  - to Login.
				
		String password=passwordArray2[0];
		return password;
	}

}
