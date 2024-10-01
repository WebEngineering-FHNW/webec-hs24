# WebEngineering Module, rooms

## Goals

### Abilities
- Writing tests for page navigation
- Writing tests for form submission
- Implementing basic workflow: form - controller - view
- Constructing html views with derived content
- Validating appropriately

### Knowledge
- Understanding the purpose and benefit of functional tests on the web
- Understanding the purpose and benefit of unit tests
- Understanding the web rooms cycle, request-response paradigm
- Using models for request data binding and response view creation
- Where and how to validate

## Assignment 1

Make sure that you have a Java JDK 17 installed and `JAVA_HOME` 
set appropriately. Check by running

    java -version

Run the tests

    grailsw test-app

_this will take a while to download the first time_    
        
Run the application

    grailsw run-app

Browse to http://localhost:8080/static/Home.html .

## Assignment 2

Have a look at rooms/src/integration-test/groovy/rooms/HomeSecondSpec.groovy .

Write a test, that goes to http://www.fhnw.ch/de/
and clicks on a link with text "Standorte und Kontakt".
Validate the page title.

## Assignment 3

Have a look at 
- http://localhost:8080/static/GradeCalculator.html
- /src/integration-test/groovy/rooms/CalculatorSpec.groovy (note the commented line 26)
- /src/main/resources/public/GradeCalculator.html 
- /grails-app/controllers/rooms/CalculatorController.groovy
- /views/calculator/CalculatorOutput.gsp (note the output placeholder)
- /src/test/groovy/rooms/CalculatorControllerSpec.groovy

Uncomment line 26 in the integration test and run `grailsw test-app`.

Open `/build/reports/tests/index.html` (or look at the internal test runner) 
to see which test failed and why.

Use `${ result }` in CalculatorOutput.gsp to put that calculated result in the right place.

## Assignment 4

In the GradeCalculator:
what happens when _en_ or _exam_ do not represent numbers?

Extend the integration test to cover the invalid input scenario.

## Assignment 5

What happens when _en_ or _exam_ do not fall into 1.0 - 6.0?

Write down how you would address this issue.
Unit test or integration test?
Which code needs change: test, controller, view?


## Homework 

Take the InPlaceCalculator and modify the current solution so that
- when the "en" field does not validate,
  an error message is displayed right beneath the field and
  the en input field itself is marked with a red border  
- when the "exam" field does not validate,
  an error message is displayed right beneath the field and
  the exam input field itself is marked with a red border
- note that both, en and exam, may be erroneous at the same time.  
