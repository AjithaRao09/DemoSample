package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AppTest {
	
	   @ Test(groups = {"Modulue1"})
	   public void maincall()
	   {
	           System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");  
	           //IE,Firefox,Chrome,safari
	           System.out.println("Modulue1");
	           WebDriver driver=new ChromeDriver(); 
	           driver.navigate().to("https://www.phptravels.net/home"); 
	           driver.manage().window().maximize();
	   }
	      
	   @ Test(groups= {"Modulue 2"})
	   public void mainnncall()
	   {
	           System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");  
	           //IE,Firefox,Chrome,safari
	           System.out.println("modulue2");
	           WebDriver driver=new ChromeDriver(); 
	           driver.navigate().to("https://www.phptravels.net/home"); 
	           driver.manage().window().maximize();
	   }
	      


}
