package screenshotpack;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllLinks {

	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.in.yahoo.com");
		
		//String link1 = driver.findElement(By.linkText("Images")).getText();
		//System.out.println(link1);
   /*  List<WebElement> links = driver.findElements(By.xpath("ranjan"));
		
		if(links.size()==0)
		{
			File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(srcFile, new File("C:\\Users\\Public\\yahoo.jpeg"));
		}
*/
	  System.out.println("---------------------------");
		
		 List<WebElement> links2 = driver.findElements(By.tagName("a"));
		for(int i=0;i<links2.size();i++)
		{
			String lnk = links2.get(i).getText();
			System.out.println(lnk);
		}
		
		System.out.println("----------------------------");
		
		List<WebElement> links3 = driver.findElements(By.xpath("//*[@class='compCardList ps-quicklinks yui3-skin-sam']/ul"));
		for(int j=0;j<links3.size();j++)
		{
			String lk = links3.get(j).getText();
			System.out.println(lk);
		}
		
		List<WebElement> links4 = driver.findElements(By.xpath("//*[@class='compCardList ps-quicklinks yui3-skin-sam']/ul"));
		for(int k=0;k<links4.size();k++)
		{
			Date dt = new Date();
			String d = dt.toString().replace(':', '_').replace(' ', '_');
			
			String linkName = links4.get(k).getText();
			links4.get(k).click();
			File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(srcFile, new File("C:\\Users\\Public\\"+"_"+d+".png"));
			Thread.sleep(3000);
			driver.navigate().back();   
			Thread.sleep(2000);
			links4 = driver.findElements(By.xpath("//*[@class='compCardList ps-quicklinks yui3-skin-sam']/ul"));
			
			//Thread.sleep(8000);
			//driver.navigate().back();   
			//Thread.sleep(2000);
		}
		driver.close();
       
	} 
}
