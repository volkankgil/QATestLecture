import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A101 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/Users/satınalma2.AYG01/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.a101.com.tr/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div[1]/div[2]/button[4]")).click();
		
		Thread.sleep(3000);
	
		driver.findElement(By.cssSelector("body > section > main > div > div:nth-child(7) > div.new-campaign-title > a")).click();
		
		List <WebElement> products=driver.findElements(By.xpath("/html/body/section/section[3]/div[3]/div[3]/div/div[2]/div"));
		
		for(int i=0;i<products.size();i++){
			String name=products.get(i).getText();
			System.out.println(name);
			if(name.contains("Samsung Z Fold 5 256 GB")) {
				driver.findElements(By.xpath("/html/body/section/section[3]/div[3]/div[3]/div/div[2]/div/div/ul/li[1]/article/div/div[2]/div[2]")).get(i).click();
				
			}
		}
		
		driver.findElement(By.xpath("/html/body/section/section[2]/div[2]/div[1]/div/div[3]/div[2]/div[1]/button")).click();
	}
} 
