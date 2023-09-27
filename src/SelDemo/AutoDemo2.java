package SelDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoDemo2 {
	
	public static void main(String[] args) throws Exception {
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\White_Devil\\eclipse-workspace\\SeleniumDemo\\driver\\chromedriver.exe");

	WebDriver test = new ChromeDriver();
	test.manage().window().maximize();
	test.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	    String mailId = "aqz123@gmail.com";  ///  aqz123@gmail.com
        String password = "Abc123@";         ///  Abc123@
        
        String testdataMail = "zxc1@gmail.com";
        String testdatNumber = "9876543210";
        String testdataAddress = "No-1, saidapet, chennai";
        String testdataCity = "Chennai";
        String testdataPincode = "674532";
        String testdataCountry = "India";
        
	
	test.get("https://thinking-tester-contact-list.herokuapp.com/");
	
	WebElement signup = test.findElement(By.id("signup"));
	signup.click();
//	Thread.sleep(3000);
	
	
	test.findElement(By.id("firstName")).sendKeys("Just Me");
//	Thread.sleep(2000);
	
	test.findElement(By.id("lastName")).sendKeys("Hi");
//	Thread.sleep(2000);
	
	
	WebElement mail = test.findElement(By.id("email"));
			mail.sendKeys(mailId);
//	Thread.sleep(2000);
	
	WebElement pass = test.findElement(By.id("password"));
	pass.sendKeys("1234");
//	Thread.sleep(2000);
	
	WebElement signin =  test.findElement(By.id("submit"));
	signin.click();
//	Thread.sleep(3000);
	
	pass.clear();
	pass.sendKeys(password);
//	Thread.sleep(2000);
	
	signin.click();
//	Thread.sleep(3000);
	
	WebElement cancel = test.findElement(By.id("cancel"));
	cancel.click();
//	Thread.sleep(2000);
	
	WebElement loginmail = test.findElement(By.id("email"));
	loginmail.equals(mail);
	loginmail.sendKeys(mailId);
	
	WebElement loginpass = test.findElement(By.id("password"));
	loginpass.sendKeys(password);
//     Thread.sleep(2000);
     
     test.findElement(By.id("submit")).click();
//     Thread.sleep(3000);
	
	WebElement newcontact = test.findElement(By.id("add-contact"));
	newcontact.click();
//	Thread.sleep(3000);
	
	test.findElement(By.xpath("//input[contains(@placeholder,'First Name')]")).sendKeys("Human");
//	Thread.sleep(1000);
	test.findElement(By.id("lastName")).sendKeys("being");
//	Thread.sleep(1000);
	test.findElement(By.id("birthdate")).sendKeys("1986-05-20");
//	Thread.sleep(1000);
	test.findElement(By.id("email")).sendKeys(testdataMail);
//	Thread.sleep(1000);
	test.findElement(By.id("phone")).sendKeys(testdatNumber);
//	Thread.sleep(1000);
	test.findElement(By.id("street1")).sendKeys(testdataAddress);
	test.findElement(By.id("street2")).sendKeys(testdataAddress);
//	Thread.sleep(2000);
	test.findElement(By.id("city")).sendKeys(testdataCity);
//	Thread.sleep(1000);
	test.findElement(By.id("stateProvince")).sendKeys("State");
//	Thread.sleep(1000);
	test.findElement(By.id("postalCode")).sendKeys(testdataPincode);
//	Thread.sleep(1000);
	test.findElement(By.id("country")).sendKeys(testdataCountry);
	Thread.sleep(3000);
	
	test.findElement(By.id("submit")).click();
	Thread.sleep(2000);
	
	
	WebElement lout =  test.findElement(By.xpath("//button[@class='logout']"));
	lout.click();
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
}