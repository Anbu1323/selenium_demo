package SelDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaExecuterdemo   {

	////Scroll down and up
	
	public static void main(String[] args) throws Exception {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\White_Devil\\eclipse-workspace\\SeleniumDemo\\driver\\chromedriver.exe");
		
		WebDriver drive = new ChromeDriver();
		
		drive.get("https://www.facebook.com/");
		drive.manage().window().maximize();
		
		JavascriptExecutor je = (JavascriptExecutor) drive;
		
		
		WebElement see = drive.findElement(By.xpath("//span[text()=' Meta © 2023']"));
		je.executeScript("arguments[0].scrollIntoView()", see);
		
		Thread.sleep(3000);
		je.executeScript("window.scroll(0,-2000)","");
		
	}
	
	
}
