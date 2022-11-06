# Java, Selenium, Cucumber + Serenity framework

Made for FedEx QA interview

Java, Serenity, Cucumber, Selenium, Maven

Screenplay pattern

Built on top of serenity-cucumber-starter project

## Usage

Clone project

Open terminal

To run all tests on Chrome use:
```cmd
$ mvn clean verify
```

To run tests on Chrome with specific tag use:
```cmd
$ mvn clean verify -Dtags="tag"  -Dcucumber.options="--tags @tag"
```

Framework has headless mode deactivated by default, to activate it set:
```cmd
headless.mode = true
```

## Reports

Nice html report is generated after each execution in:
```cmd
target/serenity/index.html
```