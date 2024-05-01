/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ainsl
 */

//Lab Assignment 5 Ainsley Plumadore

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class LabAssign5_Plumadore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dig1, dig2, dig3;
        String line;
        String[] tokens;
        Scanner scan = null;
        File f = new File("phonenumbers.txt");
        int validPhoneNumberCount = 0;
        
        try {
            scan = new Scanner(f);
        }
        catch(FileNotFoundException e) {
            System.out.println("Error reading from the text file.");
            System.exit(0);
        }

        while (scan.hasNext()) {
            line = scan.nextLine();
            tokens = line.split("-");
            //System.out.println("Size of line " + tokens.length);

            if (tokens.length == 3 && tokens[0].length() == 3 && tokens[1].length() == 3 && tokens[2].length() == 4) {
                try {
                    dig1 = Integer.parseInt(tokens[0]);
                    dig2 = Integer.parseInt(tokens[1]);
                    dig3 = Integer.parseInt(tokens[2]);
                    System.out.println(dig1 + "-" + dig2 + "-" + dig3);
                    ++validPhoneNumberCount;
                }
                catch (NumberFormatException ee) {
                    System.out.println("Some or all this data are not ints: " + line);
                }
            }
            else {
                System.out.println("Invalid phone number format: " + line);
            }
        }
        scan.close();
        System.out.println("Total number of vaild phone numbers: " + validPhoneNumberCount);
        System.out.println("No more data in file.");
        System.exit(0);
    }

}
