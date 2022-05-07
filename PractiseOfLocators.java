package practisework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractiseOfLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\webDrivers\\chromedriver_win32s\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("admin123");
		//driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		//driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.cssSelector("#menu_admin_viewAdminModule")).click();
		driver.findElement(By.xpath("//a[text()='Aravind']//parent::td[@class='left']//preceding-sibling::td//input")).click();
		driver.findElement(By.xpath("//a[text()='adash']//parent::td[@class='left']//preceding-sibling::td//input")).click();
		driver.findElement(By.xpath("//a[text()='alicia.feil']//parent::td[@class='left']//preceding-sibling::td//input")).click();
		driver.findElement(By.xpath("//a[text()='Anthony.Nolan']//parent::td[@class='left']//preceding-sibling::td//input")).click();
		//driver.close();

	}

}
