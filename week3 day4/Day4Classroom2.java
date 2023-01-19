package week3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Day4Classroom2 {
public static void main(String[] args) {
	ChromeOptions opts=new ChromeOptions();
	opts.addArguments("--disable-notifications");
	
	ChromeDriver driver=new ChromeDriver();	
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	WebElement iFram=driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
	driver.switchTo().frame(iFram);
	driver.findElement(By.xpath("//button[text()='Try it']")).click();
	
	Alert alt1=driver.switchTo().alert();
	System.out.println(alt1.getText());
	alt1.accept();
	
	String resTxt = driver.findElement(By.xpath("//p[@id='demo']")).getText();
	System.out.println(resTxt);
	
}
}
