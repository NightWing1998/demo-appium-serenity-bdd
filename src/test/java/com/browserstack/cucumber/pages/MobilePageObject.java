package com.browserstack.cucumber.pages;

import com.google.common.base.Predicate;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.webdriver.WebDriverFacade;

public class MobilePageObject extends PageObject {
	public MobilePageObject(final WebDriver driver) {
		super(driver, new Predicate<PageObject>() {
			@Override
			public boolean apply(PageObject page) {
				assert page != null;
				PageFactory
						.initElements(new AppiumFieldDecorator(((WebDriverFacade) page.getDriver()).getProxiedDriver(), page.getImplicitWaitTimeout().withSeconds(90000)), page);
				return true;
			}
		});
	}
}