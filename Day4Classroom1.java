package week3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4Classroom1 {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("https://www.leafground.com/alert.xhtml");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//Simple dialog
	driver.findElement(By.xpath("//button[@id='j_idt88:j_idt93']//span[text()='Show']")).click();
	
	Alert alert = driver.switchTo().alert();
	String aleTxt=alert.getText();
	System.out.println(aleTxt);
	alert.dismiss();	
	
	String resTxt = driver.findElement(By.id("result")).getText();
	System.out.println(resTxt);	
	
	//prompt dialog
	driver.findElement(By.xpath("//button[@id='j_idt88:j_idt104']//span[text()='Show']")).click();
	Alert alert2 = driver.switchTo().alert();
	String aleTxt2=alert.getText();
	System.out.println(aleTxt2);
	alert2.sendKeys("Saranya");
	alert2.accept();
	
	String resTxt2 = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
	System.out.println(resTxt2);	
	
	
}
}
