package SelDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {
	
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\White_Devil\\eclipse-workspace\\SeleniumDemo\\driver\\chromedriver.exe");
		
		WebDriver drive = new ChromeDriver();
				Actions d = new Actions(drive);
				drive.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		drive.get("https://www.leafground.com/drag.xhtml");
		drive.manage().window().maximize();
		///drag elements
		
		Thread.sleep(2000);
		WebElement drag =  drive.findElement(By.id("form:conpnl"));
		
		d.clickAndHold(drag).build().perform();
		d.dragAndDropBy(drag, 350, 0).build().perform();
		
		
		
		WebElement drop = drive.findElement(By.id("form:drag"));
	
		d.clickAndHold(drop).build().perform();
		Thread.sleep(3000);
		WebElement down = drive.findElement(By.id("form:drop"));
		d.dragAndDrop(drop, down).build().perform();
		
				
				///demo
		
				
				
				
				
				
				
				
				
				
		
		

		
		
		
		
		
		
	}

}
