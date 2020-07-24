package Week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4_DuplicateLead {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver/chromedriver.exe"); 
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		WebElement E = driver.findElementByXPath("//input[@id='username']");
		E.sendKeys("demosalesmanager");
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		driver.findElementByXPath("(//a)[2]").click();
		driver.findElementByXPath("//a[text()='Leads']").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//span[contains(text(),'Emai')]").click();
		driver.findElementByName("emailAddress").sendKeys("t1@gmail.com");
		Thread.sleep(2000);
		driver.findElementByXPath("(//button[@class='x-btn-text'])[7]").click();
		Thread.sleep(3000);
      driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]").click();
        Thread.sleep(4000);
        driver.findElementByXPath("//a[text()='Duplicate Lead']").click();
        Thread.sleep(2000);
        driver.findElementByXPath("//input[@value='Create Lead']").click();
        Thread.sleep(3000);
        String title = driver.getTitle();
        if(title.contains("Duplicate Lead"))
        {
        	System.out.println("Title Matches");
        }
        driver.findElementByXPath("//input[@value='Create Lead']").click();
        Thread.sleep(3000);
        String text = driver.findElementByXPath("//span[@id='viewLead_firstName_sp']").getText();
		/*System.out.println(text+"    "+ leadname);
        if(text.equals(leadname))
        {
        	System.out.println("Duplicate Lead is created");
        }
       
	}*/

}
}
