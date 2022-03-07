package verificationpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Check1 {
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.in.yahoo.com");
		
		//String actualLink = driver.findElement(By.linkText("Customer Service")).getText();
		String actualLink = driver.findElement(By.linkText("Term")).getAttribute("innerHTML");
		String expectedLink = "term";
		
		System.out.println("Actual Link : " +  actualLink);
		System.out.println("Expected Link : " +  expectedLink);
		
		//if(actualLink.equals(expectedLink))
		//if(actualLink.equalsIgnoreCase(expectedLink))
		//if(actualLink.contains(expectedLink))
		if(actualLink.toLowerCase().contains(expectedLink.toLowerCase()))
			System.out.println("Both links are equal...");
		else
			System.out.println("Both links are not equal...");
	}

}
