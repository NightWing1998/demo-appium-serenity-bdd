package com.browserstack.cucumber.steps;

import com.browserstack.cucumber.pages.WikipediaApp;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.steps.ScenarioSteps;

public class WikipediaSearchSteps extends ScenarioSteps {
	WikipediaApp wikipediaApp;

	@When("^I type query as \\\"([^\\\"]*)\\\"$")
	public void search_google_for(String searchWord) throws Throwable {
		wikipediaApp.ClickEnterText();
		wikipediaApp.submitForm(searchWord);
	}

	@And("^I submit$")
	public void thenSubmit() throws Throwable {
		Thread.sleep(5000);
	}

	@Then("^I should see results")
	public void matchTitle() throws Throwable {
		wikipediaApp.thereShouldBeElements();
	}
}
