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

public class Employee {
    String name;
    double salary, sales;
    int yearsWith;
    boolean promotion;
    
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    
    public Employee(String name, double salary, int yearsWith, double sales) {
       this.name = name;
       setSalary(salary);
       setYearsWith(yearsWith);
       setSales(sales);
       promote();
    }
    
    public String getName() {
        return name;
    }
    
    public void setSalary(double s) {
        if (s < 0) {
            salary = 0;
            System.out.println(ANSI_RED + "Invalid salary entered. Setting salary to $0" + ANSI_RESET);
        } else {
            salary = s;
        }
    }
    
    public void setYearsWith (int y) {
        if (y < 0) {
            yearsWith = 0;
            System.out.println(ANSI_RED + "Invalid years with company entered. Setting years with company to 0" + ANSI_RESET);
        } else {
            yearsWith = y;
        }
    }
    
    public void setSales(double sa) {
        if (sa < 0) {
            sales = 0;
            System.out.println(ANSI_RED + "Invalid sales entered. Setting sales to 0\n" + ANSI_RESET);
        } else {
            sales = sa;
        }
    }
    
    public boolean promote () {
        promotion = false;
        if (sales > 9999 && yearsWith > 2) {
            promotion = true;
        } else {
            promotion = false;
        }
        return promotion;
    }
    
    public double calculateRaise() {
        salary = (salary * 0.05) + salary;
        return salary;
    }
    
    @Override
    public String toString () {
        String promotionStatus;
        if (promotion) {
            promotionStatus = ANSI_GREEN + "true" + ANSI_RESET;
        } else {
            promotionStatus = ANSI_RED + "false" + ANSI_RESET;
        }
        return "Employee Name: " + name + ", has a current salary of " + salary + ".\nHas been with the company for " + yearsWith + " years and last year sold a total of " + sales + ".\nPromotion status: " + promotionStatus;
    }
}
