package pro.sky.calculator.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class CalculatorService {
    public String calculator() {
        return "Добро пожаловать в калькулятор!";
    }

    public String plus(int num1, int num2) {
        int result = num1 + num2;
        return "Результат = " + num1 + "+" + num2 + "=" + result;
    }

    public String minus(int num1, int num2) {
        int result = num1 - num2;
        return "Результат = " + num1 + "-" + num2 + "=" + result;
    }

    public String proizvedenie(int num1, int num2) {
        int result = num1 * num2;
        return "Результат = " + num1 + "*" + num2 + "=" + result;
    }

    public String divide(int num1, int num2) {

        int result = num1 / num2;
        return "Результат = " + num1 + "/" + num2 + "=" + result;
    }


    }

