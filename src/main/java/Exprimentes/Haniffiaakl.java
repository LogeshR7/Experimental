package Exprimentes;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Haniffiaakl {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://haniffakl.asuscomm.com:2311/Demo/");
		
		//Login
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("durai");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Mani1206*");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.manage().window().maximize();
		
		//purchase
		driver.findElement(By.linkText("Purchase")).click();
		driver.findElement(By.xpath("(//span[text()='ALT+P'])[2]")).click();
		
		//purchase insert
		driver.findElement(By.xpath("//span[text()=' INSERT']")).click();
		
		//vendor grid
		WebElement vendor=driver.findElement(By.id("vendor"));
		vendor.sendKeys("HN JEWEL");
		Thread.sleep(2000);
		vendor.sendKeys(Keys.ARROW_DOWN);
		vendor.sendKeys(Keys.ENTER);
		
		//P Grid
		WebElement skulist= driver.findElement(By.id("sku"));
		skulist.sendKeys("1000155");
		Thread.sleep(2000);
		skulist.sendKeys(Keys.ARROW_DOWN);
		skulist.sendKeys(Keys.ENTER);
		
		//Description
		Thread.sleep(2000);
		driver.findElement(By.id("product_remark")).sendKeys("Good One");
		
		//UOM Type
		Thread.sleep(2000);
		WebElement uom =driver.findElement(By.id("sku_uom_type"));
		Select uomType=new Select(uom);
		uomType.selectByIndex(1);
		
		//Qty
		Thread.sleep(1000);
		driver.findElement(By.id("quantity")).sendKeys("10");
		
        //FOC
		Thread.sleep(1000);
		driver.findElement(By.id("foc_quantity")).sendKeys("1");
		
		//Unit price
		Thread.sleep(1000);
		WebElement up=driver.findElement(By.id("price"));
		up.clear();
		up.sendKeys("18",Keys.TAB);
		
		//ADd
		driver.findElement(By.id("addItem")).click();
		
		
		//Save
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()=' Save ']")).click();
		
		//edit
		driver.findElement(By.xpath("(//i[@class='fa fa-edit'])[1]")).click();
		
		//Converet to grn
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()=' Convert GRN ']" )).click();
		
		//Leave alert
		//Alert save=driver.switchTo().alert();
		//save.accept();
		//Thread.sleep(2000);
		
		//PGRn Reference number
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='reference_no']")).sendKeys("LOgesh Auto82");
		
		//Pgrn save
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='fa fa-save']")).click();
		
		//pgrn to invoice
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='checker']")).click();
		driver.findElement(By.xpath("//span[text()=' Convert Invoice']")).click();
		
		//Inventory
		driver.findElement(By.xpath("//span[text()='Inventory']")).click();
		driver.findElement(By.xpath("//span[text()='ALT+M']")).click();
		//search
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Product Name']")).sendKeys("1000155");
		driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();

		//scroll
		WebElement sl=driver.findElement(By.xpath("//td[text()='QOH Qty']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",sl);
		
		Thread.sleep(7000);
		driver.quit();
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
