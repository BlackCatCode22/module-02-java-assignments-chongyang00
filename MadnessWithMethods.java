// Chong Yang 9.5.24
// MadnessWithMethods.java

import java.util.Scanner;

public class MadnessWithMethods {
    public static void main(String[] args) {

        System.out.println("\n Welcome to the Madness With Methods Program!");

        int userInputNumber = 0;
        userInputNumber = getUserInput();
        System.out.println("\n The user input the number: " + userInputNumber);


        // find the largest of the two ints

        int myFirstNum = 8;
        int mySecondNum = 3;
        int largest = 0;

        // call the method named compareTwoIt()
        largest = compareTwoInts(myFirstNum, mySecondNum);
        System.out.println("\n The largest of " + myFirstNum + " and " + mySecondNum + " is: " + largest);


        // sum of two ints

        int theSumOfTwoInts = 0;
        theSumOfTwoInts = sumTwoInts(myFirstNum, mySecondNum);
        System.out.println("\n the sum of " + myFirstNum + " and " + mySecondNum + " is: " + theSumOfTwoInts);
    }

    // method to get an interger from the user
    public static int getUserInput (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Enter a integer: ");
        // read the integer input from user
        int userInput = scanner.nextInt();
        return userInput;
    }

    //method to compare two int and return largest
    public static int compareTwoInts(int firstInt, int secondInt){
        int largest = 0;
        if (firstInt > secondInt){
            largest = firstInt;
        }
        else {
            largest = secondInt;
        }
        return largest;
    }

    //method to return the sum of two ints
    public static int sumTwoInts(int num1, int num2){
        int theSum = 0;
        theSum = num1 + num2;
        return theSum;
    }
}