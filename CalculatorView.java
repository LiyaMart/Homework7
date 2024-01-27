package Homework7;

import java.util.Scanner;

public class CalculatorView {
    private Scanner scanner;

    public CalculatorView() {
        scanner = new Scanner(System.in);
    }

    public String getUserChoice() {
        System.out.println("Выбор операции");
        return scanner.nextLine();
    }

    public double getUserAReal(){
        System.out.println("Введите действительную часть первого числа ");
        return scanner.nextDouble();
    }

    public double getUserAImaginary(){
        System.out.println("Введите мнимую часть первого числа ");
        return scanner.nextDouble();
    }

    public double getUserBReal(){
        System.out.println("Введите действительную часть второго числа ");
        return scanner.nextDouble();
    }
     public double getUserBImaginary(){
        System.out.println("Введите мнимую часть второго числа ");
        return scanner.nextDouble();
    }
}