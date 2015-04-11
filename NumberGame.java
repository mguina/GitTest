import static java.lang.System.out;
import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in); //this is where you get the input system.in is the keyboard.
                
                out.print("Enter the maximum number: "); //user chooses how many possibilities there will be.
                        
                        int maxNo = keyboard.nextInt(); 
                                
        out.print("Enter any number from 1 to 10: ");

        int inputNo = keyboard.nextInt();
        int randomNo = new Random() .nextInt(2) + 1; // the number in the brackets is the number of possibilities from which the random number can be chosen.
        
        if (inputNo == randomNo) {
            out.println(" ***************");
            out.println(" *** YOU WIN ***");
            out.println(" ***************");
        } else {
            out.println("******************");
            out.println("**** YOU LOSE ****");
            out.println("******************");
            out.println("* The Number was *");
            out.println("******* " + randomNo + " *******");
        }
    }

}
