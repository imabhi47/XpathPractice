package DynamicXpathNaukri.XPath;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NaukriXPath {

	static WebDriverWait wait;

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\imabhi47\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/automation-testing-jobs?k=Automation%20Testing");
		
		  driver.findElement(By.xpath(
		  "//span[text()='WFH during Covid']//parent::p[@class='grey-text lH20 fleft ml-8 txtLbl']//preceding-sibling::i[@class='fleft naukicon naukicon-checkbox']"
		 )) .click();
		 
		 /*
							 * driver.findElement(By.xpath("//a[@id='register_Layer']")).click();
							 * WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
							 * wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
							 * "//a[contains(text(),'Login')]"))).click();
							 * driver.findElement(By.id("usernameField")).sendKeys("ap144813@gmail.com");
							 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
							 * driver.findElement(By.id("passwordField")).sendKeys("Riyarashur12@");
							 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
							 * driver.findElement(By.xpath("//button[text()='Login']")).click();
							 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
							 */
		// driver.findElement(By.xpath("//a[@id='login_Layer']")).click();
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 * wait.until( ExpectedConditions.presenceOfElementLocated(By.
		 * xpath("//input[@class='err-border' and @type='text']")));
		 * driver.findElement(By.xpath("//input[@class='err-border' and @type='text']"))
		 * .sendKeys("ap144813@gmail.com");
		 * driver.findElement(By.xpath("//button[text()='Login']")).click();
		 */
		/*
		 * driver.findElement(By.
		 * xpath("//input[@type='text' and @class='err-border']//parent::div[@class='form-row']]"
		 * )).sendKeys("ap144813@gmail.com");
		 * driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 * driver.findElement(By.xpath("//button[text()='Login']")).click();
		 * System.out.println("I am not able to login");
		 */
	}

}
