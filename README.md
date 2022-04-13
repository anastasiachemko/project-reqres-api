# This is the Project with API Autotests for 'Reqres' website
Click [here](https://reqres.in/) to take a look at the website!

## Technology Stack used in the project:

<p align="center">
<a href="https://www.java.com/"><img src="images/logo/Java.svg" width="50" height="50"  alt="Java"/></a>
<a href="https://gradle.org/"><img src="images/logo/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>
<a href="https://junit.org/junit5/"><img src="images/logo/Junit5.svg" width="50" height="50"  alt="JUnit 5"/></a>
<a href="https://selenide.org/"><img src="images/logo/Selenide.svg" width="50" height="50"  alt="Selenide"/></a>
<a href="https://gradle.org/"><img src="images/logo/rest-assured-logo.svg" width="50" height="50"  alt="Gradle"/></a>
<a href="https://www.jenkins.io/"><img src="images/logo/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>
<a href="https://github.com/allure-framework/allure2"><img src="images/logo/Allure.svg" width="50" height="50"  alt="Allure"/></a>
<a href="https://web.telegram.org/"><img width="50" height="50"  alt="Telegram" src="images\logo\Telegram.svg"></a>
</p>

* [Java](https://www.oracle.com/java/) - for writing tests
* [Gradle](https://gradle.org) - for building a project
* [JUnit 5](https://junit.org/junit5/) - for tests running
* [Selenide](https://selenide.org) - for UI testing
* [Rest-Assured](https://rest-assured.io) - for API testing
* [Jenkins](https://www.jenkins.io/) - for ensuring a continuous integration process
* [Allure Report](http://allure.qatools.ru) - for managing tests, analyzing them and reporting
* [Telegram Bot](https://core.telegram.org/bots) - for notifying of the process of tests running

## This project has:

- RestAssured library
- Specifications
- Lombok models
- Request log formatting templates
- Telegram notifications

## List of checks:

- Test on checking four onboarding steps
- Test on checking the work of the search bar

## To run tests locally use:

```
gradle clean test 
```

## Jenkins job
Jenkins is an automation server which lets us run tests.
Click <a target="_blank" href="https://jenkins.autotests.cloud/job/10-anastasiachemko-project-wildberries">here</a> to see the job for Reqres

<p align="center">
<img title="Jenkins job" src="images/screens/jenkinsParams.png">
</p>
## Allure report
Allure Framework is a flexible test report tool that shows a concise representation of what have been tested in a neat web report form

Here is the graphs:

<p align="center">
<img title="Allure overview" src="images/screens/graph.png">
</p>

## Telegram notifications
Notifications of test results are sent to Telegram:

<p align="center">
<img title="Allure overview" src="images/screens/tgNotification.png">
</p>


