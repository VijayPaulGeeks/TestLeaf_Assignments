package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbCreateNewAccount {

	public static void main(String[] args) {
		
     ChromeDriver driver = new ChromeDriver();
     
     driver.get("https://en-gb.facebook.com/");
     
     driver.manage().window().maximize();
     
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
     
     driver.findElement(By.linkText("Create new account")).click();
     
     driver.findElement(By.name("firstname")).sendKeys("firstname");
     
     driver.findElement(By.name("lastname")).sendKeys("lastname");
     
     WebElement day = driver.findElement(By.id("day"));
     
     Select select = new Select(day);
     
     select.selectByValue("1");
     
     WebElement month = driver.findElement(By.id("month"));
     
      Select monthselect = new Select(month);
      
      monthselect.selectByVisibleText("Jan");
      
      WebElement year = driver.findElement(By.id("year"));
      
      Select yearselect = new Select(year);
      yearselect.selectByIndex(1);
      
      driver.findElement(By.xpath("(//input[@id='sex'])[2]")).click();
      
      
      
	}

}
