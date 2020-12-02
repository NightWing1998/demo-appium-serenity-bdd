package com.browserstack.cucumber.pages;

import static org.assertj.core.api.Assertions.assertThat;

import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.AndroidFindBy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WikipediaApp extends MobilePageObject {
    public WikipediaApp(WebDriver driver) {
        super(driver);
    }

    @AndroidFindBy(accessibility = "Search Wikipedia")
    WebElement searchButton;

    @AndroidFindBy(id = "org.wikipedia.alpha:id/search_src_text")
    WebElement search;

    public void ClickEnterText() throws Exception {
        element(searchButton).click();
        Thread.sleep(5000);
    }

    public void submitForm(String searchString) {
        element(search).sendKeys(searchString);
    }

    public void thereShouldBeElements() {
        List allProductsName = getDriver().findElements(MobileBy.className("android.widget.TextView"));
        assertThat((allProductsName)).isNotEmpty();
    }
}
