package assetManagement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Department {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("http://asset.management.upc.org/login");
		driver.manage().window().maximize();
		
		//Login
		driver.findElement(By.id("email")).sendKeys("admin.ocs@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Ocs@2024");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		
		
		//Department
		driver.findElement(By.xpath("//div[text()='Departments']")).click();
		
		//Insert
		driver.findElement(By.linkText("Add Department")).click();
		
		//Code
		
		driver.findElement(By.id("code")).sendKeys("129");
		
		//Name
		driver.findElement(By.id("name")).sendKeys("C-BLOCK 1ST FLOOR");
		
		//save
		driver.findElement(By.xpath("//button[text()='Save']")).click();
	}

}
