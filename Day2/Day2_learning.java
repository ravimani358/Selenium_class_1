package Week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day2_learning {

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
					
					driver.findElement(By.xpath(("(//input[@class = 'inputLogin'])[1]"))).sendKeys("demosalesmanager");
					
					driver.findElement(By.xpath(("(//input[@class = 'inputLogin'])[2]"))).sendKeys("crmsfa");
					
					driver.findElement(By.className("decorativeSubmit")).click();
		
	}

}
