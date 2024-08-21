package assetManagement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SubCatogory {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://asset.management.upc.org/login");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	
		
	//Login
		driver.findElement(By.id("email")).sendKeys("admin.ocs@gmail.com",Keys.TAB,Keys.TAB,"Ocs@2024",Keys.ENTER);
		driver.manage().window().maximize();
		
	//SubCatogory
		driver.findElement(By.xpath("//div[text()='Category']")).click();
		driver.findElement(By.xpath("//div[text()='Sub Category']")).click();
		
		//AddSubCatogry
		driver.findElement(By.linkText("Add Sub Category")).click();
		
		//Code
		driver.findElement(By.id("code")).sendKeys("742");
		
		//Name
		driver.findElement(By.id("name")).sendKeys("injection filler");
		
		//Description
		driver.findElement(By.id("description")).sendKeys("Handle with care");
		
		//Main catrogory
		WebElement select=driver.findElement(By.xpath("//select[@name='parent_id']"));
		Select cat=new Select(select);
		cat.selectByValue("28");
		
		//save
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		
	
		
		
		
		
		
		
		
		
		
	}
	
	

}
