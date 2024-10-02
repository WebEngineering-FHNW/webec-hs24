package rooms

class CalculatorController {

    def calc(double en, double exam) {
        double result = (en + exam) / 2
        render view: "CalculatorOutput", model: [result: result]
    }
}
