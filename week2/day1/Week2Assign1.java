package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Week2Assign1 {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
					driver.get("http://leaftaps.com/opentaps");
					driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
					driver.findElement(By.id("password")).sendKeys("crmsfa");
					driver.findElement(By.className("decorativeSubmit")).click();
					String title = driver.getTitle();
						System.out.println(title);
	}
}
