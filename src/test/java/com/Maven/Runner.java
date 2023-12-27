package com.Maven;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src\\test\\java\\org\\fea\\Login.feature",glue = "org.step",monochrome = true,publish = true)
public class Runner  {
    
  
	
	
}
