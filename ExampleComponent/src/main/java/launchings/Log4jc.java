package launchings;
import org.apache.log4j.Logger;


public class Log4jc extends BaseTest {
private static final Logger log = Logger.getLogger(Log4jc.class);
	
	public static void main(String[] args) throws Exception 
	{
		init();
		log.info("Init the properties files....");
		
		launcher("chromebrowser");
		log.info("Opening the browser :-" + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		log.info("Navigate to url : " + childProp.getProperty("amazonurl"));
		
		selectOption("amazondropbox_id","Books");
		log.info("Selecting the Option Books By using locator :-" + orProp.getProperty("amazondropbox_id"));
		
		typeText("amazonsearchtext_id","Harry Potter");
		log.info("Enter the text Harry Potter By using locator :-" + orProp.getProperty("amazonsearchtext_id"));
		
		clickElement("amazonsearchbutton_xpath");
		log.info("Clicked on Element By using Locator : - " + orProp.getProperty("amazonsearchbutton_xpath"));
		
		
		


}
}
