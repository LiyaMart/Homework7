package Homework7;

public class Calculator {

    IOperationFactory operation;
    FileLogger logger = new FileLogger();
    CalculatorView view = new CalculatorView();

    public void runToDo() { 
        System.out.println("Выберите операцию: \n + сложение \n * умноение \n / деление");
        String operator = view.getUserChoice();
        logger.setFileHandler("Homework7/log.txt");
        switch (operator) {
            case "+":
            operation = new SummaryFactory();       
            break;
            case "*":
            operation = new MultiplyFactory();
            break;
            case "/":
            operation = new DivisionFactory();
            break;
            default:
            logger.log(operator);
            operator = null;
        }
        if (operator != null){
            Operation operationChoice = operation.createOperation();
            ComplexNumber numberA = new ComplexNumber(view.getUserAReal(), view.getUserAImaginary());
            ComplexNumber numberB = new ComplexNumber(view.getUserBReal(), view.getUserBImaginary());
            System.out.println(operationChoice.calculate(numberA, numberB));
            logger.log(operator);
        } 
        else {
                System.out.println("Неверный выбор. Попробуйте еще раз.");
        };
        }
}
