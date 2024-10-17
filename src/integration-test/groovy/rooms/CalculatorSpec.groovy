package rooms

import geb.spock.GebSpec
import grails.testing.mixin.integration.Integration
import spock.lang.Ignore

/**
 * See http://www.gebish.org/manual/current/ for more instructions
 */
@Integration
class CalculatorSpec extends GebSpec {


    void "Basic calculation"() {
        when:
            go '/?lang=en'
            go '/static/GradeCalculator.html'
        then:
        	title == "Grade Calculator"

        when: "set valid input"
            $("form").en   = 5.0
            $("form").exam = 6.0
            $("input", type: "submit").click()

        then: "Result Page is displayed"
            title == "Average"
            $("output").text() == "5.5"


        when: "click on back link"
            $("a", text: "calculator").click()
        then:
            title == "Grade Calculator"
    }
}
