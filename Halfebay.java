package practisework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Halfebay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\webDrivers\\chromedriver_win32s\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		List<WebElement> list=driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		for(int i=0;i<list.size();i++) {
			String name=list.get(i).getText();
			System.out.println(name);
		}

	}

}
