package _2_Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
 //      driver.findElement(By.className("_2KpZ6l _2doB4z").
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("iphone");
		
//	    WebElement searchButton = driver.findElement(By.className("_34RNph"));
		search.sendKeys(Keys.ENTER);
	
		driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/section[7]/div[2]/div[1]/div[1]/div[1]/label[1]/div[1]")).click();
	   
		driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/a[1]/div[1]/div[1]/div[1]/div[1]/img[1]")).click();
	
	}
	
}
