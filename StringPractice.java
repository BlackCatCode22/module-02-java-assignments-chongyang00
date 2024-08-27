// Chong Yang 8/26/24
// StringPractice.java

public class StringPractice {
    public static void main(String[] args) {

        System.out.println("\n Welcome to my String Practice Program! \n");

        // create a string object
        String myPracticeStr;
        myPracticeStr = "Hello from my STRING practice program!";

        System.out.println("\n myPracticeString is: " + myPracticeStr);


        // use a few string method
        // a method is an object oriented language name for a function
        // methods always have a pair of paranthesis () attached to them
        //
        // use the toLowerCase()
        String myNewStr = "";

        myNewStr = myPracticeStr.toUpperCase();

        // prove it
        System.out.println(" \n myNewStr is: " + myNewStr);

        // toLowerCase
        myNewStr = myPracticeStr.toLowerCase();
        System.out.println("\n myNewStr is: " + myNewStr);

        // use the length method
        // create an int variable, because the length() method returns an int
        int myInt = 0;

        // find the length of our string object

        myInt = myPracticeStr.length();

        // prove
        System.out.println(" \n The lenth of: " + myPracticeStr + " is: " + myInt);

        // .contain()
        boolean isItThere;
        isItThere = myPracticeStr.contains("STR");
        System.out.println(" \n The value of isItThere is: " + isItThere);

        // charAt
        char myChar;
        int anotherInt = 4;
        myChar = myPracticeStr.charAt(anotherInt);

        //output result
        System.out.println("\n The char at index " + anotherInt + " is: " + myChar );

        // .indexOf
        int mySecondInt;
        mySecondInt = myPracticeStr.indexOf("STR");
        System.out.println("\n The index of STR is: " + mySecondInt);

        // .lastIndexOf
        int oneMoreInt;
        oneMoreInt = myPracticeStr.lastIndexOf("m");
        System.out.println("\n oneMoreInt is: " + oneMoreInt);

        // .subString
        String myLastStringObject;

        myLastStringObject = myPracticeStr.substring(0, myPracticeStr.indexOf("STR"));
        System.out.println("\n myLastStringObject is: " + myLastStringObject);



    }
}