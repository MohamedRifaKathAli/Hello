package org.step;

import org.openqa.selenium.WebDriver;

import com.Maven.BaseClass;
import com.Maven.POM;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepEx extends BaseClass {
	
	public static  WebDriver driver = browserLaunch("https://www.facebook.com/");
	public static POM a= new POM(driver);
	
	@Given("Launch the browser and url")
	public void launch_the_browser_and_url() {
	   
	}
	@When("Enter the username")
	public void enter_the_username() {
	    keysToSend(a.getUsername(),"Nivas");
	    
	}
	
	@When("Enter the username {string}")
	public void enter_the_username(String username) {
		 keysToSend(a.getUsername(),username);
	}
	@When("Enter the password")
	public void enter_the_password() {
	   
	}
	@Then("Click the login")
	public void click_the_login() {
	    
	}
	
	
}
