package homework_week_7;

import java.util.Scanner;

public class Programme_1_OddEvenTernaryOperator {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number : ");
        int number = scan.nextInt();
        isItOddOrEvenNumber(number);
        //closing the scanner object
        scan.close();
    }

    // Checking the number is even or odd
    public static void isItOddOrEvenNumber(int number) {
        //ternary operator is used

        String evenOrOdd = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("The " + number + "is " + evenOrOdd + " number");

    }
}