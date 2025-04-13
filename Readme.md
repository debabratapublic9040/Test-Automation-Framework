
# Test Automation Framework

This is a Java-based Test Automation Framework designed to demonstrate robust, scalable, and maintainable testing practices using popular libraries and tools. 

It is ideal for testing web applications with support for data-driven testing, cloud execution(like Lambd Test), headless mode, and detailed reporting.


## Author

- [@Debabrata](https://github.com/debabratapublic9040/Test-Automation-Framework)
- EmailAdrress: debabratar018@gmail.com


## 🔗 Links
[![portfolio](https://img.shields.io/badge/my_portfolio-000?style=for-the-badge&logo=ko-fi&logoColor=white)](https://github.com/debabratapublic9040/Test-Automation-Framework)

[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/debabrata-rout-170b951b9/)





## 🚀 About Me
Hi, My nane is Debabrata Rout and I have 4.4 years of experience in Automation Testig using techologies like Java, Selenium WebDriver, Postman.


## Prerequisites

Ensure you have the following installed:

- **Java 11**
- **Maven 3.x**
- Git (optional)
## Features

- **Java 11 + Maven**
- **TestNG** – Test orchestration and execution
- **Data-driven testing** using:
  - OpenCSV (CSV files)
  - Apache POI (Excel files)
  - Gson (JSON files)
- **Fake data generation** with [Java Faker](https://github.com/DiUS/java-faker)
- **Cross-browser testing on LambdaTest Cloud**
- **Headless browser mode** for faster execution
- **Maven Surefire Plugin** to run tests via CLI with custom parameters
- **ExtentReports** for rich HTML reports
- **Log4j** for structured logging

## Tech Stack

| Technology      | Purpose                              |
|------------------|--------------------------------------|
| Java 11          | Core programming language            |
| Maven            | Build tool & dependency management   |
| TestNG           | Test framework                       |
| OpenCSV          | Data-driven testing from CSV         |
| Apache POI       | Excel-based data support             |
| Gson             | JSON data support                    |
| Java Faker       | Generate fake test data              |
| LambdaTest       | Cloud cross-browser test execution   |
| ExtentReports    | HTML test reporting                  |
| Log4j            | Logging                              |


## Setup Instructions

Clone the Repository

```bash
git clone https://github.com/debabratapublic9040/Test-Automation-Framework.git

cd Test-Automation-Framework


**Running tests on LambdaTest**
mvn clean test -Dbrowser=firefox -DisLambdaTest=true -DisHeadless=true


**Running tests on headless mode**
mvn clean test -Dbrowser=firefox -DisLambdaTest=false -DisHeadless=true

**Reports & Logs**

Test Report:
After execution, an HTML report is generated at:
report.html

Execution Logs:
Logs are stored in the logs/ directory:
logs/fileName.log


    
## Data-Driven Testing

You can write your test data in:

CSV Files – parsed using OpenCSV

Excel Files (XLSX) – read with Apache POI

JSON Files – deserialized with Gson



## Writing Tests

Tests are written using TestNG. Use standard annotations like @Test, @BeforeMethod, @AfterMethod, etc. Page Object Model (POM) and utility classes are organized in src/main/java.
  
  
  
  
  ## Best Practices Followed

Modular Page Object Model design

Data-driven test architecture

Separation of concerns: test logic, data, and reporting

Cloud-based cross-browser testing integration

Easy configuration and execution via Maven
