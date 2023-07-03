package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {


        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Calculator Menu:");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Enter 1 to make a Simple Calculation      Enter 2 to make a Simple Calculation      Enter 3 to make a Scientific Calculation");
        System.out.println("(Two number calculation)                  (One numbers calculation) ");

        System.out.println();
        System.out.println("1. Addition    | 5. Exponential x^y        1. Sq root √    |  5. Square x^2          1. Sine        | 5. Inverse Sine    | 9. Log");
        System.out.println("2. Subtraction |                           2. Inverse 1/x  |                         2. Cosine      | 6. Inverse Cosine  | 10.Natural Log 10^x");
        System.out.println("3. Multiply    |                           3. -x to +x     |                         3. Tangent     | 7. Inverse Tangent | 11.Inverse Log e^x");
        System.out.println("4. Divide      |                           4. +x to -x     |                         4. Factorial   | 8. Deg to Rad      | 12.Rad to Deg     ");
        System.out.println();

        int choice = Console.getIntegerInput("Enter:"); // simple or Scientific


        if (choice == 1) {
            //Call Switch method 1
            // take action (ADD/SUB etc..) into one variable
            //take first number
            // take 2nd number
            // pass all the three variables to a function where switch will be there

            int simpleChoice = Console.getIntegerInput("Enter a number to choose simple calculation type:");


            double number1 = Console.getDoubleInput("Enter your first number");
            double number2 = Console.getDoubleInput("Enter your second number");
            performSwitch1(simpleChoice, number1, number2); //this is picking the action

        } else if (choice == 2) {

            //Call switch method 2
            int simpleChoice2 = Console.getIntegerInput("Enter a number to choose simple calculation type:");
            //taking user input for the number they want to perform funtion on
            double num1 = Console.getDoubleInput("Enter a number you to perform function on");
            performSwitch2(simpleChoice2, num1);

        } else if (choice == 3) {

            //Call switch method 3
            int scientificChoice = Console.getIntegerInput("Enter a number to choose scientific calculation type:");
            //taking user input for the number they want to perform funtion on
            int sciNum = Console.getIntegerInput("Enter a number you to perform function on");
            performSwitch3(scientificChoice, sciNum);
        } else {
            System.out.println("Invalid choice. Please try again.");
        }

    }


    //switch for choice 1
    public static void performSwitch1(int simpleChoice, double number1, double number2) {

        Simple simple = new Simple();
        switch (simpleChoice) {
            case 1:
                System.out.println("Your Addition calculation is : " + simple.add(number1, number2));
                // Code for action 1
                break;
            case 2:
                System.out.println("Your Subtraction calculation is : " + simple.subtraction(number1, number2));
                // Code for action 2
                break;
            case 3:
                System.out.println("Your Multiplication calculation is : " + simple.multiply(number1, number2));
                // Code for action 3
                break;
            case 4:
                System.out.println("Your Division calculation is : " + simple.divide(number1, number2));
                // Code for action 4
                break;
            case 5:
                System.out.println("Your Exponential calculation is : " + simple.power(number1, number2));
                // Code for action 7
                break;
            default:
                System.out.println("Invalid choice");
                // Code for default case
                break;
        }
        //need to create switch for choice 2
    }

    public static void performSwitch2(int simpleChoice2, double num1) {

        Simple2 simple2 = new Simple2();
        switch (simpleChoice2) {
            case 1:

                System.out.println("Your Square Root calculation is : " + simple2.sqrtRoot(num1));

                break;

            case 2:
                System.out.println("Your Inverse calculation is : " + simple2.inverse(num1));

                break;

            case 3:
                System.out.println("Your Neg to Neg calculation is : " + simple2.negative2positive(num1));

                break;

            case 4:
                System.out.println("Your Pos to Neg calculation is : " + simple2.negative2positive(num1));
                break;
            case 5:
                System.out.println("Your Square Root calculation is : " + simple2.sqrtRoot(num1));

                break;

            default:
                System.out.println("Invalid choice");
                // Code for default case
                break;
        }

    }


        public static void performSwitch3(int scientificChoice,int sciNum){

            Scientific scientific = new Scientific();
            switch (scientificChoice) {
                case 1:

                    System.out.println("Your Sine calculation is : " + scientific.sine(sciNum));
                    //display number should update with each calculation
                    //var = scientific.sine(sciNum)
                    break;
                case 2:
                    System.out.println("Your Cosine calculation is : " + scientific.cosine(sciNum));

                    break;
                case 3:
                    System.out.println("Your Tangent function calculation is : " + scientific.tangent(sciNum));

                    break;
                case 4:
                    System.out.println("Your Factorial calculation is : " + scientific.factorial(sciNum));

                    break;
                case 5:
                    System.out.println("Your inverse Sine calculation is : " + scientific.arcSine(sciNum));
                    // Code for action 3
                    break;

                case 6:
                    System.out.println("Your inverse Cosine calculation is : " + scientific.arcCosine(sciNum));

                    break;

                case 7:
                    System.out.println("Your inverse Tangent calculation is : " + scientific.arcTangent(sciNum));

                    break;

                case 8:
                    System.out.println("Your Degrees to Radians calculation is : " + scientific.toRadians(sciNum));

                    break;

                case 9:
                    System.out.println("Your Log calculation is : " + scientific.Log(sciNum));

                    break;

                case 10:
                    System.out.println("Your Natural Log calculation is : " + scientific.natLog(sciNum));

                    break;

                case 11:
                    System.out.println("Your Natural Log calculation is : " + scientific.inverseLog(sciNum));

                    break;

                case 12:
                    System.out.println("Your Radians to Degrees calculation is : " + scientific.toDegrees(sciNum));

                    break;

                default:
                    System.out.println("Invalid choice");
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

