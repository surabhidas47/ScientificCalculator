package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {


        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Calculator Menu:");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Enter 1 to make a Simple Calculation                        Enter 2 to make a Scientific Calculation");
        System.out.println();

        System.out.println();
        System.out.println("1. Addition    | 5. Square a x^2    | 8. Inverse 1/x         1. Sine        | 5. Inverse Sine    | 8. Log");
        System.out.println("2. Subtraction | 6. Sq root √       | 9. -x to +x            2. Cosine      | 6. Inverse Cosine  | 9. Natural Log 10^x");
        System.out.println("3. Multiply    | 7. Exponential x^y | 10. +x to -x           3. Tangent     | 7. Inverse Tangent | 10. Inverse natural Log e^x");
        System.out.println("4. Divide      |                    |                        4. Factorial   |                    |      ");
        System.out.println();

        int choice = Console.getIntegerInput("Enter:"); // simple or Scientific

        if (choice == 1) {
            //Call Switch method 1
            // take action (ADD/SUB etc..) into one variable
            //take first number
            // take 2nd number

            // pass all the three variables to a function where switch will be there

            int simpleChoice = Console.getIntegerInput("Enter a number to choose simple calculation type:");

            double number1 = Console.getDoubleInput("Enter your first numbner");
            double number2 = Console.getDoubleInput("Enter your second numbner");
            performSwitch1(simpleChoice); //this is picking the action

        }
        else if (choice == 2) {

            //Call switch method 2
            int scientificChoice = Console.getIntegerInput("Enter a number to choose scientific calculation type:");
            //taking user input for the number they want to perform funtion on
            int sciNum = Console.getIntegerInput("Enter a number you to perform function on");
            performSwitch2(scientificChoice,sciNum);
        } else {
            System.out.println("Invalid choice. Please try again.");
        }


            }

            //need to create switch for choice 1
            public static void performSwitch1(int simpleChoice) {


                switch (simpleChoice) {
                    case 1:
                        System.out.println("Performing action 1");


                        // Code for action 1
                        break;
                    case 2:
                        System.out.println("Performing action 2");
                        // Code for action 2
                        break;
                    case 3:
                        System.out.println("Performing action 3");
                        // Code for action 3
                        break;
                    default:
                        System.out.println("Invalid choice");
                        // Code for default case
                        break;
                }
                //need to create switch for choice 2
            }

    public static void performSwitch2(int scientificChoice,int sciNum) {

        Scientific scientific = new Scientific();
        switch (scientificChoice) {
            case 1:
                System.out.println("sci Performing action 1 ");
                System.out.println("Your sine function calculation is : "+scientific.sine(sciNum));
                break;
            case 2:
                System.out.println("sciPerforming action 2");
                // Code for action 2
                break;
            case 3:
                System.out.println("sciPerforming action 3");
                // Code for action 3
                break;
            default:
                System.out.println("sciInvalid choice");
                // Code for default case
                break;
        }

    }


}
 /*Console.println("Welcome to my calculator!");
         String s = Console.getStringInput("Enter a string");
         Integer i = Console.getIntegerInput("Enter an integer");
         Double d = Console.getDoubleInput("Enter a double.");

         Console.println("The user input %s as a string", s);
         Console.println("The user input %s as a integer", i);
         Console.println("The user input %s as a d", d) */


//String userInput = Console.getStringInput();
//String userInput = Console.getStringInput("Choose an operator: +, -, *, or /");
//System.out.println("You input: " + userInput);

// created object instance of Trigonometry
// Scientific trig = new Scientific();
//  double input = Console.getDoubleInput("Please enter a double");
// System.out.println(trig.sine(input));

//      System.out.print("Enter the first number: ");
//     System.out.print("Enter the second number: ");
//  double num1 = Console.getDoubleInput("Enter an integer");
//   double num2 = Console.getDoubleInput("Enter an integer");

