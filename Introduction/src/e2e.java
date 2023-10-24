import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class e2e {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/satınalma2.AYG01/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		driver.findElement(By.xpath("//*[@id=\"dropdownGroup1\"]/div/ul[1]/li[5]/a")).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("/html/body/form/div[4]/div[2]/div/div[5]/div[2]/div[2]/div[2]/div[3]/div/div[3]/div/div[2]/div[2]/div/table/tbody/tr[2]/td[2]/div[3]/div[1]/div/ul[1]/li[2]/a")).click();
		//driver.findElement(By.xpath("/html/body/div/div[1]/table/tbody/tr[5]/td[5]/a")).click();
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")){
			
			System.out.println("it's enabled");
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}
		
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		
		driver.findElement(By.id("divpaxinfo")).click();
		
		try {
			Thread.sleep(4000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int i=1;
		while(i<3) {
		driver.findElement(By.id("hrefIncAdt")).click();
		i++;
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();	
		
		driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();	
		
		//dropdown with select tag-static
				WebElement staticDropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
				Select dropDownSelect=new Select(staticDropdown);
				dropDownSelect.selectByIndex(2);
				
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
		System.out.println(driver.switchTo().alert().getText()); //alert pop up açılan text'i yazdırıyoruz
		driver.switchTo().alert().accept(); // alert pop up çıktığında kabul etmek için accept , cancel butonu için
											// dismiss seçiyoruz.

	}

}
