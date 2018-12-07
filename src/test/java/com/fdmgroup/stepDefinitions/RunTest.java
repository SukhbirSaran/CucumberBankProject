package com.fdmgroup.stepDefinitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//@CucumberOptions(format={"pretty","html:target/cucumber"})
@CucumberOptions(features="Features",glue={"com.fdmgroup.stepDefinitions"}, format = {"pretty", "html:target/cucumber"})
//@CucumberOptions(plugin={"usage"})
public class RunTest {

}
