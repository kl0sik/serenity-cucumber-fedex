# Java, Selenium, Cucumber + Serenity framework

Made for FedEx QA interview

Java, Serenity, Cucumber, Selenium, Maven

Screenplay pattern

## Usage

Clone project

To run all tests use:
```cmd
$ mvn clean verify
```

To run tests with specific tag use:
```cmd
$ mvn clean verify -Dtags="tag"  -Dcucumber.options="--tags @tag"
```

## Reports

Nice html report is generated in target/serenity/index.html after execution