# Testing for SutureHealth

## Objective

### The objective of this test plan is to verify the functionality of the https://playwright-technical.vercel.app/

## Test Environment&Tools
### _The following test environment will be used for testing:_

- _**OS:**_ Windows 11
- _**System Requirements:**_ Java 8 + SDK
- _**Build Tool:**_ Maven
- _**IDE:**_ IntelliJ IDEA 2022.1
- _**Web Browser:**_ Google Chrome
- _**Programming Language:**_ Java, Gherkin, JavaScript
- _**BDD Framework:**_ BDD Cucumber Framework


**For UI:**
- _**Web Automation Tools:**_  Selenium WebDriver, JUnit

## Dependencies
```selenium-java```

```webdrivermanager```

```cucumber-java```

```cucumber-junit```

```rest-assured```

```javafaker```

```jackson-databind```

```reporting-plugin```

```maven-surefire-plugin```

## Test Case
_**To find the console output clearly and easily I created a script below**_    
    
    Scenario:User goes to the website and verify that the operation is successful
    Given User navigate to the Suture Health Demo website
    And User see the title of website
    When User click to the Get Ditto Data button
    Then User should see limber and imposter

## Nice to Know
**1 - For running tests scenarios;**

    - go to CukesRunner.java class (src > test > java > com > suturehealth > runners > CukesRunner)   
           
    - run CukesRunner.java class
**2 - Cucumber BDD Framework has 2 layers;**

    - Business Layer --> src > test > resources > features
    - Implementation Layer --> src > > test > java > com > suturehealth > step_definitions

**3 - Relevant credentials are located in <ins>configuration.properties</ins> file.**

**4 - Followed <ins>Page Object Model</ins> & <ins>Singleton Design Pattern.</ins>**

**5 - Achieved <ins>Data Driven Testing</ins> by configuration.properties and Cucumber Expressions.**

**6 - Implemented <ins>Gherkin Language</ins> in feature files.**

**7 - Utilized <ins>Hooks</ins> class for taking screenshots if a test fails.**

## Contributing
_**If you wish to contribute to this project, please follow the standard GitHub workflow:**_

1- Fork the repository

2- Create a new branch for your changes

3- Make your changes and commit them

4- Push your branch to your fork

5- Create a pull request to merge your changes into the main repository

