/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ainsl
 */

//Lab Assignment 3 Ainsley Plumadore

import java.util.Scanner;

public class EfficiencyCalculatorDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter the number of memberships you have: ");
        int memberTotal = input.nextInt();
        System.out.println("Please enter the number of cards you have: ");
        int cardTotal = input.nextInt();
        System.out.println("Please enter the total revenue that you have: ");
        int totalRevenue = input.nextInt();
        
        EfficiencyCalculator eCalc = new EfficiencyCalculator(memberTotal, cardTotal, totalRevenue);
        System.out.println("Membership Efficiency: " + eCalc.calculateMemberEfficiency());
        System.out.println("Card Efficiency: " + eCalc.calcuclateCardEfficiency());
    }
    
}
