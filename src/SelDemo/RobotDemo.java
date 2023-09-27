package SelDemo;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotDemo {
	
	public static void main(String[] args) throws Exception {
		
		////For automated keyboard controls
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\White_Devil\\eclipse-workspace\\SeleniumDemo\\driver\\chromedriver.exe");
		
		WebDriver drive = new ChromeDriver();
		drive.manage().window().maximize();
		
		drive.get("https://www.facebook.com/");
		
		Actions a = new Actions(drive);
		
		WebElement keycheck = drive.findElement(By.xpath("//img[contains(@alt,'Facebook')]"));
		
		
		Robot r = new Robot();
				a.contextClick(keycheck).build().perform();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);

		r.keyPress(KeyEvent.VK_ENTER);
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
