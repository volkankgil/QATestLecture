package SeleniumLesson2;


import java.util.List;
import java.util.stream.Collectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FilterWebTable {

public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","/Users/satınalma2.AYG01/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/greenkart/#/offers");

        driver.findElement(By.id("search-field")).sendKeys("Rice"); 

        List<WebElement> veggies=driver.findElements(By.xpath("//tr/td[1]")); // bütün rice yazılan sütünün xpath'i yani bütün vegetableslar

        //1 results

        List<WebElement> filteredList= veggies.stream().filter(veggie->veggie.getText().contains("Rice")).

        collect(Collectors.toList());

        //1 result

       Assert.assertEquals(veggies.size(), filteredList.size());

}
}