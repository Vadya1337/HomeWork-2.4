package pro.sky.calculator;

public class CalculatorService {
    public String calculator(){
        return "Добро пожаловать в калькулятор";
    }
    public String plus(int num1, int num2) {
        int result = num1 + num2;
        return "Результат = " + num1 + "+" + num2 + "=" + result;
    }
    public String minus(int num1, int num2) {
        int result = num1 + num2;
        return "Результат = " + num1 + "-"  + num2 + "=" + result;
    }
    public String proizvedenie(int num1, int num2) {
        int result = num1 + num2;
        return "Результат = " + num1 + "*" + num2 + "=" + result;
    }
    public String delenie(int num1, int num2) {
        int result = num1 + num2;
        return "Результат = " + num1 + "/" + num2 + "=" + result;
    }
}
