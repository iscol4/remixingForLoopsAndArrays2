/*
Isaac Collier
March 24 2020
This program uses arrays and loops to collect five names and input the 2nd,3rd, and 4th names back to user.
 */
package remixingforloopsandarrays2;

/**
 *
 * @author Isaac
 * This class is teaching me bout arrays and how to use them to make repeated code quicker.
 */
import java.util.Scanner;
public class RemixingForLoopsAndArrays2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner keyedInput = new Scanner (System.in);
        
           //creates array:
        String [ ] friends = new String [5];
        
         //asks user for 5 names:
        System.out.println("Enter the names of five friends:");
        
          //creates for loop that runs 5 times, where user declares a name every time:
        for (int i = 0; i <= 4; i = i + 1)
        {
            friends[i] = keyedInput.nextLine();
        }
        
        //Displays 2nd, 3rd, and 4th names to user:
        System.out.println("The second, third, and fourth names listed were:");
        System.out.println("second: " + friends[1]);
        System.out.println("third: " + friends[2]);  
          System.out.println("fourth: " + friends[3]); 
    }
    
}
