package Selenium.Day4;

import org.openqa.selenium.chrome.ChromeDriver;

public class openChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Gvv\\Downloads\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
	//driver.manage().window().maximize();
	
		
	}

}
