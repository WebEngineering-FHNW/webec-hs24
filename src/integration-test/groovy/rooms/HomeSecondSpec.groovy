package rooms

import geb.spock.GebSpec
import grails.testing.mixin.integration.Integration


/**
 * See http://www.gebish.org/manual/current/ for more instructions
 */
@Integration
class HomeSecondSpec extends GebSpec {

    void "test home is there"() {
        when:"The home page is visited"
            go '/static/Home.html'
        then:"The title is Homepage"
        	title == "Homepage"
    }

    void "home links to Second and Second links back"() {
        when:"The home page is visited"
            go '/static/Home.html'
        then:"The title is Homepage"
        	title == "Homepage"

        when: "click on link to second"
            $("a", text: "second").click()
        then: "Second page is displayed"
            title == "Second"

        when: "click on back link"
            $("a", text: "home").click()
        then: "Home page is displayed, again"
            title == "Homepage"
    }
}
