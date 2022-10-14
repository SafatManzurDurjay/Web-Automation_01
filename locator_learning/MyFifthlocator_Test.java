package locator_learning;

import java.awt.Checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.DriverSetup;

public class MyFifthlocator_Test {
	@Test
	
	public void MyFIrstTest () throws InterruptedException{
		
		WebDriverManager.chromedriver().setup();
		//create a chromeDriver object named driver.
		WebDriver driver = new ChromeDriver();
		
		//go to google web page
		driver.get("https://www.rokomari.com/book");
		//Maximize the browser window
			
	    WebElement inputTextElement = driver.findElement(By.cssSelector("a[class='logged-out-user-menu-btn btn btn-secondary']"));
		inputTextElement.click();
				
		Thread.sleep(3000);
		
		inputTextElement = driver.findElement(By.cssSelector("p[class='js--registration-form-btn text-uppercase']"));
		inputTextElement.click();
					
		Thread.sleep(3000);
		
		inputTextElement = driver.findElement(By.cssSelector("input[id='nm']"));
		inputTextElement.sendKeys("Safat Manzur Durjay");
					
		Thread.sleep(3000);
		
		inputTextElement = driver.findElement(By.cssSelector("input[id='js-email']"));
		inputTextElement.sendKeys("safatmanzur@gmail.com");
					
		Thread.sleep(3000);
		
		inputTextElement = driver.findElement(By.cssSelector("input[id='js-phone']"));
		inputTextElement.sendKeys("01790891807");
					
		Thread.sleep(3000);

		inputTextElement = driver.findElement(By.cssSelector("input[id='pwd']"));
		inputTextElement.sendKeys("12348765ab");
					
		Thread.sleep(9000);
		
		
		inputTextElement = driver.findElement(By.cssSelector("button[onclick=\"gtag('event', 'sign_up');\"]"));
		inputTextElement.click();
					
		Thread.sleep(3000);
		
		
		//String textString = inputTextElement.getText();
				
		
//		driver.manage().window().maximize();
      	
			
		//close the browser all active window
		driver.quit();		
	}

}
