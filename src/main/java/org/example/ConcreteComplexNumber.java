package org.example;

public class ConcreteComplexNumber implements ComplexNumber{
    private double real;
    private double imaginary;

    public ConcreteComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public String toString() {
        return real + " + " + imaginary + "i";
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }
}
