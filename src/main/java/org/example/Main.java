package org.example;

import org.example.logger.CalculatorLogger;
import org.example.logger.Logging;

public class Main {
    public static void main(String[] args) {
        ComplexCalculator calculator = new BasicComplexCalculator();
        Logging logger = new CalculatorLogger(Main.class);
        calculator = new DivisionDecorator(calculator, logger);

        ComplexNumber num1 = new ConcreteComplexNumber(3, 4);
        ComplexNumber num2 = new ConcreteComplexNumber(1, 2);

        ComplexNumber result = calculator.division(num1, num2);
        System.out.println("Result division: " + result);
        ComplexNumber result2 = calculator.addition(num1, num2);
        System.out.println("Result Addition: " + result2);
        ComplexNumber result3 = calculator.multiply(num1, num2);
        System.out.println("Result Multiple: " + result3);
    }
}