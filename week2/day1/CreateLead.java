package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		System.out.println(driver);
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Andrews");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Melwin");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Andrews");
		driver.findElement(By.name("departmentName")).sendKeys("Selinium");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("andrewsmelwin944@gmail.com");
		driver.findElement(By.name("submitButton")).click();
		
		String ti=driver.getTitle();
		System.out.println(ti);
		



	}

}
