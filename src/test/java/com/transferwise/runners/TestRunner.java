package com.transferwise.runners;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;
import com.transferwise.managers.FileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
 features = "src/test/resources/functionalTests",
 glue= {"com.transferwise.stepDefinitions"},
 tags= {"@extraction, @conversion"},
 plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html","pretty", "html:target/cucumber-reports", "json:target/cucumber-reports/Cucumber.json", "junit:target/cucumber-reports/Cucumber.xml"},
 monochrome = true
 )

public class TestRunner {
	@AfterClass
	 public static void writeExtentReport() {
	 Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
	 Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
     Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
     Reporter.setSystemInfo("Machine", "Windows 7" + "64 Bit");
     Reporter.setSystemInfo("Selenium", "3.141.59");
     Reporter.setSystemInfo("Maven", "3.3.9");
     Reporter.setSystemInfo("Java Version", "1.8.0_121");
	
	}
}
