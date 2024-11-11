package pro.sky.calculator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping(path = "/")
    public String calculator() {
        return calculatorService.calculator();
    }

    @GetMapping(path = "/minus")
    public String plus(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.minus(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.minus(num1, num2);
    }

    @GetMapping(path = "/proizvedenie")
    public String proizvedenie(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.proizvedenie(num1, num2);
    }

    @GetMapping(path = "/delenie")
    public String delenie(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.delenie(num1, num2);
    }

}

