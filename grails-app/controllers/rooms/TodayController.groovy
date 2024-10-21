package rooms

import java.time.LocalDate

class TodayController {
    def show(int offset) {
        def today = LocalDate.now()

        def offsetIsWrong = ""
        if (offset < 0 ) {
            offsetIsWrong = "error"
        } else {
            today = today.plusDays(offset)
        }
        render view:"TodayView", model: [day: today.toString(), offsetClass: offsetIsWrong]
    }
}
