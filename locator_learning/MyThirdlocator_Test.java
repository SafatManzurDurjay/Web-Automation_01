package locator_learning;

import java.awt.Checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyThirdlocator_Test {
	@Test
	
	public void MyFIrstTest () throws InterruptedException{
		
		WebDriverManager.chromedriver().setup();
		//create a chromeDriver object named driver.
		WebDriver driver = new ChromeDriver();
		
		//go to google web page
		driver.get("https://www.amazon.com/");
		//Maximize the browser window
			
	    WebElement inputTextElement = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		String textstring = inputTextElement.getText();
				
		Thread.sleep(3000);
		
		inputTextElement = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		inputTextElement.sendKeys("T-shirt");
		
		Thread.sleep(3000);
		
		inputTextElement = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		inputTextElement.click();
		
		Thread.sleep(3000);
		
		inputTextElement = driver.findElement(By.xpath("//span[@class='a-size-base a-color-base a-text-normal']"));
		inputTextElement.click();
		
		Thread.sleep(3000);
		
		inputTextElement = driver.findElement(By.cssSelector("input[id='add-to-cart-button']"));
		inputTextElement.click();
		
		Thread.sleep(3000);
			
		
		//String textString = inputTextElement.getText();
				
		
//		driver.manage().window().maximize();
      	
			
		//close the browser all active window
		driver.quit();		
	}

}
