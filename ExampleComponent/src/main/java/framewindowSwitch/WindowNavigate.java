package framewindowSwitch;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowNavigate {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.com/");
		
		driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[3]")).click();
		while(!driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[2]")).getText().contains("Apr 2022"))
		{
			driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[3]/button")).click();
		}
		
		//driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[5]/td[3]")).click();
		
		
		List<WebElement> dateList = driver.findElements(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr/td"));
		for(int i=0;i<dateList.size();i++)
		{
			String dateText = dateList.get(i).getText();
			System.out.println(dateText);
			if(dateText.equals("21"))
			{
				dateList.get(i).click();
				break;
			}
			}
	
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"our_distribution_div\"]/div/ul/li[2]/span[1]/span")).click();
		Thread.sleep(4000);
		Set<String> windows = driver.getWindowHandles();
		List<String> nwinds = new ArrayList<String>(windows);
		
		for(String i :nwinds)
		{
			System.out.println(i);
		}
		
		System.out.println(driver.getTitle() +"---->" + driver.getWindowHandle());
		
		driver.switchTo().window(nwinds.get(1));
		System.out.println(driver.getTitle() +"---->" + driver.getWindowHandle());
		
		driver.findElement(By.xpath("//*[@id=\"src\"]")).sendKeys("Guntur");
		
		Thread.sleep(1000);
		
		driver.quit();
	}
		
	}



