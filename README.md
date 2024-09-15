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
 Java: Programming language for writing test scripts.
 Selenium WebDriver: Browser automation framework.
 Cucumber: BDD framework for writing readable test cases.
 TestNG: Testing framework for organizing and executing tests.
 Maven: Build automation tool for managing dependencies.
 WebDriverManager: Manages browser drivers.
 Jenkins: Continuous integration server.


## Project Structure

📦Project Root ┣ 📂src ┃ ┣ 📂main ┃ ┃ ┣ 📂java ┃ ┃ ┃ ┣ 📂PageObjects ┃ ┃ ┃ ┃ ┣ 📜BasePage.java // Parent class for common actions ┃ ┃ ┃ ┃ ┣ 📜LoginPage.java // Page Object for login functionality ┃ ┃ ┃ ┣ 📂utils ┃ ┃ ┃ ┃ ┣ 📜MainDriver.java // WebDriver setup and utility methods ┃ ┃ ┣ 📂resources ┃ ┃ ┃ ┣ 📜OR.properties // Object Repository (Element locators) ┃ ┃ ┃ ┣ 📜config.properties // Configurations (Browser, URL, Waits)

┣ 📂test ┃ ┣ 📂java ┃ ┃ ┣ 📂stepDefinitions ┃ ┃ ┃ ┣ 📜LoginPageStepDef.java // Step definitions for login page feature ┃ ┃ ┣ 📂testRunners ┃ ┃ ┃ ┣ 📜TestRunner.java // Cucumber TestNG runner

┃ ┣ 📂resources ┃ ┃ ┣ 📂features ┃ ┃ ┃ ┣ 📜loginPage.feature // Feature file for login scenario ┃ ┃ ┃ ┣ 📜<additional-features>.feature // Other feature files

┣ 📂target // Generated files and reports ┣ 📜pom.xml // Maven dependencies and build configurations ┣ 📜README.md // Project documentation

 src/main/java: Contains page object files and utility classes.
 BasePage.java: The parent class that initializes the WebDriver and WebDriverWait.
 LoginPage.java: Page Object for login functionality.
 MainDriver.java: Initializes WebDriver, browser setup, and WebDriverWait management.
 src/test/java: Contains step definitions and test runners.
 StepDefinitions: Defines the steps corresponding to the Cucumber scenarios.
 TestRunner.java: The Cucumber test runner integrating with TestNG.
 src/test/resources: Contains Cucumber feature files and configuration properties.
 features/: Holds the .feature files written in Gherkin.
 OR.properties: Object repository for element locators.
 config.properties: Configuration file for browser settings, wait times, and URLs.


## Installation & Setup

1. **Clone the repository**:
   ```bash
   git clone https://github.com/SaimukundR/Cucumber7BDDProject2.git

# Install Dependencies: Navigate to the project folder and install Maven dependencies:

1. bash
   mvn clean install

# Running Tests: Run the Cucumber tests with Maven:
2. bash
   mvn test

# Generate Cucumber Reports: After running the tests, the reports can be generated for better visibility:
3. bash  
   mvn verify
   
## Key Features of Cucumber BDD
Gherkin Syntax: Write scenarios in a human-readable language to define behavior.
Feature Files: Scenarios are grouped in .feature files.
Step Definitions: Java methods are linked to steps defined in the Gherkin scenarios.
Hooks: Setup and teardown processes can be handled via @Before and @After hooks.
Example Cucumber Scenario
Example Gherkin scenario for logging into the application:

## gherkin
Feature: Login Functionality
  Scenario: User logs in with valid credentials
    Given user is on the login page
    When user enters valid username and password
    And user clicks on login button
    Then user should be logged in successfully

## Prerequisites
Java JDK 8 or higher: Ensure that Java is installed.
Maven: Install Maven for managing dependencies.
WebDriverManager: The project uses WebDriverManager for handling browser drivers.
Jenkins (for CI/CD integration)

## Future Enhancements
Add additional test cases for different modules.
Implement parallel test execution.
Improve Jenkins pipeline for distributed testing.

## How to Contribute
Fork the repository.
Create a new branch (git checkout -b feature/new-feature).
Make your changes and commit (git commit -m 'Added new feature').
Push the branch (git push origin feature/new-feature).
Open a pull request.
