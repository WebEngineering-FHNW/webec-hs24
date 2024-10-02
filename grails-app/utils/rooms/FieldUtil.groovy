package rooms

import grails.validation.Validateable
import org.springframework.validation.FieldError

class FieldUtil {
    static boolean hasError(Validateable model, String propertyName) {
        null != findError(model, propertyName)
    }
    static FieldError findError(Validateable model, String propertyName) {
        model.errors.fieldErrors.find {it.field == propertyName}
    }
}
