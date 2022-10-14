package locator_learning;

import java.awt.Checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MySecondlocator_Test {
	@Test
	
	public void MyFIrstTest () throws InterruptedException{
		
		WebDriverManager.chromedriver().setup();
		//create a chromeDriver object named driver.
		WebDriver driver = new ChromeDriver();
		
		//go to google web page
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//Maximize the browser window
		
//		driver.manage().window().maximize();
		
	
		
		WebElement header = driver.findElement(By.tagName("h1"));
		String textString = header.getText();		
		System.out.println(textString);
		
	    header = driver.findElement(By.cssSelector("h1"));
		textString = header.getText();		
		System.out.println(textString);
		
		header = driver.findElement(By.xpath("//h1"));
		textString = header.getText();		
		System.out.println(textString);
		
		WebElement radiobuttonexample = driver.findElement(By.xpath("//fieldset/legend"));
		textString = radiobuttonexample.getText();		
		System.out.println(textString);
	
		radiobuttonexample = driver.findElement(By.cssSelector("fieldset > legend"));
		textString = radiobuttonexample.getText();		
		System.out.println(textString);
		
		WebElement radiobuttonexample1 = driver.findElement(By.xpath("//input[@value='radio1' and @name='radioButton' ]"));
		radiobuttonexample1.click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("input[value='radio2'][name='radioButton']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[contains(@value,'dio3')]")).click();
		
		Thread.sleep(3000);
		
        driver.findElement(By.cssSelector("input[value*='dio2']")).click();
		
		Thread.sleep(3000);
		
        driver.findElement(By.xpath("//input[starts-with(@id,'autocom')]")).sendKeys("Hello");
        	
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[starts-with(@id,'autocom')]")).clear();
		
		Thread.sleep(3000);
		
		
		driver.findElement(By.cssSelector("input[id^='autocom']")).sendKeys("Hello world!");      	
		Thread.sleep(3000);	
		
        driver.findElement(By.xpath("//input[starts-with(@id,'autocom')]")).clear();
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//input[ends-with(@id,'tocomplete')]")).sendKeys("Hello 3");  	
		Thread.sleep(3000);			
		
		driver.findElement(By.cssSelector("input[id$='mplete']")).sendKeys("Hello 3");      	
		Thread.sleep(3000);
	
		
		driver.findElement(By.cssSelector("input[id$='mplete']")).clear();     	
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//*[@id='autocomplete']")).sendKeys("Hello 4");  	
		Thread.sleep(3000);	
		
		String textString2 =  driver.findElement(By.xpath("//label[@for='radio2'] /following-sibling ::label")).getText(); 
		System.out.println(textString);
		
		textString =  driver.findElement(By.xpath("//label[@for='radio2'] /preceding-sibling ::label")).getText(); 
		System.out.println(textString);
		
		textString =  driver.findElement(By.xpath("//fieldset/ label[contains(@for,'radio')][last()]")).getText(); 
		System.out.println(textString);
		
		textString =  driver.findElement(By.cssSelector("fieldset label[for*='radio']:nth-child(2)")).getText(); 
		System.out.println(textString);
		
		//close the browser all active window
		driver.quit();		
	}

}
