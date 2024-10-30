package rooms

class PersonController {

    static scaffold = Person  // dynamic scaffold

    def save(Person person) { // static scaffold - keep only the overridden pieces

        render text: "save Person is no longer allowed via web"

    }

}
