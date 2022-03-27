package Assessment.Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mindtreedec135\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nobroker.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div[3]/div[2]")).click();//Buy
		driver.findElement(By.xpath("//div[@id='searchCity']")).click();//Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='css-1hwfws3 nb-select__value-container nb-select__value-container--has-value']")).click();
		Actions act=new Actions(driver);
		for(int i=0;i<2;i++)
		{
			act.sendKeys(Keys.DOWN).perform();
		}
		act.sendKeys(Keys.ENTER).perform();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='listPageSearchLocality']")).click();
		driver.findElement(By.xpath("//input[@id='listPageSearchLocality']")).sendKeys("JP nagar");
		driver.findElement(By.cssSelector("div[class='autocomplete-dropdown-container']")).click();
		Actions act1=new Actions(driver);
		for(int i=0;i<2;i++)
		{
			act1.sendKeys(Keys.DOWN).perform(); 
		}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div[5]/label[1]")).click();//Apartment Type
		
		for(int i=0;i<3;i++)
		{
			act.sendKeys(Keys.DOWN).perform();
		}
		act.sendKeys(Keys.ENTER).perform();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='css-1hwfws3 nb-select__value-container']")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class='prop-search-button btn btn-primary btn-lg']")).click(); 
	}
}
		