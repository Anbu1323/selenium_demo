package SelDemo;

import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDemo {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\White_Devil\\\\eclipse-workspace\\\\SeleniumDemo\\\\driver\\\\chromedriver.exe");
		

		WebDriver demo = new ChromeDriver();
		Thread.sleep(2000);
		demo.manage().window().maximize();
		
		Thread.sleep(3000);
		
		
		////Actions
		
		demo.get("https://www.leafground.com/drag.xhtml");
		
		System.out.println(demo.getTitle());
		
		
		
	

		
		///select class example
		
demo.get("https://www.facebook.com/");
		String title = demo.getTitle();
		System.out.println(title);
		Thread.sleep(3000);
		demo.findElement(By.xpath("//a[contains(@data-testid,'open-registration-form-button')]")).click();
		Thread.sleep(6000);
		demo.manage().window().fullscreen();		
		WebElement month =  demo.findElement(By.id("month"));
		Select s = new Select(month);
		Thread.sleep(2000);
		List<WebElement> options = s.getOptions();
		
		for(WebElement web:options) {
			System.out.println(web.getText());
		}

			s.selectByVisibleText("Oct");
			
			WebElement year = demo.findElement(By.id("year"));
			Select y = new Select(year);
			List<WebElement> opti =  y.getOptions();
			Thread.sleep(3000);
			for(WebElement web:opti) {
			System.out.println(web.getText());
			}
			
			WebElement day = demo.findElement(By.id("day"));
			Select d = new Select(day);
			
		d.selectByValue("20");
		Thread.sleep(2000);
		s.selectByVisibleText("May");
		Thread.sleep(2000);
		y.selectByVisibleText("1986");

		
		     ///Frames
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}
	
}
