package com.Automation_Practice.Runner;
import java.io.IOException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.Base_Class.Base_Class;
import com.helper.automation.practice.File_Read_Manager;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions
(features = "src\\test\\java\\com\\Automation_Practice\\feature\\AutomationPractice.feature", 
glue = "com.Automation_Practice.Step_definition", 
monochrome = true, 
dryRun = false,
strict = true,
tags = ("~@Ap3"),
plugin = { "html:Report/Html_Report",
		"pretty", 
		"json:Reports/JsonReport.json",
		"com.cucumber.listener.ExtentCucumberFormatter:Final_Report/Ap.html"})

public class Test_Runner {
	public static WebDriver driver;

	@BeforeClass
	public static void set_Up() throws IOException {
		String browsername = File_Read_Manager.getInstanceFRM().getInstanceCR().getchrome();
		driver = Base_Class.getBrowser(browsername);
    }
    @AfterClass
	public static void tear_Down() {
		driver.close();
    }
}
