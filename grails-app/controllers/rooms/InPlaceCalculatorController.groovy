package rooms

import grails.validation.Validateable

class InPlaceCalculatorController {

    def calc(CalculatorModel calcModel) {
        calcModel.en     = Math.round(calcModel.en   * 10) / 10
        calcModel.exam   = Math.round(calcModel.exam * 10) / 10
        calcModel.result = Math.round((calcModel.en + calcModel.exam) / 2)
        if (calcModel.hasErrors()) {
            calcModel.result = "Cannot calculate. Input data was invalid."
        }
        render view:'calc', model: [calculatorInstance: calcModel]
    }

}

class CalculatorModel implements Validateable {
    double en     = 0.0
    double exam   = 0.0
    String result = ""

    static constraints = {
        en   min:1d, max:6d, scale:1
        exam min:1d, max:6d, scale:1
        result nullable:true
    }
}
