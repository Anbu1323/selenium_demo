package SelDemo;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class meeshotest {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\White_Devil\\\\eclipse-workspace\\\\SeleniumDemo\\\\driver\\\\chromedriver.exe");
		
		WebDriver meesho = new ChromeDriver();
				meesho.manage().window().maximize();

		meesho.get("https://www.meesho.com/");
		
		
		System.out.println(meesho.getTitle());
		
		Thread.sleep(3000);
		WebElement search = meesho.findElement(By.xpath("(//input[contains(@font-weight,'book')])[1]"));
		search.click();
		Thread.sleep(2000);
		
		search.sendKeys("Mobile cases");
		Thread.sleep(2000);
				meesho.manage().window().fullscreen();

		meesho.findElement(By.xpath("//p[text()='mobile cases & covers']")).click();
		Thread.sleep(5000);
		
		meesho.findElement(By.xpath("//img[contains(@alt,'Others,Mi Redmi 9A Cases & Covers')]")).click();
		Thread.sleep(5000);
		
		TakesScreenshot scrs = (TakesScreenshot) meesho;
//		
//		File image = scrs.getScreenshotAs(OutputType.FILE);
//		
//		File save = new File("C:\\Users\\White_Devil\\eclipse-workspace\\SeleniumDemo\\pngs\\mi.png");
//		
//		
//		FileUtils.copyFile(image, save);
				
//				meesho.get("https://demoqa.com/alerts");
//				
//				Thread.sleep(3000);
//				meesho.findElement(By.id("alertButton")).click();
//				Thread.sleep(2000);
//				
//				meesho.switchTo().alert().accept();
//				
//				meesho.findElement(By.id("confirmButton")).click();
//				Thread.sleep(2000);
//				meesho.switchTo().alert().dismiss();
//				meesho.manage().window().fullscreen();
//				
//				meesho.findElement(By.id("promtButton")).click();
//				Thread.sleep(2000);
//				meesho.switchTo().alert().sendKeys("come on");
//				meesho.switchTo().alert().accept();
				
				
				
				
				
		
		
		
		
		
	}
	

}
