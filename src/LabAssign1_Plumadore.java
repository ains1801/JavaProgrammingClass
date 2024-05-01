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

public class LabAssign1_Plumadore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       while (true) {
           Scanner input = new Scanner(System.in);
       
            System.out.println("Please enter two numbers that you would like to perform a math operation on: ");
            System.out.print("First number: ");
            int num1 = input.nextInt();
            System.out.print("Second number: ");
            int num2 = input.nextInt();
       
            System.out.println("Plese pick the operation you would like to perform: ");
            System.out.println("1 -> addition");
            System.out.println("2 -> subtraction");
            System.out.println("3 -> multiplication");
            System.out.println("4 -> division");
            System.out.println("5 -> modulus");
            System.out.print("Choice: ");
            int operation = input.nextInt();
       
            switch(operation)
            {
                case 1:
                    System.out.println("Sum is " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Difference is " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Product is " + (num1 * num2));
                    break;
                case 4:
                    if (num2 == 0){
                        System.out.println("Reminder division by zero is not allowed.");
                    }
                    else {
                        System.out.println("Quotiant is " + ((float) num1/num2));
                    }
                    break;
                case 5:
                    if (num2 == 0) {
                        System.out.println("Modulo division does not allow division by zero.");
                    }
                    else {
                        System.out.println("Remainder is " + (num1%num2));
                    }
                    break;
                default:
                    System.out.println("Invalid option...");
                    break;
           }
           System.out.print("Would you like to perform a new operation? Yes/No ");
           String newOperation = input.next();
           if ("no".equalsIgnoreCase(newOperation)) {
               break;
           }
       }
    }
    
}

