// Chong Yang 08/29/24
/*
* LoopsAndArrays.java
*
* This program will use the for loop to loop through
* a list of names stored in a string array
*
*
 */
import java.util.Scanner;

public class LoopsAndArrays {
    public static void main(String[] args) {

        // create a Scanner object for user input
        Scanner scanner = new Scanner (System.in);

        System.out.printf("\nWelcome to my Friendly For Loop Program!\n");

        // create a for loop that displays 'Hello there!' five times

        // the loop control variable of this for loop
        // is named i (it means integer (a whole number))
        // this loop control must be initialized, checked, and changed

        for (int i = 0; i < 4; i++) {
            System.out.println("\nThe value of i is: " + i);
        }

        // create a while loop that does the same thing

        int loopControlVariable = 0;
        while (loopControlVariable < 6){
            System.out.println("\nThe value of loopControlvariable is: " + loopControlVariable);
            // change the loop control variable
            loopControlVariable++;
        }

        // create a string array of five words
        // String[] names = new String[10];
        String[] names = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};

        //create an int array with 10 elements
        int[] myNumbers = new int[10];

        // use for loop to get ten whole numbers from the user
        for (int i = 0; i<10; i++){
            System.out.println("\nPlease enter number: " + (i+1));
            myNumbers[i] = scanner.nextInt();
        }

        // output the myNumbers[] array .... with a for loop, using length property
        for (int i=0; i <10; i++){
            System.out.println("\nThe value of myNumbers [" + i + "] is: " + myNumbers[i]);
        }




        System.out.println("\nOne of our name is: " + names[4] );

        // output the length of our array named names
        System.out.println("\nThe length of our array names is: " + names.length);

        // create a for loop that outputs all element value in the names array
         for (int i = 0; i < 8; i++) {
             System.out.println("names [" + i + "] is... " + names[i]);
         }

        System.out.println("\nThis is the end of our for loop program!\n");


    }
}