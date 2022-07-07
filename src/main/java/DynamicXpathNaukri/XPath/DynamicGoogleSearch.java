package DynamicXpathNaukri.XPath;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicGoogleSearch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\imabhi47\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		  WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(10));
		  driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.get("https://www.google.com/");
		 WebElement e= driver.findElement(By.xpath("//input[@title='Search']"));
		  e.sendKeys("testing");
		  e.sendKeys(Keys.RETURN);
			/*
			 * List<WebElement> list=driver.findElements(By.
			 * xpath("//ul[@role='listbox' and @class='G43f7e']/parent::div[@class='OBMEnb']//preceding-sibling::div[@class='mkHrUc']//li/descendant::div[@class='wM6W7d WggQGd']"
			 * )); System.out.println(list.size());
			 */
		 
	
	}
	
}
