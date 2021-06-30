import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Learn_Login {

	public static void main(String[] args) {
		
		
//--------------------> Test Leaf Credentials --------------------------->
		
		// http://leaftaps.com/opentaps/cpntrol/main
		// demosalesmanager
		// crmsfa
//-------------------------> end ---------------------------------------->
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		//Load the URL
		
		driver.get("http://leaftaps.com/opentaps/control/logout");
		
		//Maximize screen
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		String Title = driver.getTitle();
		
		System.out.println(Title + "Webpage Tile");
		
		// get Title of the page
				
		String heading = driver.findElement(By.tagName("h2")).getText();
		
		System.out.println("string "+ heading);
		
		driver.findElement(By.ByTagName.linkText("CRM/SFA")).click();
		
		driver.findElement(By.ByTagName.linkText("Leads")).click();
		
		driver.findElement(By.ByTagName.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ravi");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sankar");
		
		// Write Code on the DropDown
		
		WebElement DropDown_Input = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		Select drop_Down = new Select(DropDown_Input);
		
		drop_Down.selectByValue("LEAD_COLDCALL");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		// Verify we are in the View Lead Page
		
		String Lead_Title = driver.getTitle();
		
		if(Lead_Title.equals("View Lead | opentaps CRM")) {
			
			System.out.println("In the View page");
			
		}
		
		else {
			System.out.println("Given input are wrong");
		}
		
		// Get Text on the Name
		
		String Company_name = driver.findElement(By.id("viewLead_companyName_sp")).getText();
				
		// -> all Non Integer values "Key Word (\\D)"
		
		System.out.println(Company_name.replaceAll("\\D", ""));
		
		
		
	}

}
