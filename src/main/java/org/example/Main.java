package org.example;

import org.example.logger.CalculatorLogger;
import org.example.logger.Logging;

public class Main {
    public static void main(String[] args) {
        ComplexCalculator calculator = new BasicComplexCalculator();
        Logging logger = new CalculatorLogger(Main.class);
        calculator = new DivisionDecorator(calculator, logger);

        Scanner scanner = new Scanner(System.in);

        int realNum1 = scanner.nextInt();
        int imagNum1 = scanner.nextInt();
        int realNum2 = scanner.nextInt();
        int imagNum2 = scanner.nextInt();
        

        ComplexNumber num1 = new ConcreteComplexNumber(realNum1, imagNum1);
        ComplexNumber num2 = new ConcreteComplexNumber(realNum2, imagNum2);

        ComplexNumber result = calculator.division(num1, num2);
        System.out.println("Result division: " + result);
        ComplexNumber result2 = calculator.addition(num1, num2);
        System.out.println("Result Addition: " + result2);
        ComplexNumber result3 = calculator.multiply(num1, num2);
        System.out.println("Result Multiple: " + result3);
    }
}
