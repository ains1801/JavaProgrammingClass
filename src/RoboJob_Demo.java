
//Lab Assignment 4 Ainsley Plumadore
// Imports
import java.util.Scanner;

public class RoboJob_Demo {

    public static void main(String[] args) {
        
        // Create objects & variables necess3ary for program
        Jobs app = new Jobs();
        Scanner scan = new Scanner(System.in);
        int choice;

        System.out.println("Welcome!");
        // Validation loop (5 ends program)
        do {
            // Prompt for INTEGER
            System.out.print("\n1 = Comedian\n2 = Politician\n"
                    + "3 = Singer\n4 = Math Teacher\n5 = Hear a made up fact\n6 = Quit\nChoice: ");
            choice = scan.nextInt();
            
            // Control structure to determine job to perform
            if(choice == 1) {
                app.comedian();
            }
            else if(choice == 2) {
                app.politician();
            }
            else if(choice == 3) {
                app.singer();
            }
            else if(choice == 4) {
                app.mathTeacher( 
                        (int)(Math.random() * 1000) + 1, 
                        (int)(Math.random() * 1000) + 1
                );
            }
            else if(choice == 5) {
                app.madeUpFact();
            }
            else if(choice == 6) {
                app.quit();
            }
            else { // Invalid choice
                System.out.println("Invalid  "
                        + "choice.");
            }
            
        }while(choice != 6); // Keep going while choice is not 5
        
    }
    
}
