package com.zipcodewilmington.scientific_calculator;
import java.util.Scanner;
/**
 * Created by leon on 2/9/18.
 */
public class TestMainApplication {

    public static void main(String[] args) {
        char operator;
        Double number1, number2, result;
        Scanner input = new Scanner(System.in);
        System.out.println("Choose an operator: +, -, *, or /");
        operator = input.next().charAt(0);
        System.out.println("Enter the first number");
        number1 = input.nextDouble();
        System.out.println("Enter the second number");
        number2 = input.nextDouble();
        switch (operator) {
            case '+':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;
            case '-':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;
            case '*':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;
            case '/':
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;
            default:
                System.out.println("Invalid operator!");
                break;
        }
        input.close();
    }
}
