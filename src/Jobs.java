/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ainsl
 */
//Lab Assignment 4 Ainsley Plumadore
import java.util.Random;

public class Jobs implements RoboJobs3000{
    @Override
    public void comedian() {
        String[] jokes = new String[4];
        jokes[0] = "Why do pirates not know the alphabet? ... They always get stuck at 'C'.";
        jokes[1] = "Who did the wizard marry? ... His ghoul-friend.";
        jokes[2] = "What cheese can never be yours? ... Nacho cheese.";
        jokes[3] = "Why do bears have hairy coats? ... Fur protection.";
        int randJoke = new Random().nextInt(jokes.length);
        System.out.println(jokes[randJoke]);
    }
    
    @Override
    public void politician() {
        System.out.println("Vote Robo for presidet 2024. He promies he won't take over the world.");
    }
    
    @Override
    public void singer() {
        String[] lyrics = {"aaaaa", "ooooo", "doooo", "diiii", "daaaa"};
        int numberOfLyrics = 10;
        for (int i = 0; i < numberOfLyrics; i++) {
            int randLyrics = new Random().nextInt(lyrics.length);
            System.out.print(lyrics[randLyrics] + " ");
        }
        System.out.println();
    }
    
    @Override
    public void mathTeacher(int n1, int n2) {
        int ans = n1 + n2;
        System.out.println(n1 + " plus " + n2 + " equals " + ans);
    }
    
    @Override
    public void madeUpFact() {
        String[] part1 = {
            "It took Erno Rubik, ",
            "Twinkies only have ",
            "In a room with just 23 people, "
        };
        String[] part2 = {
            "the creator of the rubik's cube, ",
            "a shelf life ",
            "theres a 50-50 chance that at least "
        };
        String[] part3 = {
           "about one month to solve the cube after he created.",
           "of 45 days.",
           "two people have the same birthday."
        };
        
        int randFactP1 = new Random().nextInt(part1.length);
        int randFactP2 = new Random().nextInt(part2.length);
        int randFactP3 = new Random().nextInt(part3.length);
        
        String randFact = part1[randFactP1] + part2[randFactP2] + part3[randFactP3];
        System.out.println(randFact);
    }
    
    @Override
    public void quit() {
        System.out.println("Program ending. I quite my job.");
        System.exit(0);
    }
}
