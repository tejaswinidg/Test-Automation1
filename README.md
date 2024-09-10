# Test-Automation1

This project is an automated testing suite for an e-commerce web application. The tests are written using Selenium WebDriver, TestNG, and Apache POI, following the Page Object Model (POM) structure for better maintainability. The tests focus on verifying the core functionality of the e-commerce site, such as user registration, login, product search, add to cart, and checkout.

# Table of Contents
1. Project Overview
2. Technologies Used
3. Test Cases
4. Installation
5.Execution
6.Project Structure
7.License

# Project Overview
The goal of this project is to automate the testing of key functionalities in an e-commerce web application, ensuring that the site works correctly across multiple scenarios. The automation covers a wide range of tests, including UI, functional, and regression tests.

# Technologies Used
Selenium WebDriver: For browser automation.
TestNG: For organizing and running test cases.
Apache POI: For reading and writing data from Excel files (e.g., test data).
Page Object Model (POM): For improving test code maintainability and reuse.

# Test Cases
The following scenarios are covered:

User Registration: Validating successful and unsuccessful registration.
Login: Testing login functionality with valid and invalid credentials.
Product Search: Searching for products using different filters.
Add to Cart: Adding products to the shopping cart and verifying cart contents.
Checkout Process: Completing the checkout process with valid payment details.

# Installation
1.Clone the repository:https://github.com/tejaswinidg/Test-Automation1
2.Ensure you have the following installed:
Java JDK (version 8 or later)
Maven
Selenium WebDriver
TestNG
3.Install the necessary dependencies using Maven


# Project Structure
src/test/java: Contains the TestNG test classes and  Contains the Page Object classes.
test-data: Excel files for test data input using Apache POI.
pom.xml: Maven configuration file for dependencies and build.

