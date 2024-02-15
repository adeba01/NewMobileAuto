package com.mobframework.Runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/features" }, 
                glue = { "com.mobframework.stepdefinitions","com.mobframework.pages", "com.mobframework.hooks","com.mobframework.utils" }, 
                plugin = { "pretty", "html:target/report/html-report.html","json:target/report/json-report.json" },tags="@popup")

public class RunnerTest {

}
