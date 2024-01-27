package Homework7;

class Division extends Operation{

    @Override
    public ComplexNumber calculate(ComplexNumber numberA, ComplexNumber numberB) {
        double aReal = numberA.getReal();
        double bReal = numberB.getReal();
        double aImaginary = numberA.getImaginary();
        double bImaginary = numberB.getImaginary();

        ComplexNumber result = new ComplexNumber(((aReal*bReal+aImaginary*bImaginary)/(bReal*bReal+bImaginary*bImaginary)), (aImaginary*bReal + aReal*bImaginary*(-1))/(bReal*bReal+bImaginary*bImaginary));
        
        return result;
    }   
}
