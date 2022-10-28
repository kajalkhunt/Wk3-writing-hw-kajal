package homework_week_7;

import java.util.Scanner;

public class Programme_10_DoOperationWithSymbol {
    public static void main(String[] args) {
//Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int x = scanner.nextInt();
        System.out.println("Enter second number : ");
        int y = scanner.nextInt();
        System.out.println("Please select the calculation symbol =,-,*,/ : ");
        char symbol = scanner.next().charAt(0);
        doOperationBySelectingSymbol(x, y, symbol);
        //closing the scanner object
        scanner.close();

    }
public static void doOperationBySelectingSymbol(int x, int y, char symbol){
        if (symbol == '+'){
            System.out.println(x + " + " + y + " = " + (x + y));
        }else if (symbol == '-'){
            System.out.println(x + " - " + y + " = " + (x - y));
        }else if (symbol =='*'){
            System.out.println(x + " * " + y + " = " + (x * y));
        }else if (symbol =='/'){
            System.out.println(x + " /" + y +  " = " + (x / y));
        }else{
            System.out.println("Please enter correct symbol +,-,*,/");
        }
}
 }
