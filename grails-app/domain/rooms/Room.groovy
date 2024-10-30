package rooms

// Entität
class Room {
    String  name
    Integer capacity

    public String toString() {
        return name + " (" + capacity + ")";
    }

    static constraints = {
        name     nullable:false, blank:false
        capacity min:0, nullable:true
    }
}
