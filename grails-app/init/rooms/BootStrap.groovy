package rooms

import grails.util.Environment

import java.time.LocalDate

class BootStrap {

    static Date today      = toUtilDate(LocalDate.now())
    static Date tomorrow   = toUtilDate(LocalDate.now().plusDays(1))
    static Date yesterday  = toUtilDate(LocalDate.now().minusDays(1))

    /**
     * This method is called when the server starts.
     */
    def init = { servletContext ->

        if (Environment.current == Environment.PRODUCTION) { // guard clause
            return
        }

        Person dierk  = save(new Person(firstName: "Dierk",  lastName: "König"))
        Person dieter = save(new Person(firstName: "Dieter", lastName: "Holz"))

        Room r51c56 = save(new Room(name: "5.1C56", capacity: 30))
        Room r52b53 = save(new Room(name: "5.2B53", capacity: 35))

        save(new Booking(person: dierk, room:r51c56, date: today, timeSlot: Booking.AM ))


    }

    def destroy = {
    }

    /**
     * Convenience method to save a domain object and throw an exception if validation fails.
     * @param domainObject
     * @return Object - the saved domain object
     */
    static <T> T save(T domainObject) {
        domainObject.save(failOnError: true) // will throw an exception if validation fails
        return domainObject
    }

    /**
     * Convenience method to convert a LocalDate to a java.util.Date
     * @param localDate
     * @return Date - a java.util.Date
     */
    static Date toUtilDate(LocalDate localDate) {
        // this is not the best way to do it in general but it works for our purposes
        return new Date(localDate.toEpochDay() * 24 * 60 * 60 * 1000)
    }
}
