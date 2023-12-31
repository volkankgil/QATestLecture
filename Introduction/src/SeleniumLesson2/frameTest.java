package SeleniumLesson2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frameTest {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","/Users/satınalma2.AYG01/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.jqueryui.com/droppable/");
	
	System.out.println(driver.findElements(By.tagName("iframe")).size()); //bu sayfada kaç adet frame var gösterir
	
	//driver.switchTo().frame( driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/iframe")));
	//driver.findElement(By.id("draggable")).click();
	
	driver.switchTo().frame(0);
	
	Actions actions =new Actions(driver);
	
	WebElement source=driver.findElement(By.id("draggable"));
	WebElement target=driver.findElement(By.id("droppable"));
	
	actions.dragAndDrop(source, target).build().perform();  // action devreye girmesi için build ve perform metodlarını çalıştırmalıyız. 
	
	//html kodunda frame var ise inspectte iframe diye çıkar. 

	driver.switchTo().defaultContent();

}
}
