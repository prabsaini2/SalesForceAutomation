$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/resources/Account.feature");
formatter.feature({
  "name": "Go to Accounts to create new Account.",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Confirm account is created with scenario outline",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "I fill details \"\u003cName\u003e\" \"\u003cfax\u003e\" \"\u003cBillingStreet\u003e\" \"\u003cBillingCountry\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "I click on Save",
  "keyword": "And "
});
formatter.step({
  "name": "Verify the account is created for \"\u003cName\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "I delete the created Account",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Name",
        "fax",
        "BillingStreet",
        "BillingCountry"
      ]
    },
    {
      "cells": [
        "Jassi",
        "2586",
        "12 Bhandup",
        "India"
      ]
    },
    {
      "cells": [
        "Sunny",
        "7589",
        "231 Mulund",
        "India"
      ]
    },
    {
      "cells": [
        "Aman",
        "7589",
        "78 Kalyan",
        "India"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I login to SalesForce website",
  "keyword": "Given "
});
formatter.match({
  "location": "AccountPageSteps.i_login_to_SalesForce_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Accounts tab dropdown",
  "keyword": "When "
});
formatter.match({
  "location": "AccountPageSteps.i_click_on_Accounts_tab_dropdown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on New Account",
  "keyword": "And "
});
formatter.match({
  "location": "AccountPageSteps.i_click_on_New_Account()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Confirm account is created with scenario outline",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "I fill details \"Jassi\" \"2586\" \"12 Bhandup\" \"India\"",
  "keyword": "And "
});
formatter.match({
  "location": "AccountPageSteps.iFillDetails(String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Save",
  "keyword": "And "
});
formatter.match({
  "location": "AccountPageSteps.i_click_on_Save()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the account is created for \"Jassi\"",
  "keyword": "Then "
});
formatter.match({
  "location": "AccountPageSteps.verifyTheAccountIsCreatedFor(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I delete the created Account",
  "keyword": "And "
});
formatter.match({
  "location": "AccountPageSteps.iDeleteTheCreatedAccount()"
});
formatter.result({
  "error_message": "org.openqa.selenium.StaleElementReferenceException: stale element reference: element is not attached to the page document\n  (Session info: chrome\u003d84.0.4147.89)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/stale_element_reference.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027Admins-MacBook.local\u0027, ip: \u0027fe80:0:0:0:1474:776:f9be:ff1%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.15.6\u0027, java.version: \u002714.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 84.0.4147.89, chrome: {chromedriverVersion: 84.0.4147.30 (48b3e868b4cc0..., userDataDir: /var/folders/td/_jd4flrj4nj...}, goog:chromeOptions: {debuggerAddress: localhost:49877}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: c6fd2e4d14404a5e39b59a6581e4b13b\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\n\tat pageObjects.CommonPage.deleteAccount(CommonPage.java:100)\n\tat parallel.stepDefinitions.AccountPageSteps.iDeleteTheCreatedAccount(AccountPageSteps.java:73)\n\tat ✽.I delete the created Account(file:src/test/java/resources/Account.feature:18)\n",
  "status": "failed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I login to SalesForce website",
  "keyword": "Given "
});
formatter.match({
  "location": "AccountPageSteps.i_login_to_SalesForce_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Accounts tab dropdown",
  "keyword": "When "
});
formatter.match({
  "location": "AccountPageSteps.i_click_on_Accounts_tab_dropdown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on New Account",
  "keyword": "And "
});
formatter.match({
  "location": "AccountPageSteps.i_click_on_New_Account()"
});
formatter.result({
  "error_message": "org.openqa.selenium.ElementNotInteractableException: element not interactable\n  (Session info: chrome\u003d84.0.4147.89)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027Admins-MacBook.local\u0027, ip: \u0027fe80:0:0:0:1474:776:f9be:ff1%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.15.6\u0027, java.version: \u002714.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 84.0.4147.89, chrome: {chromedriverVersion: 84.0.4147.30 (48b3e868b4cc0..., userDataDir: /var/folders/td/_jd4flrj4nj...}, goog:chromeOptions: {debuggerAddress: localhost:49944}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 1c0e4d8d28639585a507b366a0ae393b\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\n\tat pageObjects.CommonPage.clickOnNewAccount(CommonPage.java:79)\n\tat parallel.stepDefinitions.AccountPageSteps.i_click_on_New_Account(AccountPageSteps.java:36)\n\tat ✽.I click on New Account(file:src/test/java/resources/Account.feature:5)\n",
  "status": "failed"
});
formatter.scenario({
  "name": "Confirm account is created with scenario outline",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "I fill details \"Sunny\" \"7589\" \"231 Mulund\" \"India\"",
  "keyword": "And "
});
formatter.match({
  "location": "AccountPageSteps.iFillDetails(String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click on Save",
  "keyword": "And "
});
formatter.match({
  "location": "AccountPageSteps.i_click_on_Save()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify the account is created for \"Sunny\"",
  "keyword": "Then "
});
formatter.match({
  "location": "AccountPageSteps.verifyTheAccountIsCreatedFor(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I delete the created Account",
  "keyword": "And "
});
formatter.match({
  "location": "AccountPageSteps.iDeleteTheCreatedAccount()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I login to SalesForce website",
  "keyword": "Given "
});
formatter.match({
  "location": "AccountPageSteps.i_login_to_SalesForce_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Accounts tab dropdown",
  "keyword": "When "
});
formatter.match({
  "location": "AccountPageSteps.i_click_on_Accounts_tab_dropdown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on New Account",
  "keyword": "And "
});
formatter.match({
  "location": "AccountPageSteps.i_click_on_New_Account()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Confirm account is created with scenario outline",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "I fill details \"Aman\" \"7589\" \"78 Kalyan\" \"India\"",
  "keyword": "And "
});
formatter.match({
  "location": "AccountPageSteps.iFillDetails(String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Save",
  "keyword": "And "
});
formatter.match({
  "location": "AccountPageSteps.i_click_on_Save()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the account is created for \"Aman\"",
  "keyword": "Then "
});
formatter.match({
  "location": "AccountPageSteps.verifyTheAccountIsCreatedFor(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I delete the created Account",
  "keyword": "And "
});
formatter.match({
  "location": "AccountPageSteps.iDeleteTheCreatedAccount()"
});
formatter.result({
  "status": "passed"
});
});