/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ainsl
 */

import java.util.Scanner;

public class LabAssign2_Plumadore {
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        //int first, second;
        char operation;
        
       while (true) {
        
            System.out.println("Please enter two numbers that you would like to perform a math operation on: ");
            operation = getOperationType(input);
            input2.nextLine().charAt(0);
       
           System.out.print("Would you like to perform a new operation? Yes/No ");
           String newOperation = input.next();
           if ("no".equalsIgnoreCase(newOperation)) {
               break;
           }
       }
    }
    
    public static int getOperand(Scanner in, String wordNumber) {
        int num;
        
        do {
            System.out.print("Enter the " + wordNumber + " number: ");
            num = in.nextInt();
        } while(num <= 0);
        
        return num;
    }
    
    public static char getOperationType(Scanner inp) {
        char symbol;
        int first, second;
        
        first = getOperand(inp, "First");
        second = getOperand(inp, "Second");
        inp.nextLine();
        
        do {
            System.out.println("Please pick the operation that you would like to perform: ");
            System.out.println("+ -> addition");
            System.out.println("- -> subtraction");
            System.out.println("* -> multiplication");
            System.out.println("/ -> division");
            System.out.println("% -> modulus");
            System.out.print("Choice: ");
            symbol = inp.nextLine().charAt(0);
            if (!(symbol == '+' || symbol == '-' || symbol == '*' || symbol == '/' || symbol == '%')) {
                System.out.println("Invalid operation, please re-enter your choice...");
            }
        } while(!(symbol == '+' || symbol == '-' || symbol == '*' || symbol == '/' || symbol == '%'));
        
        switch(symbol)
        {
            case '+':
                System.out.println("Sum is " + (first + second));
                break;
            case '-':
                System.out.println("Difference is " + (first - second));
                break;
            case '*':
                System.out.println("Product is " + (first * second));
                break;
            case '/':
                if (second == 0){
                    System.out.println("Reminder division by zero is not allowed.");
                }
                else {
                    System.out.println("Quotiant is " + ((float) first/second));
                }
                break;
            case '%':
                if (second == 0) {
                    System.out.println("Modulo division does not allow division by zero.");
                }
                else {
                    System.out.println("Remainder is " + (first%second));
                }
                break;
            default:
                System.out.println("Invalid option...");
                break;
        }
        return symbol;
    }
}

