package pro.sky.calculator.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class CalculatorService {
    public String calculator() {
        return "Добро пожаловать в калькулятор!";
    }
    public void validateParams(  Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException("Не хватает числа для выполнения данного действия!");
        }
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam int num1, @RequestParam int num2) {
        int result = num1 + num2;
        return num1 + " + " + num2 + " = " + result;

    }


    public String minus(int num1, int num2) {

        int result = num1 - num2;
        return "Результат = " + num1 + "-" + num2 + "=" + result;
    }

    public String proizvedenie(int num1, int num2) {

        int result = num1 * num2;
        return "Результат = " + num1 + "*" + num2 + "=" + result;
    }

    public String divide(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        if (num2 == 0) {
            return " Делить на ноль нельзя";
        } else {
            int result = num1 / num2;
            return "Результат = " + num1 + "/" + num2 + "=" + result;
        }
    }

}









