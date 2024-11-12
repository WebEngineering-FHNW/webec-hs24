package rooms

// Entität
class Person {
    String  firstName
    String  lastName
    SecUser secUser

    public String toString() {
        return firstName + " " + lastName;
    }

    static constraints = {
        firstName nullable: true
        lastName  nullable: true
        secUser   nullable: true
    }
}
