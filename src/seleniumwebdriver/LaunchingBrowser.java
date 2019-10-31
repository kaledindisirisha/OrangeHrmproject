package seleniumwebdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchingBrowser {
	public static void main(String args[]) {
		String browserName="chrome";
		WebDriver driver=null;
		
		if(browserName.equals("chrome")) {
     System.setProperty("webdriver.chrome.driver","D:\\OrangeHRM\\code base\\resources\\chromedriver.exe");
		driver= new ChromeDriver();
		/*}else if(browserName.equals("firefox")) {
     System.setProperty("webdriver.gecko.driver","D:\\OrangeHRM\\code base\\resources\\geckodriver.exe)");
	 driver=new FirefoxDriver();
		
		}else if(browserName.equalsIgnoreCase("internet explorer")){
			System.setProperty("WebDriver.ie.driver","\"D:\\\\OrangeHRM\\\\code base\\\\resources\\\\chromedriver.exe)");
		 driver= new InternetExplorerDriver();
		}else {
			System.out.println("invalid browser");
		}*/
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		
	}
	
	

}
}
