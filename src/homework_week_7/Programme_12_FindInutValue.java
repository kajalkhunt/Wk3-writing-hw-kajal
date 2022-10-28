package homework_week_7;

import java.util.Scanner;

public class Programme_12_FindInutValue {

    public static void main(String[] args) {
//Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any character : ");
        char ch = scanner.next().charAt(0);
        //Object creation
        Programme_12_FindInutValue inputValue = new Programme_12_FindInutValue();
        inputValue.checkInputIsAlphbetNumberOrSymbol(ch);
        //Closing the scanner object
        scanner.close();

    }
    public void checkInputIsAlphbetNumberOrSymbol(char ch){
        if ((ch>= 'a' && ch <= 'z') || (ch>= 'A' && ch <= 'z')) {
            System.out.println(ch + "is an ALPHABET. ");
        }else if ((ch >= '0' && ch <= '9')) {
            System.out.println(ch + " is a DIGIT. ");
    }else {
            System.out.println(ch + " is a SYMBOL");
        }
}
}
