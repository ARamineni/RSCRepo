package actionclassp;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Actionsuggestion {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.com/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
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
		  

		
		String val = driver.findElement(By.xpath("//*[@id=\"src\"]")).getAttribute("value");
		  
		  List<WebElement> list = driver.findElements(By.xpath("//*[@id=\"search\"]/div/div[1]/div/ul/li[1]"));
		  for(int i=0;i<list.size();i++)
		  {
			  if(list.get(i).getText().equalsIgnoreCase(val))
			  {
				  list.get(i).click();
				  return;
			  }
			  list = driver.findElements(By.xpath("(//*[@id=\"search\"]/div/div[1]/div/ul/li[1]"));
		  }
		  Thread.sleep(3000);
		  WebElement inputbox = driver.findElement(By.xpath("//*[@id=\"src\"]"));
		  inputbox.sendKeys(Keys.ARROW_DOWN);
		  inputbox.sendKeys(Keys.ARROW_DOWN);
		  Thread.sleep(3000);
		
		 
		Actions act = new Actions(driver);
	   // act.sendKeys(Keys.DOWN).perform();
	    //Thread.sleep(3000);
		// act.sendKeys(Keys.DELETE).perform();
		// Thread.sleep(3000); 
	  // act.sendKeys(Keys.ENTER).perform();
	   // Thread.sleep(3000); 
		//act.keyDown(inputbox, val).perform();
		//Thread.sleep(3000); 
	    
	   act.keyDown(Keys.CONTROL).perform();
       act.sendKeys("a").perform();
      //act.keyDown(Keys.DELETE).perform();
       inputbox.sendKeys(Keys.DELETE);
       Thread.sleep(3000); 
       js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		//js.executeScript("document.getElementById('u_0_h_gF').scrollIntoView()");
		
		js.executeScript("window.history.back()");
		
		Thread.sleep(4000);
		
		js.executeScript("window.history.forward()");
		
		Thread.sleep(4000);
		
		js.executeScript("window.history.go(0)");
		driver.close();
		
		
		driver.quit();

	}

}
