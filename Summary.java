package Homework7;

public class Summary extends Operation {
    
    @Override
    public ComplexNumber calculate(ComplexNumber numberA, ComplexNumber numberB) {
        double aReal = numberA.getReal();
        double bReal = numberB.getReal();
        double aImaginary = numberA.getImaginary();
        double bImaginary = numberB.getImaginary();

        ComplexNumber result = new ComplexNumber(aReal + bReal, aImaginary + bImaginary);
        
        return result;
    }
}
