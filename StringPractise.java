package practisework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StringPractise {

	public static void main(String[] args) {
		/*
		 * String str="srinivas loves rachana "; System.out.println(str.length());
		 * System.out.println(str.charAt(0)); SysteFm.out.printlFFFFFn(str.charAt(9));
		 * System.out.println(str.indexOf("r")); System.out.println(str.indexOf("a"));
		 * System.out.println(str.toUpperCase()); System.out.println(str.toLowerCase());
		 * String name="srinivas"; System.out.println(str.equals(name));
		 * System.out.println(name.startsWith("sri"));
		 * System.out.println(name.endsWith("as"));
		 * System.out.println(str.contains("love")); System.out.println(str.isEmpty());
		 * System.out.println(str.concat(name)); System.out.println(str.trim());
		 * System.out.println(str.replace("i", "R"));
		 * System.out.println(str.substring(4));
		 */
		System.setProperty("webdriver.chrome.driver", "D:\\webDrivers\\chromedriver_win32s\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String pageSource=driver.getPageSource();
		System.out.println(pageSource);
		String title=driver.getTitle();
		System.out.println(title);
		String currUrl=driver.getCurrentUrl();
		System.out.println("url of current page:"+currUrl);
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.quit();
		//driver.close();

	}

}
