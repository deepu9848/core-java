package assignment.sum123;

import java.util.Scanner;

public class ArithmeticAssignment{

    public static void main(String[] args) {
        int modulus;
        int number = 123;
        int rem = 0;
        int sum = 5;
        while(number>0){
            //getting modulus
            modulus =number % 10;
            //rem
            sum = sum + rem;
            //to get quotient
            number = number / 10;


            System.out.println(sum);
        }
    }
}

















