package DynamicXpathNaukri.XPath;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Spicejet {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\imabhi47\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com/");
		/*
		 * WebElement e=driver.findElement(By.xpath(
		 * "//input[@type='text']//parent::div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']//ancestor::div[@data-testid='to-testID-origin']"
		 * ));
		 */
		WebElement e = driver.findElement(By.xpath(
				"//input[@type='text']//parent::div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']//ancestor::div[@data-testid='to-testID-origin']//descendant::div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-tju18j r-5njf8e r-1otgn73']"));
		e.click();
		e.sendKeys("Agra");
		WebElement departcity = driver.findElement(By.xpath(
				"//div[text()='Pandit Deen Dayal Upadhyay Airport']//ancestor::div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1wtj0ep r-b5h31w r-rnv2vh r-5njf8e r-1otgn73']"));
		departcity.click();
	}

}
