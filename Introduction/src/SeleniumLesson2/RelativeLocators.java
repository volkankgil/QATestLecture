package SeleniumLesson2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.*;

import net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record.ForDefinedMethod.WithAnnotationDefaultValue;

public class RelativeLocators {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","/Users/satınalma2.AYG01/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		
		WebElement nameEditBox=driver.findElement(By.xpath("/html/body/app-root/form-comp/div/form/div[1]/input"));
		System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText());
		
		WebElement dateOfBirth=driver.findElement(By.xpath("/html/body/app-root/form-comp/div/form/div[7]/label"));
		driver.findElement(with(By.tagName("input")).below(dateOfBirth)).click();
		
		WebElement clickElement=driver.findElement(By.xpath("/html/body/app-root/form-comp/div/form/div[4]/label"));
		driver.findElement(with(By.tagName("input")).toLeftOf(clickElement)).click();
		
		WebElement studentElement=driver.findElement(By.xpath("/html/body/app-root/form-comp/div/form/div[6]/div[1]/input"));
		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(studentElement)).getText());

	}

}
