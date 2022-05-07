package practisework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise02Java {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\webDrivers\\chromedriver_win32s\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       // driver.get("https://demoqa.com/checkbox");
        driver.get("https://opensource-demo.orangehrmlive.com/");
        
        WebElement element=driver.findElement(By.cssSelector("input#btnLogin"));
       // element.sendKeys("Rachana Loves Srinivas");
        
       String data= driver.findElement(By.partialLinkText("Forgot your password?")).getText();
        String value=element.getAttribute("value");
        System.out.println("Data in the element"+data);
        System.out.println("Data in the element"+value);
        if(element.isEnabled()) {
        	element.click();
        	Thread.sleep(2000);
        	System.out.println("Object is selected");
        	//System.out.println("Emlements are matched");
        }
        else {
        	
        	System.out.println("Elements are not matched");
        }
        
        
        
		/*
		 * String myValue="Srinivas Loves Rachana"; WebElement
		 * elementObj=driver.findElement(By.cssSelector("input#userEmail"));
		 * elementObj.sendKeys(myValue); String value=elementObj.getAttribute("value");
		 * System.out.println("value available is:"+value); if(value.equals(myValue)) {
		 * System.out.println("value matched "); } else {
		 * System.out.println("value not matched"); } elementObj.clear();
		 */driver.close();
		/*
		 * driver.get("https://opensource-demo.orangehrmlive.com/");
		 * driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		 * driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		 * //driver.findElement(By.linkText("Forgot your password?")).click();
		 * driver.findElement(By.partialLinkText("Forgot")).click();
		 * //driver.findElement(By.name("Submit")).click();
		 * //driver.findElements(By.tagName("")); driver.close();
		 */
		/*
		 * driver.get(
		 * "https://login.yahoo.com/?.src=search&.intl=in&.lang=en-IN&.done=https%3A%2F%2Fin.search.yahoo.com%2F%3Ffr2%3Dinr&pspid=2114723002&activity=header-signin"
		 * ); driver.findElement(By.xpath("/html/body/div/div[2]/div/" +
		 * "div[2]/div/form/div/div[3]/input")).sendKeys("koppineedi");
		 */
		/*
		 * driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		 * driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(
		 * "admin123"); driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		 * 
		 */
       // driver.findElement(By.xpath("//li[@class='rct-node rct-node-parent rct-node-expanded']//preceding-sibling::span[@class='rct-text']//button[@class='rct-collapse rct-collapse-btn']")).click();
      
       // driver.findElement(By.xpath("//*[@id='tree-node']//ol//li//span//button")).click();
        //driver.findElement(By.xpath("//span[text()='Downloads']//parent::label[@for='tree-node-downloads']//preceding-sibling::span[@class='rct-checkbox']")).click();
        
	}

}
