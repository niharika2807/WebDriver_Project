package testing;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertsExample {
	public static void main (String[]args) throws InterruptedException{
		
		@SuppressWarnings("unused")
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 //driver.close();
	
		WebElement btn1 = driver.findElement(By.id("alertButton")) ;
		btn1.click();
		Alert alt1= driver.switchTo().alert();
		Thread.sleep(5000);
		alt1.accept();
		
		
		// Click cancel on the pop up
				
				// for error you need to add this-> ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", 
		
		WebElement btn3 = driver.findElement(By.id("confirmButton")) ;
		btn3.click();
		Alert alt3= driver.switchTo().alert();
		Thread.sleep(5000);
		alt3.dismiss();
		// Enter the message on pop up box
				WebElement Btn4 = driver.findElement(By.id("promtButton"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Btn4);
				Btn4.click();
				
				Alert alt4 = driver.switchTo().alert();
				alt4.sendKeys("Niharika");
				alt4.accept();
driver.close();
	
	}
	
	

}
