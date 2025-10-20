import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean continueCalculating = true;
        double result=0;
        boolean firstCalculation =true;

        System.out.println("===  Calculator ===");
        System.out.println("Type 'exit' to quit or 'reset' to start fresh\n");

        //multiple calculations loop
        while (continueCalculating){

            // For first calculation
            if (firstCalculation){

                System.out.println("Enter the first number: ");
                result = sc.nextDouble();
                System.out.println("Current value: " + result);
                firstCalculation =false;
            }

            // Ask for operator
            System.out.print("\nEnter operation (+, -, *, /) or 'exit'/'reset': ");
            String input= sc.next();


            // Exit condition
            if (input.equalsIgnoreCase("exit")){
                System.out.println("\nFinal Result: " + result);
                System.out.println("Thankyou for using Calculator. GoodBye!");
                continueCalculating=false;
                continue;
            }

            // Reset condition
            if (input.equalsIgnoreCase("reset")){
                System.out.println("\nResetting calculator...\n");
                firstCalculation=true;
                result=0;
                continue;
            }

            // Ask for number
            System.out.println("enter the number: ");
            double num = sc.nextDouble();

            // Perform operation based on operator
            switch (input){
                case "+" :
                    result = addition(result , num);
                    System.out.println("Result: " + result);
                    break;
                case "-" :
                    result = subtract(result , num);
                    System.out.println("Result: " + result);
                    break;
                case "*" :
                    result = multiply(result , num);
                    System.out.println("Result: " + result);
                    break;
                case "/" :
                    result = divide(result , num);
                    System.out.println("Result: " + result);
                    break;
                default:
                    System.out.println("Invalid operator! Please use +, -, *, or /");
            }
        }

        sc.close();



    }


    // add method
    public static double addition(double a, double b){
        return a + b;
    }


    // subtract method
    public static double subtract(double a, double b){
        return a - b;
    }

    // multiply method
    public static double multiply(double a, double b){
        return a * b;
    }
    // divide method
    public static double divide(double a, double b){

        if(b==0){
            System.out.println("Error: Cannot divide by zero!");
            return 0;
        }

        return a / b;
    }


    }

