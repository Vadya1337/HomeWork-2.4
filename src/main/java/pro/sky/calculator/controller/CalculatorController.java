package pro.sky.calculator.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.calculator.service.CalculatorService;

@RestController
@RequestMapping(  "/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;



    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

        @GetMapping(path = "/")
        public String calculator () {
        return calculatorService.calculator();
    }

        @GetMapping(path = "/plus")
        public String plus ( @RequestParam int num1, @RequestParam int num2){
        return calculatorService.plus(num1, num2);
    }

        @GetMapping(path = "/minus")
        public String minus ( @RequestParam int num1, @RequestParam int num2){
        return calculatorService.minus(num1, num2);
    }

        @GetMapping(path = "/proizvedenie")
        public String proizvedenie ( @RequestParam int num1, @RequestParam int num2){
        return calculatorService.proizvedenie(num1, num2);
    }

        @GetMapping(path = "/divide")
        public String divide ( @RequestParam (required = false) Integer num1, @RequestParam (required = false) Integer num2){
        if (num1 != null && num2 != null){
                if (num2 == 0) {
                    return " Делить на ноль нельзя";
                }
            }else {
              return   " Не хватает числа для выполнения данного действия ";
            }
        return calculatorService.divide(num1, num2);
    }
    }


