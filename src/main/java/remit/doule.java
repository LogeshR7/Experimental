package remit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class doule {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://remittance.ocs.org/remittance/public/login");
		
		//Login
		driver.findElement(By.id("login")).sendKeys("dosth");
		driver.findElement(By.id("password")).sendKeys("itsmedosth");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		//list
		driver.findElement(By.linkText("Remit")).click();
		driver.findElement(By.linkText("List")).click();
		driver.findElement(By.xpath("(//i[@aria-hidden='true'])[4]")).click();
		driver.findElement(By.name("pay_status")).click(); 
		driver.findElement(By.id("paymode_CASH")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("paymode_SPLITCASH3")).click();
		Actions bulider=new Actions(driver);
		WebElement dd=driver.findElement(By.xpath("(//button[text()='Submit'])[2]"));
	
		
	

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",dd);
		bulider.doubleClick(dd).perform();
		

	}
}