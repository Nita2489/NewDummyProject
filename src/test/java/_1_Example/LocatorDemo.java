package _1_Example;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://automationpractice.com/index.php");
		
//		WebElement searchButton = driver.findElement(By.id("search_query_top"));
//		searchButton.sendKeys("T-shirts");
//		
//		driver.findElement(By.name("submit_search")).click();
//		
//		driver.findElement(By.linkText("Printed Chiffon Dress")).click();
//		driver.findElement(By.partialLinkText("Chiffon Dress")).click();
//		
		
		int sliders = driver.findElements(By.className("homeslider-container")).size();
	    System.out.println(sliders);
	    
	    int links = driver.findElements(By.tagName("a")).size();
	    System.out.println(links);
		//driver.quit();
	}

}
