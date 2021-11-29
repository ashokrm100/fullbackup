package com.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue= {"com.StepDefinition"},monochrome=true,
plugin= {"html:Reports\\HTMLReports\\","junit:Reports\\JUnitReport\\Cucumber.xml"})
public class Runner {

}
