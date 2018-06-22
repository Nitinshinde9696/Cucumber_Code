package com.cucumber.runnerclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Login_Verification {

	 WebDriver driver = new ChromeDriver();
	
	@Given("^Browser is open chrome$")
	public void browser_is_open_chrome() {
		//System.setProperty("webdriver.chromedriver.driver", "D:\\data\\chromedriver.exe");

	}

	@Then("^user navigate to applications$")
	public void user_navigate_to_applications() {
		driver.get("http://www.gcrit.com/build3/index.php");
	}

	@When("^user enters invalid userid and password$")
	public void user_enters_invalid_userid_and_password() {
		driver.findElement(By.linkText("login")).click();
		driver.findElement(By.name("email_address")).sendKeys("testuser1234@gmail.com");
		driver.findElement(By.name("password")).sendKeys("12sdfasdfsdfsdafsadfs3456");
		driver.findElement(By.xpath("//*[@id='tdb5']/span[2]")).click();
		
		
	}

	@Then("^login unsuccessful$")
	public void login_unsuccessful() {
		
		Boolean actualmessage = driver.findElement(By.cssSelector(".messageStackError")).isDisplayed();
		Assert.assertEquals(true, actualmessage.booleanValue());
		}

	@When("^user enters valid userid and password$")
	public void user_enters_valid_userid_and_password() {

		driver.findElement(By.linkText("login")).click();
		driver.findElement(By.name("email_address")).sendKeys("testuser1234@gmail.com");
		driver.findElement(By.name("password")).sendKeys("111111");
		driver.findElement(By.xpath("//*[@id='tdb5']/span[2]")).click();
	}

	@Then("^login successful$")
	public void login_successful() {
		Boolean loginmsg = driver.findElement(By.cssSelector(".contentText")).isDisplayed();
		Assert.assertEquals(true, loginmsg.booleanValue());
		System.out.println("Login message"+loginmsg);
		
	}

	@Then("^verify the user$")
	public void verify_the_user() {
		
		String welcomeMsg = driver.findElement(By.cssSelector(".contentText")).getText();
		if(welcomeMsg.contains("Welcome to GCR Shop "))
		{
			System.out.println("Welcome Message"+welcomeMsg);
			System.out.println("Login Successfull");
		}
				
	}
}
