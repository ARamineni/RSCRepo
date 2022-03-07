package launchings;

public class TC_003 extends BaseTest {

	public static void main(String[] args) throws Exception  {
		
		init();
		launcher("firefoxbrowser"); 
		navigateUrl("LSTURL");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}