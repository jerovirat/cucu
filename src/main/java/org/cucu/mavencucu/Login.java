package org.cucu.mavencucu;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	WebDriver d;
	@Given("^the user is in demo guru home page$")
	public void the_user_is_in_demo_guru_hoe() {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karthiga\\eclipse-Junit\\mavencucu\\driver\\chromedriver.exe");
	    d = new ChromeDriver();
	   d.get("http://demo.guru99.com/V4/");
	    
	}

	@When("^the user login with credentials$")
	public void the_user_login_with_credentials() {
	    // Write code here that turns the phrase above into concrete actions
		
		
		d.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys("FDF");
		d.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("FDF");
		d.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[2]")).click();
		
	  
	}

	@Then("^the user should be in manage home page$")
	public void the_user_should_be_in_manage_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		d.quit();
	  
	}

	
}
