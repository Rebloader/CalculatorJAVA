package org.example;

import org.example.logger.Logging;

abstract class ComplexCalculatorDecorator implements ComplexCalculator {
    ComplexCalculator calculator;
    Logging logger;

    public ComplexCalculatorDecorator(ComplexCalculator calculator, Logging logger) {
        this.calculator = calculator;
        this.logger = logger;
    }

    public ComplexNumber addition(ComplexNumber num1, ComplexNumber num2) {
        logger.logInfo("Сложение:");
        ComplexNumber result = calculator.addition(num1, num2);
        logger.logInfo("Result: " + result);
        return result;
    }

    public ComplexNumber multiply(ComplexNumber num1, ComplexNumber num2) {
        logger.logInfo("Умножение: ");
        ComplexNumber result = calculator.multiply(num1, num2);
        logger.logInfo("Result: " + result);
        return result;
    }

    public ComplexNumber division(ComplexNumber num1, ComplexNumber num2) {
        logger.logInfo("Деление: ");
        ComplexNumber result = calculator.division(num1, num2);
        logger.logInfo("Result: " + result);
        return result;
    }
}
