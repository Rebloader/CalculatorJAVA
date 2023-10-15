package org.example;

import org.example.logger.Logging;

class DivisionDecorator extends ComplexCalculatorDecorator {

    public DivisionDecorator(ComplexCalculator calculator, Logging logger) {
        super(calculator, logger);
    }

    public ComplexNumber division(ComplexNumber num1, ComplexNumber num2) {
        return super.division(num1, num2);
    }
}
