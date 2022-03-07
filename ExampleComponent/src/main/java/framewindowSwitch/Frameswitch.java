package framewindowSwitch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frameswitch {
	public static void main(String[] args) throws Exception {
	WebDriverManager.chromedriver().setup(); 
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
	driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"post-2669\"]/div[2]/div/div/div[1]/p/iframe")));
	
	WebElement drag1 = driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[1]/img"));
	WebElement drop1 =driver.findElement(By.xpath("//*[@id=\"trash\"]"));
	Actions a1 = new Actions(driver);
	a1.dragAndDrop(drag1, drop1).perform();
	Thread.sleep(2000);
	driver.close();
	
	
		/*driver.switchTo().defaultContent();
		
		Thread.sleep(4000);

		driver.switchTo().frame(driver.findElement(By.name("packageFrame")));
		driver.findElement(By.linkText("WebDriver")).click();
		driver.switchTo().defaultContent();
		
		Thread.sleep(4000);
		
		driver.switchTo().frame(driver.findElement(By.name("classFrame")));
		driver.findElement(By.linkText("SearchContext")).click(); */

	}

}
