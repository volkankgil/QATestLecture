import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/satınalma2.AYG01/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
		
		//dropdown with select tag-static
		
		WebElement staticDropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select dropDownSelect=new Select(staticDropdown);
		//dropDownSelect.selectByIndex(2);
		System.out.println(dropDownSelect.getFirstSelectedOption().getText());
		
		dropDownSelect.selectByVisibleText("AED");
		System.out.println(dropDownSelect.getFirstSelectedOption().getText());
		
		dropDownSelect.selectByValue("INR");
		System.out.println(dropDownSelect.getFirstSelectedOption().getText());
		

	}

}
