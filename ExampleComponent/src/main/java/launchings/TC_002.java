package launchings;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;

public class TC_002 extends BaseTest
{
	private static final Logger log = Logger.getLogger(TC_002.class);
	public static void main(String[] args) throws Exception 
	{
		init();
		log.info("Init the properties files....");
		launcher("chromebrowser");
		log.info("open chrome browser" + p.getProperty("chromebrowser"));
		navigateUrl("LSTURL");
		log.info("navigate to LST application" + childProp.getProperty("LSTURL"));
		typeText("Username_id","ARaminen");
		log.info("enter user name  :-" + orProp.getProperty("Username_id"));
		typeText("Password_id","Nitin@1007");
		log.info("enter password  :-" + orProp.getProperty("Password_id"));
		clickElement("Loginbutton_id");
		log.info("login into application  :-" + orProp.getProperty("Loginbutton_id"));
		clickElement("PTComponent_xpath");
		log.info("user selects pT component :-" + orProp.getProperty("Username_id"));
		 /* Thread.sleep(5000);		
		clickElementdropdown("dropdown_xpath");
		clickElement("selectcable_xpath");
		typeText("ccno_xpath","ccn0q");
		typeText("Revision_xpath","A1");
		clickElement("create_xpath"); */
		
		driver.quit();
	}

}