package Assessment.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mindtreedec135\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nobroker.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"navHeader\"]/div[5]/div[2]/div[2]/div")).click();
		driver.findElement(By.id("signUp-phoneNumber")).sendKeys("1234987656");
		driver.findElement(By.xpath("//*[@id=\"login-signup-form__name-input\"]")).sendKeys("Sneha Samadder");
		driver.findElement(By.xpath("//*[@id=\"login-signup-form__email-input\"]")).sendKeys("sneha.s@gmail.com");
		driver.findElement(By.xpath("//*[@id=\'signUpSubmit\']")).click();
}
}