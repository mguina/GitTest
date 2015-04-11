import static java.lang.System.out;
import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
                
        out.print("Enter the maximum number: ");
                        
        int maxNo = keyboard.nextInt(); 
                                
        out.print("Enter any number from 1 to " + maxNo +": ");

        int inputNo = keyboard.nextInt();
        int randomNo = new Random() .nextInt(maxNo) + 1;
        
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
