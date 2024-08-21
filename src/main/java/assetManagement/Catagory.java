package assetManagement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Catagory {
	
	public static void main(String args[]) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://asset.management.upc.org/login");
		
		//Login
		driver.findElement(By.id("email")).sendKeys("admin.ocs@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Ocs@2024");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		//Catogory
		driver.findElement(By.xpath("//div[text()='Category']")).click();
		//Mani Catogry
		driver.findElement(By.xpath("//div[text()='Main Category']")).click();
		
		//Insert
				driver.findElement(By.linkText("Add Category")).click();
				//code
				driver.findElement(By.id("code")).sendKeys("213");
				
				//Name
				driver.findElement(By.id("name")).sendKeys("OX Clynider");
				
				//Department select
				WebElement DPSelect=driver.findElement(By.id("department_id"));
		Select dp=new Select(DPSelect);
		dp.selectByIndex(2);
		
		//Description
		driver.findElement(By.id("description")).sendKeys("Handle with care plz");
		
		//Save
		driver.findElement(By.xpath("//button[text()='Save']")).click();
				
				
				
				
				
				
				
				
	
	
	
	
	
	
	
	
	
	
	}

}
