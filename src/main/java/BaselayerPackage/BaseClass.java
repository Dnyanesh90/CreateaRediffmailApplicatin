package BaselayerPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseClass {
	
	protected static WebDriver driver;

	public static void inilization() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\kadam\\eclipse-workspace1\\Create a Rediffmail account\\CreateaRediffmailApplicatin\\AllDriversFolder\\chromedriver.exe");
		
		driver =new ChromeDriver();
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		

	}

}
