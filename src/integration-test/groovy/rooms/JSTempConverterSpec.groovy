package rooms

import geb.spock.GebSpec
import grails.testing.mixin.integration.Integration

/**
 * See http://www.gebish.org/manual/current/ for more instructions
 */
@Integration
class JSTempConverterSpec extends GebSpec {

    void "From celsius to fahrenheit with JavaScript"() {
        when:
            go '/static/Temperatures.html'
        then:
        	title == "Temperature Converter with JavaScript"

        when: "set celsius without button clicking"
            $("form").celsius = "10"
            $("form").fahrenheit().click()

        then: "the other field is updated immediately"
            $("form").fahrenheit  == "50"
    }

    void "From fahrenheit to celsius with JavaScript"() {
        when:
            go '/static/Temperatures.html'
        then:
        	title == "Temperature Converter with JavaScript"

        when: "set fahrenheit without button clicking"
            $("form").fahrenheit = "16"
            $("form").celsius().click()

        then: "the other field is updated immediately"
            $("form").celsius  == "-9"
    }


}
