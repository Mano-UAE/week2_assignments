package Week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2_CreateLead {

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver/chromedriver.exe"); 	
		ChromeDriver driver = new ChromeDriver();
					driver.get("http://leaftaps.com/opentaps/control/main");
					driver.manage().window().maximize();
					WebElement E = driver.findElementByXPath("//input[@id='username']");
					E.sendKeys("demosalesmanager");
					driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
					driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
					driver.findElementByXPath("(//a)[2]").click();
					driver.findElementByXPath("//a[text()='Leads']").click();
					driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("(//input[@type='text'])[30]").sendKeys("daq");
		//Thread.sleep(1000);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		//driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]").click();
		driver.findElementByLinkText("10119").click();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		driver.findElementByXPath("//a[text()='Edit']").click();
		driver.findElementById("updateLeadForm_companyName").sendKeys("BNY");
		driver.findElementByName("submitButton").click();
		System.out.println(driver.findElementById("viewLead_companyName_sp").getText());
	}

}
//

