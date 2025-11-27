package com.sgtesting.actiTime.driverscript;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/FeatureFiles",
        glue ="src.test.java.com.sgtesting.actiTime.stepdefinations.StepDefinations")
public class DriverScript extends AbstractTestNGCucumberTests {
}
