package javabasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static void main(String[] args) {
		
		WebDriver driver=null;
		String url="https://www.google.co.in/";
		System.setProperty("webdriver.chrome.driver","D:\\OrangeHRM\\code base\\resources\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	
}
