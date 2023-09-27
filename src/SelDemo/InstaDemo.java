package SelDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstaDemo {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\White_Devil\\eclipse-workspace\\SeleniumDemo\\driver\\chromedriver.exe");
		
		WebDriver demo = new ChromeDriver();
		
		demo.manage().window().maximize();
		
		demo.get("https://www.instagram.com/accounts/emailsignup/");
		
//		demo.navigate().back();
		String title = demo.getTitle();
		System.out.println(title);
		
		Thread.sleep(2000);
		demo.findElement(By.name("emailOrPhone")).sendKeys("vcanbu7@gmail.com");
		Thread.sleep(2000);
		
		demo.findElement(By.name("fullName")).sendKeys("Testing");
		Thread.sleep(2000);
		demo.findElement(By.name("username")).sendKeys("selenitest");
		Thread.sleep(5000);
		demo.findElement(By.xpath("//span[text()='Refresh suggestion']")).click();
		Thread.sleep(3000);
		demo.findElement(By.name("password")).sendKeys("Test@123");
		Thread.sleep(2000);

		demo.findElement(By.xpath("//button[text()='Show']")).click();
		
        		Thread.sleep(2000);

		demo.findElement(By.xpath("//button[text()='Hide']")).click();




//		demo.findElement(By.xpath("//img[contains(@alt,'Get it on Google Play')]")).click();

		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	

}
