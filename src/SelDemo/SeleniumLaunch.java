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

public class SeleniumLaunch  {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\White_Devil\\eclipse-workspace\\SeleniumDemo\\driver\\chromedriver.exe");

		WebDriver test = new ChromeDriver();


		test.manage().window().maximize();
		
		test.get("https://www.facebook.com/");
		
		String title = test.getTitle();
		System.out.println(title);
		
		Thread.sleep(3000);
		
		test.findElement(By.xpath("//a[contains(@data-testid,'open-registration-form-button')]")).click();
		Thread.sleep(6000);

		
		test.findElement(By.name("firstname")).sendKeys("selenium");
		Thread.sleep(2000);
		test.findElement(By.name("lastname")).sendKeys("Testing");
		Thread.sleep(2000);                                  
		
		
		test.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("mailid123@gmail.com");
		Thread.sleep(3000);
		
		test.findElement(By.name("reg_email_confirmation__")).sendKeys("mailid123@gmail.com");
		Thread.sleep(2000);
		
		test.findElement(By.id("password_step_input")).sendKeys("Abc123@");
		Thread.sleep(2000);
		
//		test.findElement(By.name("birthday_day")).sendKeys("20");
//		Thread.sleep(2500);
//		
//		test.findElement(By.name("birthday_month")).sendKeys("May");
//		Thread.sleep(2000);
//		
//		test.findElement(By.name("birthday_year")).sendKeys("1986");
//		Thread.sleep(2500);
		
		WebElement date = test.findElement(By.id("day")); 
		Select d = new Select(date);
		d.selectByValue("20");
		Thread.sleep(2000);
		
		WebElement mon = test.findElement(By.id("month"));
		Select m = new Select(mon);
		m.selectByVisibleText("May");
		Thread.sleep(2000);
		
		List<WebElement> opt = m.getOptions();
		for(WebElement web:opt) {
			System.out.println(web.getText());
		}

		WebElement year = test.findElement(By.id("year"));
		Select y = new Select(year);
		y.selectByValue("1986");
		Thread.sleep(2000);
		
		
		test.findElement(By.xpath("//input[contains(@name, 'sex')][1]")).click();
		
//		TakesScreenshot bugreport = (TakesScreenshot) test;
//		
//		File reg = bugreport.getScreenshotAs(OutputType.FILE);
//		
//		File save = new File("C:\\Users\\White_Devil\\eclipse-workspace\\SeleniumDemo\\pngs\\Fb_reg.png");
//		
//		FileUtils.copyFile(reg, save);
//		
		

		 
		
		

		
		
		
	}

}
