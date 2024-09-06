package RemitCashCustomer;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RemitCustomerCreate {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://remittance.ocs.org/remittance/public/login");
		
		//Login
		driver.findElement(By.id("login")).sendKeys("dosth");
		driver.findElement(By.id("password")).sendKeys("itsmedosth");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.manage().window().maximize();
		
		//Indiviual customer
		driver.findElement(By.xpath("//span[text()='Individual Customer']")).click();
		
	//MAS Customer Type *
		WebElement maslist=driver.findElement(By.id("mc_type"));
		Select mas=new Select(maslist);
		mas.selectByIndex(2);
		
		//nric
		driver.findElement(By.xpath("//input[@placeholder='Enter NRIC No']")).sendKeys("S7963120f21");
		
		//Name
		driver.findElement(By.xpath("(//input[@placeholder='Enter Name'])[1]")).sendKeys("benchlast");
		
//		//Screenshot
//		TakesScreenshot shot=(TakesScreenshot)driver;
//		File mmm=shot.getScreenshotAs(OutputType.FILE);
//		File vmv=new File("C:\\Users\\ocs new\\OneDrive\\Pictures\\Saved Pictures/lokkuu.jpg");
//		FileUtils.copyFile(mmm, vmv);
		
		//DOB
		driver.findElement(By.name("date_of_birth")).sendKeys("22042001",Keys.TAB);
		
		//Nationality
		WebElement nation=driver.findElement(By.id("nationality"));
		Select nan=new Select(nation);
		nan.selectByIndex(5);
		
		//Identifier Type
		WebElement id=driver.findElement(By.id("identifier_type"));
		Select idd=new Select(id);
		idd.selectByIndex(4);
		
		//DOE
		driver.findElement(By.name("date_of_expiry")).sendKeys("22042025",Keys.TAB);
		
		//MEmbercode
		driver.findElement(By.name("MemCode")).sendKeys("123456");
		
		//Country
		WebElement con=driver.findElement(By.id("country"));
		Select com=new Select(con);
		com.selectByIndex(5);
		
		//Postalcode
		driver.findElement(By.id("postal_code")).sendKeys("610109");
		
		//Adress
		driver.findElement(By.id("address")).sendKeys("204/20 ASIAD COLONY ANNA NAGAR WEST CHENNAI");
		
		//unit number
		driver.findElement(By.xpath("(//span[@class='checkmark'])[3]")).click();
		
		//contact
		driver.findElement(By.name("tele_no")).sendKeys("8668027706");
		
		//Save
				WebElement ddd=driver.findElement(By.xpath("//button[text()='Save']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",ddd);
		ddd.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
}

}
