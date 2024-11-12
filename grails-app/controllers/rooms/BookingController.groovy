package rooms

class BookingController {

    def springSecurityService
    static scaffold = Booking // dynamic scaffold

    def play() {
        Person dierk = Person.findByFirstName("Dierk")
        String result = Booking.findAllByPerson(dierk).toString()
        render text:result
    }

    def myBookings() {
        if (!springSecurityService.isLoggedIn()) {
            redirect(controller: 'login', action: 'auth', params: params)
            return
        }
        SecUser secUser           = springSecurityService.currentUser
        Person person             = Person.findBySecUser(secUser)
        List<Booking> bookingList = Booking.findAllByPerson(person)
        render view:"index", model:[bookingList: bookingList, person: person]
    }

}
