package Week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class create_lead_test_case {
	
	public static void main(String[] args) {
		
		
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
		
		driver.findElement(By.ByTagName.linkText("Leads")).click(); //->//a[text() = 'Leads']
		
	}
	
}
