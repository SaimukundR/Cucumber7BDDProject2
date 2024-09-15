# Cucumber BDD Selenium WebDriver Project 2

This project implements Behavior-Driven Development (BDD) using **Cucumber** with **Selenium WebDriver** for automating web application testing.

## Project Overview

This project automates the following key tasks for web testing:
- Browser automation using **Selenium WebDriver**.
- BDD testing framework using **Cucumber**.
- Implementing the **Page Object Model (POM)** for better structure and maintainability.
- Integration with **TestNG** for running tests and generating reports.
- Uses **Maven** for dependency management and build automation.

## Features

- **Cucumber BDD**: Write test scenarios in Gherkin language for behavior-driven development.
- **Browser Support**: Automation testing on both Chrome and Firefox.
- **Page Object Model (POM)**: Organizes code for better reusability and maintainability.
- **TestNG Integration**: Provides parallel test execution and better test reporting.
- **WebDriverManager**: Simplifies browser driver management by automatically downloading the necessary binaries.

## Tools & Technologies Used
- **Java**: Programming language for writing test scripts.
- **Selenium WebDriver**: Browser automation framework.
- **Cucumber**: BDD framework for writing readable test cases.
- **TestNG**:  Testing framework for organizing and executing tests.
- **Maven**: Build automation tool for managing dependencies.
- **WebDriver Manager**: Manages browser drivers
- **Jenkins**: Continuous integration server.

## Project Structure

```plaintext
SeleniumCucumberProject
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── PageObjects
│   │   │   │   ├── BasePage.java              # Base class with common functions
│   │   │   │   ├── LoginPage.java             # Page Object class for Login page
│   │   │   ├── utils
│   │   │   │   ├── MainDriver.java            # WebDriver initialization and utilities
│   ├── resources
│   │   ├── OR.properties                      # Object repository with element locators
│   │   ├── config.properties                  # Configuration settings for browser, URL, etc.
├── test
│   ├── java
│   │   ├── stepDefinitions
│   │   │   ├── LoginPageStepDef.java          # Step definitions for login feature
│   │   ├── testRunners
│   │   │   ├── TestRunner.java                # Cucumber TestNG runner
│   ├── resources
│   │   ├── features
│   │   │   ├── loginPage.feature              # Feature file for login functionality
│   └── target                                 # Generated test reports and outputs
├── pom.xml                                    # Maven dependencies and plugins
├── Jenkinsfile                                # Jenkins pipeline configuration
├── README.md                                  # Project documentation
```

## Project Structure

1. **Clone the repository**:

   git clone https://github.com/SaimukundR/Cucumber7BDDProject2.git

## Install Dependencies: Navigate to the project folder and install Maven dependencies:

- **mvn clean install**: Continuous integration server.
- **mvn test**: Running Tests: Run the Cucumber tests with Maven
- **mvn verify**: Generate Cucumber Reports: After running the tests, the reports can be generated for better visibiliy
 
   
## Key Features of Cucumber BDD
- **Gherkin Syntax**: Write scenarios in a human-readable language to define behavior.
- **Feature Files**: Scenarios are grouped in .feature files.
- **Step Definitions**: Java methods are linked to steps defined in the Gherkin scenarios.
- **Hooks**: Setup and teardown processes can be handled via @Before and @After hooks.

## gherkin
- Feature: Login Functionality
-  Scenario: User logs in with valid credentials
-    Given user is on the login page
-    When user enters valid username and password
-    And user clicks on login button
-    Then user should be logged in successfully

## Prerequisites
- Java JDK 8 or higher: Ensure that Java is installed.
- Maven: Install Maven for managing dependencies.
- WebDriver Manager: The project uses WebDriverManager for handling browser drivers.
- Jenkins (for CI/CD integration)

## Future Enhancements
- Add additional test cases for different modules.
- Implement parallel test execution.
- Improve Jenkins pipeline for distributed testing.

## How to Contribute
- Fork the repository.
- Create a new branch (git checkout -b feature/new-feature).
- Make your changes and commit (git commit -m 'Added new feature').
- Push the branch (git push origin feature/new-feature).
- Open a pull request.
