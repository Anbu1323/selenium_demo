package Xpaths;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicXpathdemo {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\White_Devil\\eclipse-workspace\\SeleniumDemo\\driver\\chromedriver.exe");

		WebDriver test = new ChromeDriver();
		test.manage().window().maximize();
		test.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		test.get("https://www.google.com/");
		
		test.findElement(By.id("APjFqb")).sendKeys("Automation");
		
		List<WebElement> suggestion =	test.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@role='option']"));
		
		for (WebElement web : suggestion) {
			System.out.println(web.getText());
			
		}
		
		String select = "automation engineer";

		for (WebElement web : suggestion) {
			String s = web.getText();
			if(s.equals(select)) {
				web.click();
				break;
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	}
	
	


