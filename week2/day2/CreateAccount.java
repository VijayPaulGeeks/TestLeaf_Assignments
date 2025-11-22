package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
     ChromeDriver driver = new ChromeDriver(options);
     
     driver.get("http://leaftaps.com/opentaps/.");
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
     driver.findElement(By.id("username")).sendKeys("democsr");
     driver.findElement(By.id("password")).sendKeys("crmsfa");
     driver.findElement(By.className("decorativeSubmit")).click();
     driver.findElement(By.linkText("CRM/SFA")).click();
     driver.findElement(By.linkText("Accounts")).click();
     driver.findElement(By.linkText("Create Account")).click();
     
     //assigning local variable 
     WebElement accuntnme = driver.findElement(By.className("inputBox"));
     accuntnme.sendKeys("sandbye");
     
     driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
     
     WebElement industry = driver.findElement(By.name("industryEnumId"));
     Select slctindustry = new Select(industry);
     slctindustry.selectByValue("IND_SOFTWARE");
     
     WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
     Select slctownrshp = new Select(ownership);
     slctownrshp.selectByVisibleText("S-Corporation");
     
     WebElement source = driver.findElement(By.id("dataSourceId"));
     Select slctsource = new Select(source);
     slctsource.selectByValue("LEAD_EMPLOYEE");
     
     WebElement campgain = driver.findElement(By.id("marketingCampaignId"));
     Select slctcampgain = new Select(campgain);
     slctcampgain.selectByIndex(6);
     
     WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
     Select slctstate = new Select(state);
     slctstate.selectByValue("TX");
     
     driver.findElement(By.className("smallSubmit")).click();
     
     //get text
     String text = driver.findElement(By.id("accountName")).getText();
     
     System.out.println("Account Name is : " + text);
     
     //condition to find whether account name is verified
     if(text.contains("sandbye")) {
    	 System.out.println("\nThen the account is verified");
    	 }
     else {
    	 System.out.println("\nThen the account is not verified");
     }
     
     
     //driver.close();
     
          }
     
   }


