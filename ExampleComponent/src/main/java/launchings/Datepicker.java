package launchings;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Datepicker {

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
		
	/*	int row = driver.findElements(By.xpath("/html[1]/body[1]/div[5]/table[1]/tbody[1]/tr")).size();
		int col = driver.findElements(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[2]/th")).size();
		System.out.println("Total number of rows = " + row);
		System.out.println("Total number of columns = " + col);
		//List<WebElement> dateList  = driver.findElements(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[]/td[]"));
		for(int i=3; i<row; i++){
			{
			for(int j=1; j<col; j++)
			{
				
				List<WebElement> dateList = driver.findElements(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[\" + i +\"]/td[\" + j + \"]"));
			
				String dateText = driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[" + i +"]/td[" + j + "]")).getText();
				if(dateText.equals("21"))
				{
					driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[" + i +"]/td[" + j + "]")).click();
					break;
				}
				
			}
			}
	*/
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"our_distribution_div\"]/div/ul/li[2]/span[1]/span")).click();
		Thread.sleep(4000);
		driver.close();
	}
		
	}



