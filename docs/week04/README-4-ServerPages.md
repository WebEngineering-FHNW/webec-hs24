# WebEngineering Module, Server Pages

## update 

Those who cannot start integration tests that utilize the installed native browser
(due to the driver version issues) can now use

        ./gradlew integrationTest -Dgeb.env=htmlUnit
 
which will use a headless browser.

## Goals

### Abilities
- Being able to use dynamic content in server pages
- Using pages, templates, taglibs, and layouts
- Testing appropriately

### Knowledge
- Understanding the request-response cycle
- Understanding the four ways of composing server pages plus when to use which
- Where and how to validate
- Optional: using Grails internationalized error messages for generic error display

## Demo/Code walkthrough 

Walk through the code of InPlaceCalculator
incl. model, view, controller, tests.

- Intermediate step:more generic field error handling
- Use of _form_row.gsp template for smart, labeled fields	
- Using a taglib for dynamic content
- Grails specific: fully generic error messages plus I18N
- Using a layout for the form

## Practical work (may extend into homework)

Make a Fahrenheit to Celsius converter.

You best make a copy of each artifact that we used for the InPlaceCalculator
(model, view, controller, tests, form_row template).
Just copy the file into the same directory as the original and rename accordingly.

You can reuse the _form_ layout.

You can make use of the following conversion functions:

	double c2f(double c) { c * 1.8d + 32 }
	double f2c(double f) { (f-32) / 1.8d }

It is probably best to work with two input fields: one for Fahrenheit, one for Celsius,
and calculate a result for each of the inputs separately.
