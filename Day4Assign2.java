package week3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.time.Duration;

public class Day4Assign2 {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	//ChromeOptions option=new ChromeOptions();
	//option.addArguments("--disable-notifications");
	
	driver.get("https://dev109273.service-now.com/");
	//driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	Thread.sleep(5000);
	
	driver.findElement(By.id("user_name")).sendKeys("admin");
	driver.findElement(By.id("user_password")).sendKeys("^1!8TEtqsUJt");
	driver.findElement(By.id("sysverb_login")).click();
}
}
