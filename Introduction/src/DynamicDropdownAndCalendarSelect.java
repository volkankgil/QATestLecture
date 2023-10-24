import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdownAndCalendarSelect {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/satınalma2.AYG01/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");


		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
	
	driver.findElement(By.xpath("//*[@id=\"dropdownGroup1\"]/div/ul[1]/li[5]/a")).click();
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[5]/div[2]/div[2]/div[2]/div[3]/div/div[3]/div/div[2]/div[2]/div/table/tbody/tr[2]/td[2]/div[3]/div[1]/div/ul[1]/li[2]/a")).click();
	
	driver.findElement(By.xpath("/html/body/div/div[1]/table/tbody/tr[5]/td[5]/a")).click();
	
	}

	}

