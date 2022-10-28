package homework_week_7;

public class Programme_11_DivideByThreeAndFive {

    public static void main(String[] args) {
        System.out.println("Numbers divisible by 3 are: ");
        for(int i = 1; i <= 100;i++){
            divideByThree(i);
        }
        System.out.println("\n----------------------------------------------------------------------------------------------------");
        System.out.println("Number divisible by 5 are : ");
        for (int x = 1; x <=100; x++){
            divideByFive(x);
        }
    }
    // Divided By Three method
    public static void divideByThree(int number){
        if (number % 3 == 0){
            System.out.println(number + ",");
        }
    }
    //Divide by Five method
    public static void divideByFive(int number){
        if (number % 5 == 0){
            System.out.println(number + ", ");
        }
    }
}
