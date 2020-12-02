# appium-serenity-browserstack

[Serenity](http://www.thucydides.info/docs/serenity/) Integration with BrowserStack for Appium.

Master branch contains **Selenium 3** samples, for **Selenium 4 - W3C protocol** please checkout [selenium-4](https://github.com/browserstack/serenity-browserstack/tree/selenium-4) branch

![BrowserStack Logo](https://d98b8t1nnulk5.cloudfront.net/production/images/layout/logo-header.png?1469004780)

<img src="http://www.thucydides.info/docs/serenity/images/serenity-logo.png" height = "100">

## Setup

- Clone the repo
- Install dependencies `mvn install`
- You can setup environment variables for all sample repos (see Notes) or update `serenity.properties` file with your [BrowserStack Username and Access Key](https://www.browserstack.com/accounts/settings)
- Upload the app you want to test using the [REST API](https://www.browserstack.com/docs/app-automate/api-reference/appium/apps#upload-an-app). This will return an app_url or custom_id.
- Set this app_url or custom_id as environment varialble with name `BROWSERSTACK_APP_ID` or Specify the `bstack_app` in serenity.properties as app_url or custom_id.

## Running your tests

- To run a single test, run `mvn verify -P single`
- To run parallel tests, run `mvn verify -P parallel`

## Notes

- You can view your test results on the [BrowserStack App Automate dashboard](https://www.browserstack.com/app-automate)
- To test on a different set of browsers, check out our [platform configurator](https://www.browserstack.com/app-automate/java#setting-os-and-browser)
- You can export the environment variables for the Username and Access Key of your BrowserStack account

  ```sh
  export BROWSERSTACK_USERNAME=<browserstack-username> &&
  export BROWSERSTACK_ACCESS_KEY=<browserstack-access-key> &&
  export BROWSERSTACK_APP_ID=<app_url or custom_id>
  ```

## Additional Resources

- [Documentation for writing App Automate test scripts in Java](https://www.browserstack.com/docs/app-automate/appium/getting-started/java)
- [Customizing your tests on BrowserStack](https://www.browserstack.com/app-automate/capabilities)
- [Browsers & mobile devices for selenium testing on BrowserStack](https://www.browserstack.com/list-of-browsers-and-platforms?product=app_automate)
- [Using REST API to access information about your tests via the command-line interface](https://www.browserstack.com/app-automate/rest-api)
