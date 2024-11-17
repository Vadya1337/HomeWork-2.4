package pro.sky.calculator.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.calculator.service.CalculatorService;

@RestController
@RequestMapping(  "/calculator")
public class CalculatorController {
    private CalculatorService calculatorService;

    @Autowired
    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping(path = "/")
    public String calculator() {
        return calculatorService.calculator();
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam (required = false) Integer num1, @RequestParam (required = false) Integer num2) {
      calculatorService.validateParams(num1, num2);
            return calculatorService.plus(num1, num2);
        }



        @GetMapping(path = "/minus")
        public String minus ( @RequestParam int num1, @RequestParam int num2){
            calculatorService.validateParams(num1, num2);
        return calculatorService.minus(num1, num2);
        }

        @GetMapping(path = "/proizvedenie")
        public String proizvedenie ( @RequestParam int num1, @RequestParam int num2){
            calculatorService.validateParams(num1, num2);
            return calculatorService.proizvedenie(num1, num2);
        }

        @GetMapping(path = "/divide")
        public String divide ( @RequestParam int num1, @RequestParam int num2){
            calculatorService.validateParams(num1, num2);
            return calculatorService.divide(num1, num2);
        }
    }
