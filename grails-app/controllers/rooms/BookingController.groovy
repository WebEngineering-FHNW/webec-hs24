package rooms

class BookingController {

    static scaffold = Booking // dynamic scaffold

    def play() {
        Person dierk = Person.findByFirstName("Dierk")
        String result = Booking.findAllByPerson(dierk).toString()
        render text:result
    }

}
