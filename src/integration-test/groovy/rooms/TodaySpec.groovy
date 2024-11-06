package rooms

import geb.spock.GebSpec
import grails.testing.mixin.integration.Integration

/**
 * See http://www.gebish.org/manual/current/ for more instructions
 */
@Integration
class TodaySpec extends GebSpec {


    void "today is shown - will now fail because of login "() {
        when:
            go '/today/show'
        then:
        	title == "Today"
            $("output").text().startsWith("2024")
    }
}
