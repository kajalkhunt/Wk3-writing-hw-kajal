package homework_week_7;

import java.util.Arrays;

/**
 * Write a Java program to calculate the average value of array
 */

public class Programme_19_AverageOfArray {

    public static void main(String[] args) {
        //Numeric array declaration
        int[] numArray = {
                1789, 2035, 1899, 2040, 1950, 2255, 7897, 1455, 787};
int sum = 0;
        //Calculating the sum od arrays value
        for (int i = 0; i < numArray.length; i++){
            sum =sum + numArray[i];
        }
        //Finding the average of arrays value
        int average = sum/ numArray.length;
        System.out.println("Values of the element sof the arrays are:  " + Arrays.toString(numArray));
        System.out.println("Average if all the values of the array are: " + average);
    }
}