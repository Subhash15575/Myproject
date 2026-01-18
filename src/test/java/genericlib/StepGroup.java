package genericlib;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StepGroup {

	
		
		public WebDriver driver;
		
		public PropertyFile pdata=new PropertyFile();
		
		public WebDriverutilities driverutilities=new WebDriverutilities();
		
		@BeforeMethod
		public void openApp() throws IOException
		{
			WebDriverManager.chromedriver().setup();
			
			driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(pdata.getPropertyData("url"));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
		}
		@AfterMethod
		public void closeApp(ITestResult res) throws IOException
		{
			int status=res.getStatus();
			
			String name=res.getName();
			
			if(status==2)
			{
				Screenshot s=new Screenshot();
				s.getscreenshot(driver, name);
			}
			
			driver.quit();
		}

	}


