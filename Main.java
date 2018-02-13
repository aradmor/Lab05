import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner scnr = new Scanner(System.in);
        String hex;
        int hexLength;
        int i = 0;  // counter to which position in string the program will run
        long part; // each part is evaluated at a different charecter and added together
        long dec = 0;

        System.out.println("Enter a hexadecimal number: ");
        hex = scnr.nextLine();

        if (hex.substring(0,2).equals("0x")) { // remove the 0x if a user inputs it
            hex = hex.substring(2);
        }
        hexLength = hex.length();
        int x=0; //16 ^x
        while (i<hex.length()) {
             char character = hex.charAt((hexLength-1)); //move over charecter
             character = Character.toUpperCase(character); //either make all same charecter type or make a bunch of "or" statements
             if (character == 'A') {
                 part = 10;
                 }
                if (character == 'B') {
                part = 11;
                    } else if (character == 'C') {
                part = 12;
                    } else if (character == 'D') {
                part = 13;
                 } else if (character == 'E') {
                part = 14;
                } else if (character == 'F') {
                part = 15;

                    } else {
                 part = Character.getNumericValue(character);
                 }
              part = part * (int) Math.pow(16, x);
              dec = dec + part;
              i++;
              x++;
              hexLength--; //account for length adjusted after a charecter is evaluated
        }
System.out.println("Your number is "+ dec + " in decimal");


        }
    }