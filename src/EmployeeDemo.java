/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ainsl
 */

//OOP Project Ainsley Plumadore

import java.util.Scanner;
public class EmployeeDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creates the scanner to get user data
        Scanner input = new Scanner(System.in);
        //initalizes needed variables
        int size = 0;
        String employeeName;
        double employeeSalary = 0;
        double employeeSales;
        int yearsWithCompany;
        //Reapdatly asks user to enter the number of employees until total number is greater than 0
        while (size <= 0) {
            System.out.println("Enter the number of employees to poll: ");
            size = input.nextInt();
        }
        //Creates the employees array and sets the size equal to size
        Employee[] employees = new Employee[size];
        
        System.out.println("Loading Employees...");
        //Loops through the size of the array and retrives the information for each employee
        for (int i = 0; i < size; i++) {
            input.nextLine();
            //Get employee name
            System.out.print("Enter employees first name " + (i + 1) + ": ");
            employeeName = input.nextLine();
            //Get employee salary
            System.out.print("Enter the salary of employee " + (i + 1) + ": $");
            employeeSalary = input.nextDouble();
            //Get the employees number of years with the company
            System.out.print("Enter the years with the company of employee " + (i + 1) + ": ");
            yearsWithCompany  = input.nextInt();
            //Get the employees number of sales
            System.out.print("Enter the sales of employee " + (i + 1) + ": ");
            employeeSales = input.nextDouble();
            System.out.println("\n");
            //Load the above into the employees array
            employees[i] = new Employee(employeeName, employeeSalary, yearsWithCompany, employeeSales);
        }
        //Prints out each employees information and promotion status using the Employee classes toString method
        for (Employee employee : employees) {
            System.out.println(employee.toString());
            System.out.println("\n");
        }
        //Prints out all the employees elibigable for promtion and their current salary and salary after raise
        System.out.println("***Contragulations to those eligable for promotion!***");

        for (Employee employee : employees) {
            if (employee.promote()) {
                employeeName = employee.getName();
                double raiseAmount = employee.calculateRaise();
                System.out.println("Employee " + employeeName + " is eligible for promotion.");
                System.out.println("Current salary: $" + employeeSalary);
                System.out.println("New salary after raise: $" + raiseAmount);
                System.out.println();
            }
        }
    }
    
}
