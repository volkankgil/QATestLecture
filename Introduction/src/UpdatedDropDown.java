import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v114.input.Input;
import org.testng.Assert;

public class UpdatedDropDown {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver","/Users/satınalma2.AYG01/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
		
		
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		//Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected()); // assertion kontrolünde üstteki kodda boolean true döndüğü ve biz false kontrolü yaptığımızdan test fail oldu. Bu koddan sonra devam etmez.
		Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		
		System.out.println(driver.findElements(By.cssSelector("Input[type='checkbox']")).size());  
		
		driver.findElement(By.id("divpaxinfo")).click();
		
		//System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		
		
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")){
			
			System.out.println("it's enabled");
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}
			
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
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"3 Adult");// kaç adet adult işaretlediğini gösteriyor.

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	}

}
