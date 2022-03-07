package launchings;

import com.aventstack.extentreports.Status;

public class TCExtrenalReport extends BaseTest {
	public static void main(String[] args) throws Exception 
	{
		init();
		test = rep.createTest("TCExtrenalReport");
		test.log(Status.INFO, "Init the properties files....");
				
		launcher("chromebrowser");
		test.log(Status.INFO, "Opening the browser :-" + p.getProperty("chromebrowser"));
		
		navigateUrl("LSTURL");
		test.log(Status.PASS, "Navigate to url : " + childProp.getProperty("LSTURL"));
		
		typeText("Username_id","ARaminen");
		test.log(Status.PASS, "USER ENTERS USERNAME" + orProp.getProperty("Username_id") );
		
		typeText("Password_id","Nitin@1007");
        test.log(Status.PASS, "USER ENTERS password" + orProp.getProperty("Password_id") );
		
		clickElement("Loginbutton_id");
		 test.log(Status.PASS, "login into application  :" + orProp.getProperty("Loginbutton_id") );
		
		clickElement("PTComponent_xpath");
		test.log(Status.PASS, "user selects pT component :-" + orProp.getProperty("PTComponent_xpath"));	
		
		rep.flush();
		
		driver.close();
				
	}

}
