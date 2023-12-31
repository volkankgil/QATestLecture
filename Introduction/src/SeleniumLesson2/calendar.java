package SeleniumLesson2;

	import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
	
	public class calendar {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","/Users/satınalma2.AYG01/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	driver.get("https://www.path2usa.com/travel-companions");
	Actions actions=new Actions(driver);
	actions.click(driver.findElement(By.xpath("/html/body/div/div/div[1]/div/label/span[2]")));

	
	//April 23
	driver.findElement(By.xpath(".//*[@id='travel_date']")).click();


	while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("May")){
	driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
	}

	List<WebElement> dates= driver.findElements(By.className("day"));
	
	//Grab common attribute//Put into list and iterate
	int count=driver.findElements(By.className("day")).size();

	for(int i=0;i<count;i++){
		
	String text=driver.findElements(By.className("day")).get(i).getText();
					if(text.equalsIgnoreCase("21")){
					driver.findElements(By.className("day")).get(i).click();
					break;
				}
			}
		}
	}

