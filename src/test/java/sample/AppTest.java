package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AppTest {
	
	   @ Test
	   public void maincall()
	   {
	           System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");  
	           //IE,Firefox,Chrome,safari
	           WebDriver driver=new ChromeDriver(); 
	           driver.navigate().to("https://www.phptravels.net/home"); 
	           driver.manage().window().maximize();
	   }
	      
	      
	   //   @Test
	      public void maincalll()
	      {
	   	   System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");  
	          //IE,Firefox,Chrome,safari
	          WebDriver driver=new ChromeDriver(); 
	          driver.navigate().to("https://www.phptravels.net/home"); 
	          driver.manage().window().maximize();
	   	   
	      }
	      

}
