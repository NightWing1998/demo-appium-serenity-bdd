package com.browserstack.cucumber;

import com.browserstack.BrowserStackSerenityTest;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/single.feature",plugin = {"json:target/cucumber_json/cucumber.json"} )
public class Test extends BrowserStackSerenityTest {
}
