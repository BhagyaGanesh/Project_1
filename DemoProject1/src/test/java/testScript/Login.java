package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends Base{
	
	
	@Test
	public void loginTest() {
		String username = "admin";
		String password = "admin";
		WebElement user = driver.findElement(By.xpath("//input[@name='username']"));
		//WebElement user = driver.findElement(By.name("username"));
		user.sendKeys(username);
		WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys(password);
		WebElement sign = driver.findElement(By.xpath("//button[@type='submit']"));
		sign.click();
		WebElement dashboard = driver.findElement(By.xpath("//p[text()='Dashboard']"));
		boolean displayed = dashboard.isDisplayed();
		Assert.assertTrue(displayed, "Home page not loading");
		
	}
	
	@Test
	public void invalidUser() {
		
		String username = "admin345";
		String password = "admin";
		WebElement user = driver.findElement(By.xpath("//input[@name='username']"));
		//WebElement user = driver.findElement(By.name("username"));
		user.sendKeys(username);
		WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys(password);
		WebElement sign = driver.findElement(By.xpath("//button[@type='submit']"));
		sign.click();
		WebElement alertmsg = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
		boolean alert = alertmsg.isDisplayed();
		Assert.assertTrue(alert, "Home page not loading");
		
		
	}
	
	@Test
	public void invalidPassword() {
		
		String username = "admin";
		String password = "admin0000";
		WebElement user = driver.findElement(By.xpath("//input[@name='username']"));
		//WebElement user = driver.findElement(By.name("username"));
		user.sendKeys(username);
		WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys(password);
		WebElement sign = driver.findElement(By.xpath("//button[@type='submit']"));
		sign.click();
		WebElement alertmsg = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
		boolean alert = alertmsg.isDisplayed();
		Assert.assertTrue(alert, "Home page not loading");
		
	}
	
	@Test
	public void bothInvalid() {
		
		String username = "admin890";
		String password = "admin0000";
		WebElement user = driver.findElement(By.xpath("//input[@name='username']"));
		//WebElement user = driver.findElement(By.name("username"));
		user.sendKeys(username);
		WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys(password);
		WebElement sign = driver.findElement(By.xpath("//button[@type='submit']"));
		sign.click();
		WebElement alertmsg = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
		boolean alert = alertmsg.isDisplayed();
		Assert.assertTrue(alert, "Home page not loading");
		
		
	}

}
