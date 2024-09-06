package Exprimentes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Stockissue {
@DataProvider(name="logins",parallel = true)
	public String[][] data() {
		String[][] login=new String [2][2];
		login[0][0]="durai";
		login[0][1]="Mani1206*";
		
		login[1][0]="logesh";
		login[1][1]="logesh12345";
		return login;
		
		
	}
@Test(dataProvider = "logins")
public void stock(String email,String pass) throws Exception {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("http://haniffakl.asuscomm.com:2311/Demo/");
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	//Login
			driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(email);
			driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pass);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			driver.manage().window().maximize();
			
			//Stock
			driver.findElement(By.xpath("//span[text()='Stock']")).click();
			
	//Stock request
			driver.findElement(By.xpath("//i[@Class='fa fa-list']")).click();
			
			//insert
			driver.findElement(By.xpath("//span[text()=' INSERT']")).click();
			
			//To location
			WebElement loc=driver.findElement(By.name("to_location_id"));
			Select location=new Select(loc);
			location.selectByIndex(1);
			
			//sku
			WebElement sku= driver.findElement(By.id("sku"));
			sku.sendKeys("1000180");
			Thread.sleep(2000);
			sku.sendKeys(Keys.DOWN);
			sku.sendKeys(Keys.ENTER);
			
			
			Thread.sleep(2000);
			//qty'
			driver.findElement(By.id("quantity")).sendKeys("10");
			
			//add
			driver.findElement(By.id("salesAddItem")).click();
			Thread.sleep(2000);
			//save
			driver.findElement(By.xpath("//button[@title='Save']")).click();
			
			
	
}








}
