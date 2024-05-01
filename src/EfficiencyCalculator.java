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
public class EfficiencyCalculator {
    private int membership;
    private int cards;
    private int totalRev;
    private double mEfficiecny;
    private double cEfficiecny;
    
    
    //Default Constructor
    public EfficiencyCalculator() {
        membership = 0;
        cards = 0;
        totalRev = 0;
        
        mEfficiecny = calculateMemberEfficiency();
        cEfficiecny = calcuclateCardEfficiency();
    }
    
    //Overloaded Constructor
    public EfficiencyCalculator(int m, int c, int t) {
        membership = m;
        cards = c;
        totalRev = t;
        
        mEfficiecny = calculateMemberEfficiency();
        cEfficiecny = calcuclateCardEfficiency();
    }
    
    public void setMembership(int m) {
        membership = m;
    }
    
    public int getMembership() {
        return membership;
    }
    
    public void setCards(int c) {
        cards = c;
    }
    
    public int getCards() {
        return cards;
    }
    
    public void setTotalRev(int t) {
        totalRev = t;
    }
    
    public int getTotalRev() {
        return totalRev;
    }
    
    public double calculateMemberEfficiency() {
        double memberEfficieny = totalRev/membership;
        return memberEfficieny;
    }
    
    public double calcuclateCardEfficiency() {
        double cardEfficiency = totalRev/cards;
        return cardEfficiency;
    }
}
