# WebEngineering Module, JavaScript

## Goals

### Abilities
- Being able to use javascript for client-side application logic
- Modularize javascript code in functions
- Integration testing of pages that use javascript

### Knowledge
- Understanding how to use event handling attributes and javascript code 
- Distinguishing between in-line, in-page, and .js-file code
- Understanding the idea of "scripting"
- Understanding the general differences between Java and JavaScript

## Resources

Basic JavaScript objects for use in the browser:

- http://www.cse.cuhk.edu.hk/~cjyuan/csc2720/slides/lec06b-javascript_dom.pdf
- https://www.w3schools.com/js/
- https://www.codecademy.com/learn/learn-javascript

## Demo/Code walkthrough 

## Practical work (may extend into homework)

### Direct-Manipulation JSTempConverter

- view: src/main/resources/public/Temperatures.html
  open the view either from file system or through the web app (http://localhost:8080/static/Temperatures.html)
- see: src/integration-test/groovy/rooms/JSTempConverterSpec.groovy
- let the tests run, make sure they pass. 
- delete parts or all of the Temperatures.html and re-create it until the tests pass again.

## Optional extension:
- refactor the celsiusToFahrenheit and fahrenheitToCelsius functions
  into lambda expressions (aka fat-arrow functions).

## Homework 

- Finish the practical work
- Work through the resources (see above)
