package SelDemo;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import net.bytebuddy.asm.Advice.Enter;

public class Practice {

	public static void main1(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\White_Devil\\eclipse-workspace\\SeleniumDemo\\driver\\chromedriver.exe");

		WebDriver test = new ChromeDriver();
		
		test.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		test.get("https://www.google.com/");
		test.findElement(By.name("q")).sendKeys("anbu", Keys.ENTER);
		
		List<WebElement> word = test.findElements(By.xpath("//*[contains(text(),'anbu') or contains(text(),'Anbu')]"));
		
		System.out.println(word.size());
		
		test.quit();
	   
	}
	
	public static void main2(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\White_Devil\\eclipse-workspace\\SeleniumDemo\\driver\\chromedriver.exe");

		WebDriver test = new ChromeDriver();
		
		test.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		test.get("https://www.geeksforgeeks.org/how-to-make-the-table-of-values-of-a-linear-function/");
		
		WebElement Table = test.findElement(By.xpath("(//figure[@class='table'])[3]"));
	
		List<WebElement> rows = Table.findElements(By.cssSelector("tbody tr"));
		
		int sum = 0;
		for (int i = 0; i < rows.size(); i++) {
			List<WebElement> allcolumns = rows.get(i).findElements(By.tagName("td"));

			WebElement values = allcolumns.get(2);
			String text = values.getText();
			System.out.println(text);
			 sum +=  Integer.parseInt(text);
			 
		}
		System.out.println("");
		System.out.println("Total is " + sum);
		test.quit();
		
	
		
	}
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\White_Devil\\eclipse-workspace\\SeleniumDemo\\driver\\chromedriver.exe");

		WebDriver test = new ChromeDriver();
		
		test.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		test.get("https://exam.unom.ac.in/results/ugresult.asp");
		test.findElement(By.name("regno")).sendKeys("312108869");
		test.findElement(By.name("pwd")).sendKeys("26/10/2003");
		test.findElement(By.xpath("//input[@type='button']")).click();
		
		WebElement Table = test.findElement(By.xpath("//table[3]"));
		
		List<WebElement> rows = Table.findElements(By.cssSelector("tbody tr"));
		int sum = 0;
		for (int i = 0; i < rows.size(); i++) {
			List<WebElement> allcolumns = rows.get(i).findElements(By.tagName("td"));
			WebElement marks = allcolumns.get(2);
			String values = marks.getText();
			
			System.out.println(values);
			
			sum += Integer.parseInt(values);
			
			
		}
		
		System.out.println("The total mark is"+ sum);
		
		System.out.println("Arrear in one subject");
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	

