

import java.sql.Driver;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class baseOfİmplicitAndExplicitWait {



public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver","/Users/satınalma2.AYG01/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	//implicity wait
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));// her satırda element'i bulamaz ise 5 sn bekler, eğer 5 sn'den önce bulursa direk diğer satıra geçer.
	//implicity waitte performans sorunlarını göremeyiz. sayfa 5 sn 'de yüklensede hata vermeyecek ve kullanıcı çok bekleyecektir. 
	
	//explicit wait
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
	
	driver.get("https://rahulshettyacademy.com/seleniumPractise/");

	String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot"};

	addItems(driver,itemsNeeded);
	
	driver.findElement(By.xpath("/html/body/div/div/header/div/div[3]/a[4]/img")).click();
	
	driver.findElement(By.xpath("/html/body/div/div/header/div/div[3]/div[2]/div[2]/button")).click();
	
	//driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("promoCode"))); //wxplicit waitte sadece bir sonraki kod bloğunu bekler.  visibility yerine clicable gibi farklı metodlar var. 
	driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy");
	driver.findElement(By.className("promoBtn")).click();
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
	System.out.println(driver.findElement(By.className("promoInfo")).getText());
}

public static  void addItems(WebDriver driver,String[] itemsNeeded) {

	int j=0;

	List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));

	for(int i=0;i<products.size();i++) {

		//Brocolli - 1 Kg

		//Brocolli,    1 kg

		String[] name=products.get(i).getText().split("-");
		String formattedName=name[0].trim();

		//format it to get actual vegetable name

		//convert array into array list for easy search

		//  check whether name you extracted is present in arrayList or not-

		List<String> itemsNeededList = Arrays.asList(itemsNeeded);

		if(itemsNeededList.contains(formattedName)) {

			j++;

			//click on Add to cart

			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

			if(j==itemsNeeded.length) {

				break;

				}

			}
		
		}

	}

}