package DynamicXpathNaukri.XPath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\imabhi47\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(
				"https://www.amazon.in/ap/register?showRememberMe=true&openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&prevRID=7CEEEWHVTENSE5KDDMH9&openid.assoc_handle=inflex&openid.mode=checkid_setup&desktopBrowserWeblabTreatment=C&prepopulatedLoginId=&failedSignInCount=0&pageId=inflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&mobileBrowserWeblabTreatment=C");

		driver.findElement(By.xpath("//span[@class='a-dropdown-prompt']")).click();
		driver.findElement(By.xpath("//div[@id='a-popover-1']//descendant::li//a[text()='Afghanistan +93']")).click();
		// div[@id='a-popover-1']//descendant::li//a[text()='Afghanistan +93']
		/*
		 * driver.get("https://www.moneycontrol.com/mf/returns-calculator.php");
		 * driver.findElement(By.xpath("//select[@id='ff_id']")).click();
		 * driver.findElement(By.
		 * xpath("//option[text()='Edelweiss Mutual Fund']//parent::select[@id='ff_id']"
		 * )).click();
		 */

	}

}
