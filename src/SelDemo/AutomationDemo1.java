package SelDemo;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.ExecuteScript;

public class AutomationDemo1 {
	
	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\White_Devil\\eclipse-workspace\\SeleniumDemo\\driver\\chromedriver.exe");

		WebDriver test = new ChromeDriver();
		test.manage().window().maximize();
		test.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		test.get("https://www.saucedemo.com/");
		
		Actions mouseControl = new Actions(test);
		Robot boardControl = new Robot();
//		test.manage().window().fullscreen();

		Thread.sleep(3000);
		
		
		test.findElement(By.id("user-name")).sendKeys("standard_user");
		
		Thread.sleep(3000);
		
		WebElement passwd = test.findElement(By.xpath("//div[contains(@class,'login_password')]"));
		
		
		mouseControl.doubleClick(passwd);
		Thread.sleep(2000);
		mouseControl.contextClick(passwd).build().perform();
		
		boardControl.keyPress(KeyEvent.VK_DOWN);
		boardControl.keyRelease(KeyEvent.VK_DOWN);
		
		
		
		boardControl.keyPress(KeyEvent.VK_ENTER);
		boardControl.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		WebElement id = test.findElement(By.id("password"));
		mouseControl.contextClick(id).build().perform();
		
		boardControl.keyPress(KeyEvent.VK_DOWN);
		boardControl.keyRelease(KeyEvent.VK_DOWN);
		
		boardControl.keyPress(KeyEvent.VK_DOWN);
		boardControl.keyRelease(KeyEvent.VK_DOWN);
		boardControl.keyPress(KeyEvent.VK_DOWN);
		boardControl.keyRelease(KeyEvent.VK_DOWN);
		boardControl.keyPress(KeyEvent.VK_DOWN);
		boardControl.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		
		boardControl.keyPress(KeyEvent.VK_DOWN);
		boardControl.keyRelease(KeyEvent.VK_DOWN);
		
		
		boardControl.keyPress(KeyEvent.VK_ENTER);
		boardControl.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		test.findElement(By.id("login-button")).click();
		
		Thread.sleep(2000);
//		test.switchTo().alert().accept();
		
		JavascriptExecutor search = (JavascriptExecutor) test;
		
		WebElement addtocart = test.findElement(By.xpath("//a[text()='LinkedIn']"));
		
		search.executeScript("arguments[0].scrollIntoView();", addtocart);
		
		test.findElement(By.xpath("//div[text()='Test.allTheThings() T-Shirt (Red)']")).click();
		Thread.sleep(2000);
		
		WebElement cart = test.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)"));
		cart.click();
		Thread.sleep(2000);
		
		WebElement cartlist = test.findElement(By.className("shopping_cart_link"));
		cartlist.click();
		Thread.sleep(2000);
		
		WebElement checkout = test.findElement(By.id("checkout"));
		checkout.click();
		Thread.sleep(2000);
		
		
		WebElement consname = test.findElement(By.id("first-name"));
		consname.sendKeys("Baasha");
		Thread.sleep(2000);
		
		test.findElement(By.id("last-name")).sendKeys("M");
		Thread.sleep(2000);
		
		test.findElement(By.id("postal-code")).sendKeys("612345");
		
		test.findElement(By.id("continue")).click();
		Thread.sleep(2000);
		
				WebElement confirmorder = test.findElement(By.id("finish"));

		search.executeScript("arguments[0].scrollIntoView();", confirmorder);
		Thread.sleep(2000);
		
		confirmorder.click();
		Thread.sleep(2000);
		
		WebElement home = test.findElement(By.id("back-to-products"));
		home.click();
		Thread.sleep(2000);
		
		WebElement menu = test.findElement(By.id("react-burger-menu-btn"));
		menu.click();
		Thread.sleep(2000);
		
		WebElement logout = test.findElement(By.id("logout_sidebar_link"));
		logout.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
