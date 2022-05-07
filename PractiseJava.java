package practisework;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractiseJava {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\webDrivers\\chromedriver_win32s\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:\\www.google.com");
		driver.manage().window().maximize();
		String str = driver.getPageSource();
		System.out.println("Data in the String"+str);
		driver.close();

	}

}
