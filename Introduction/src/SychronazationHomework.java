import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SychronazationHomework {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/satınalma2.AYG01/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/form/div[4]/div/label[2]/span[2]")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();

		WebElement dropDownListElement=driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/form/div[5]/select"));
		Select optionSelect=new Select(dropDownListElement);
		optionSelect.selectByVisibleText("Teacher");
		
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-shop/div/div/div[2]/app-card-list/app-card[1]/div/div[2]/button")));
		driver.findElement(By.xpath("/html/body/app-root/app-shop/div/div/div[2]/app-card-list/app-card[1]/div/div[2]/button")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-shop/div/div/div[2]/app-card-list/app-card[2]/div/div[2]/button")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-shop/div/div/div[2]/app-card-list/app-card[3]/div/div[2]/button")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-shop/div/div/div[2]/app-card-list/app-card[4]/div/div[2]/button")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-shop/nav/div/div/ul/li/a")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-shop/div/div/div/table/tbody/tr[6]/td[5]/button")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("country")));
		driver.findElement(By.id("country")).sendKeys("izmir");
		
		driver.findElement(By.xpath("/html/body/app-root/app-shop/div/app-checkout/div[1]/div[2]/label")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-shop/div/app-checkout/div/ngx-smart-modal/div[2]/button[1]")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-shop/div/app-checkout/div[1]/form/input")));
		driver.findElement(By.xpath("/html/body/app-root/app-shop/div/app-checkout/div[1]/form/input")).click();
	}

}
