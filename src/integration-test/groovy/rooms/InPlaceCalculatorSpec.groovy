package rooms

import geb.spock.GebSpec
import grails.testing.mixin.integration.Integration
import org.openqa.selenium.Keys
import spock.lang.Ignore

/**
 * See http://www.gebish.org/manual/current/ for more instructions
 */
@Integration
class InPlaceCalculatorSpec extends GebSpec {

    void "Calculate in place with a self-refreshing view"() {
        when: "Go to start GSP page by calling it disguised as HTML"
            go '/InPlaceCalculator.html?lang=en'
        then:
        	title == "In-Place Calculator"

        when: "set valid input"
            $("form").en   = 5.0
            $("form").exam = 6.0
            $("input", type: "submit").click()

        then: "Result is displayed with proper rounding up"
            $("output").text() == "6"
    }

    void "Invalid input shows error message and sets error class"() {
        when: "Go to start GSP page by calling it disguised as HTML"
            go '/InPlaceCalculator.html?lang=en'
        then:
        	title == "In-Place Calculator"

        when: "set invalid input"
        withAlert {
            $("form").en = 0.9
            $("form").exam = 3.0
            $("input", type: "submit").click()
        }
        then: "Result contains error message"
            $("output").text() == "Cannot calculate. Input data was invalid."
        then: "invalid en field has error class while valid exam input has no class"
            $("#en",   class:'error')
            $("#exam").attr('class') == ""
    }

// Done: un-comment the commented lines below and see them failing, then make them pass

    void "Invalid input is handled in-place by JS without submission"() {
        given: "a valid state"
            go '/InPlaceCalculator.html?lang=en'
            $("form").en   = 3.0
            $("form").exam = 3.0
        when:
            $("input", type: "submit").click()
        then: "we should have a clean, valid state to start from"
            $("#en").attr('class') == ""
        when: "we enter some invalid value _without_ submitting"
            def alertWasRaised = withAlert {
                $("form").en = 0.9                  // erroneous
                $("form").exam = 3.0                // ok
                $("input", type: "submit").click()  // sadly needed as stimulus to trigger the onChange
            }
        then: "the in-place JS logic should kick in"
            $("#en").attr('class') == "error"
            alertWasRaised == true
    }


}
