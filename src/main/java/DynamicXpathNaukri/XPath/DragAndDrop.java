package DynamicXpathNaukri.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\imabhi47\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.manage().deleteAllCookies();
		driver.get("http://demo.guru99.com/test/drag_drop.html");					
        
		//Element which needs to drag. 
		    WebElement To=driver.findElement(By.xpath("//li[@class='placeholder']//parent::ol[@id='amt7']']"));	
        	WebElement From=driver.findElement(By.xpath("//a[@class='button button-orange']//parent::li[@class='sel4 ui-draggable' and @id='credit']"));	
         
         //Element on which need to drop.		
        // WebElement To=driver.findElement(By.xpath("//li[@class='placeholder']//parent::ol[@id='bank']"));					
         		
         //Using Action class for drag and drop.		
         Actions act=new Actions(driver);					

	//Dragged and dropped.		
         act.dragAndDrop(From, To).build().perform();		
	}	
	}


