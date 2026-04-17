# Cucumber Java Test Framework

A cleaner, production-ready starter for BDD automation with **Cucumber + JUnit + Maven + Selenium**.

## What Was Improved

- Rebuilt the project layout with clear packages (`core`, `hooks`, `pages`, `steps`, `runner`)
- Removed dead/commented-out legacy test classes and invalid feature definitions
- Modernized `pom.xml` with consistent versions and Java 17 build settings
- Disabled `testFailureIgnore` so CI fails correctly on broken tests
- Added WebDriver lifecycle hooks with failure screenshots for UI scenarios
- Added default, stable regression scenarios that run without browser dependencies
- Added optional UI suite behind a Maven profile
- Added CI workflow and strengthened `.gitignore`

## Tech Stack

- Java 17
- Maven
- Cucumber (JUnit 4 runner)
- Selenium WebDriver
- WebDriverManager

## Project Structure

```text
src/test/java/com/cucumberjava
├── core
│   └── DriverFactory.java
├── hooks
│   └── CucumberHooks.java
├── pages
│   └── LoginPage.java
├── runner
│   ├── RegressionTestRunner.java
│   └── UiTestRunner.java
└── steps
    ├── AuthenticationSteps.java
    └── UiLoginSteps.java

src/test/resources/features
├── authentication.feature
└── ui
    └── login.feature
```

## Run Tests

### 1) Default regression suite (fast and stable)

Runs non-UI scenarios only:

```bash
mvn clean test
```

### 2) UI suite (Selenium)

Runs only `@ui` scenarios:

```bash
mvn clean test -Pui-tests
```

Optional browser flags:

```bash
mvn clean test -Pui-tests -Dbrowser=firefox -Dheadless=true
```

Supported browser values:
- `chrome` (default)
- `firefox`

## Reporting

After execution, Cucumber reports are generated under:

- `target/cucumber-reports/cucumber.html` (regression)
- `target/cucumber-reports/ui-cucumber.html` (UI profile)

## CI

GitHub Actions workflow: `.github/workflows/ci.yml`

It runs:

```bash
mvn -B clean test
```

on pushes and pull requests.

## Notes

- UI tests depend on external website availability: `https://practicetestautomation.com/practice-test-login/`
- Keep critical business rules covered in non-UI scenarios to reduce flaky CI runs.
