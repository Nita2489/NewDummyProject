package _1_Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _2_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Index.html");
		
		String title = driver.getTitle();
		System.out.println("Launching page title" + driver.getTitle());
		
		WebElement userNameField = driver.findElement(By.id("email"));
		userNameField.sendKeys("test@mail.com");
		
		WebElement proceedButton = driver.findElement(By.id("enterimg"));
		proceedButton.click();
		
		WebElement firstName = driver.findElement(By.xpath("//div[]"));
		firstName.sendKeys("Nita");
		
		String nextpageTitle = driver.getTitle();
		System.out.println("Launching next page title " + driver.getTitle() );
		
		driver.quit();
		
	}

}
