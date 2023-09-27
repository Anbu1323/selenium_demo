package SelDemo;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementsDemo {
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\White_Devil\\eclipse-workspace\\SeleniumDemo\\driver\\chromedriver.exe");

		WebDriver test = new ChromeDriver();
		test.manage().window().maximize();
		test.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		
		Robot boardcntrl = new Robot();
		
		test.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		
//		test.findElement(By.xpath("//button[text()=\"✕\"]")).click();
		
		WebElement search = test.findElement(By.xpath("//input[@type=\"text\"]"));
		search.sendKeys("Poco mobiles");
		
		boardcntrl.keyPress(KeyEvent.VK_ENTER);
		boardcntrl.keyRelease(KeyEvent.VK_ENTER);
		
		List<WebElement> poco = test.findElements(By.xpath("//div[@style=\"width: 100%;\"]"));
		for (WebElement web : poco) {
			System.out.println(web.getText());
			
		}
		
		String select = "POCO X5 5G (Jaguar Black, 256 GB)";

         for (WebElement web : poco) {
        	 String text = web.getText();
        	 
        	 if(text.equals(select)) {
        		 web.click();
        		 break;
        	 }
			
		}
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	

}
