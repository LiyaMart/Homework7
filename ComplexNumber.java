package Homework7;


public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    public String toString() {
        if (this.imaginary<0) {
            return this.real + "" + this.imaginary + "i";
        }
        if (this.imaginary==0) {
            return this.real + "";
        }
        else {
           return this.real + "+"+ this.imaginary + "i";
        }
    }
}
