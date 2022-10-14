package locator_learning;

import java.awt.Checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyFourthlocator_Test {
	@Test
	
	public void MyFIrstTest () throws InterruptedException{
		
		WebDriverManager.chromedriver().setup();
		//create a chromeDriver object named driver.
		WebDriver driver = new ChromeDriver();
		
		//go to google web page
		driver.get("https://www.rokomari.com/book");
		//Maximize the browser window
			
	    WebElement inputTextElement = driver.findElement(By.xpath("//a[@class='logged-out-user-menu-btn btn btn-secondary']"));
		inputTextElement.click();
				
		Thread.sleep(3000);
		
	    inputTextElement = driver.findElement(By.xpath("//input[@id='j_username']"));
		inputTextElement.sendKeys("safatmanzur@gmail.com");
					
		Thread.sleep(3000);
		
	    inputTextElement = driver.findElement(By.xpath("//input[@id='j_password']"));
		inputTextElement.sendKeys("12348765acgf");
						
		Thread.sleep(3000);
		
		inputTextElement = driver.findElement(By.xpath("//button[@class='btn btn-block']"));
		inputTextElement.click();
							
		Thread.sleep(3000);
		
		
		//String textString = inputTextElement.getText();
				
		
//		driver.manage().window().maximize();
      	
			
		//close the browser all active window
		driver.quit();		
	}

}
