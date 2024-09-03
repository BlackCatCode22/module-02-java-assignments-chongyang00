// Chong Yang 9/3/24
// ForEachArrays.java

public class ForEachArrays {
    public static void main(String[] args) {

        System.out.println("\nWelcome to the For Each Arrays Program.\n");

        // create an array of cars. do this in two different ways and be bale to explain
        // to your lab partner

        String[] cars = {"BMW", "Tesla", "Honda"};

        // output the cars array using a for each loop
        for (int i = 0; i <= 2; i++) {
            System.out.println(cars[i]);
        }
        System.out.println("\nMy for loop is done\n");

        //use a for : each loop to do the same thing
        for (String car : cars) {
            System.out.println(car);
        }

        // create a String array using new operator
        // create a 4 element String array named myCars
        String[] myCars = new String[4];

        // myCars[0], myCars[1], myCars[2], myCars[3]

        // fill the nely created String array with data
        myCars[0] = "Tesla";
        myCars[1] = "GMC";
        myCars[2] = "Jeep";
        myCars[3] = "Honda";

        // use a for : each loop to output the myCars array
        for (String myCar : myCars) {
            System.out.println("A car in myCars[] array is: " + myCar);
        }

        String[] myStrings = new String[6];

        // use a for loop to fill the array with some string
        for (int i = 0; i < 6; i++) {
            // fill my array with strings
            myStrings[i] = "this is string number: " + (i + 1);
        }

        int aNum = 0;
        for (String aStr : myStrings) ;
        // fill my array with strings
        myStrings[aNum] = "this string number is: " + (aNum + 1);
        aNum++;

        // now use a for : each loop to output the myString[] array
        for (String aStr : myStrings) {
            System.out.println("An element in myString[] is " + aStr);
        }

        // reverse a string
        String myStrToReverse = "abcdefg";

        // outut the chars of myStrToReverse
        for (int i = 0; i < 7; i++){
            System.out.println("myStringToReverse["+i +"] is: "+myStrToReverse.charAt(i));
    }

        System.out.println("End of initial output");

        //create the reverse string
        String reveredStr = "";

        //output reveresedStr
        System.out.println("reveredStr before revision loop is:" + reveredStr);

        for(int i=6; i>=0; i--){
            char charToAdd = myStrToReverse.charAt(i);
            reveredStr = reveredStr.concat(Character.toString(charToAdd));
        }

        //output reveredstr
        System.out.println("reversedStr after revision loop is: " + reveredStr);





    }
}