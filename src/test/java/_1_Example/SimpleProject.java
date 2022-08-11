package _1_Example;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.get("http://demo.automationtesting.in/Index.html");
		
		String title = driver.getTitle();
		System.out.println("launching page title" + driver.getTitle());
		
		
		WebElement usernameField = driver.findElement(By.id("email"));
		
	
		usernameField.sendKeys("test@mail.com");
		
	
		WebElement proceedButton = driver.findElement(By.id("enterimg"));
		proceedButton.click();
		
		
		String nextPageTitleString = driver.getTitle();
		
	
		System.out.println("Next page title is:" +nextPageTitleString);
		
		
		driver.quit();
		
		
	}

}
