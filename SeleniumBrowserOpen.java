package Javaweek2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class SeleniumBrowserOpen {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		driver.findElement(By.name("login")).click();
		
		String title =driver.getTitle();
		System.out.println(title);
		
		
	}


}
