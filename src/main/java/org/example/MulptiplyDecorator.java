package org.example;

import org.example.logger.Logging;

import java.util.logging.Logger;

class MulptiplyDecorator extends ComplexCalculatorDecorator {

    public MulptiplyDecorator(ComplexCalculator calculator, Logging logger) {
        super(calculator, logger);
    }

    public ComplexNumber multiply(ComplexNumber num1, ComplexNumber num2) {
        return super.multiply(num1, num2);
    }
}
