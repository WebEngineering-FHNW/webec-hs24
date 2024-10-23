package rooms

class Booking {
    Person person
    Room   room
    Date   date
    String timeSlot

    static final AM  = "08:15-11:00"
    static final PM1 = "12:15-15:00"
    static final PM2 = "15:15-18:00"

    static constraints = {
        person   nullable:false
        room     nullable:false
        date     nullable:false
        timeSlot inList: [AM, PM1, PM2]
    }
}
