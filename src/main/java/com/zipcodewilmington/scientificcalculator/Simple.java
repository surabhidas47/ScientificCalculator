package com.zipcodewilmington.scientificcalculator;


import java.io.PrintStream;
import java.util.Scanner;
public class Simple {


        public static void main(String[] args) {
            double number1;
            double number2;
            char operator;
            Scanner enter = new Scanner(System.in);
            System.out.println("Enter your number");
            number1 = enter.nextDouble();
            System.out.println("Enter operator (+,-,*,/)");
            operator = enter.next().charAt(0);
            System.out.println("Enter your second number");
            number2 = enter.nextDouble();
            enter.close();
            switch (operator) {
                case '+':
                    System.out.printf("%.2f - %.2f = %.2f", number1, number2, (number1 + number2));
                    break;
                case '-':
                    System.out.printf("%.2f - %.2f = %.2f", number1, number2, (number1 - number2));
                    break;
                case '*':
                    System.out.printf("%.2f * %.2f = %.2f", number1, number2, (number1 * number2));
                    break;
                case '/':
                    if(number2 == 0 )
                        System.out.println("Error");
                    else
                        System.out.printf("%.2f / %.2f = %.2f", number1, number2, (number1 / number2));
                    break;
                default:
                    System.out.println("Invalid operator");
            }
        }
    }

