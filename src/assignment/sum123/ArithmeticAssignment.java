package assignment.sum123;

import java.util.Scanner;

public class ArithmeticAssignment {
public int arithmeticOperation(){
        ArithmeticAssignment arithmeticAssignment =new ArithmeticAssignment();
        int number = 0;
        int modulus;
        int temp = 0;
        int n =number;
        while(n !=0){
            modulus =n/10;
            temp +=modulus;
            n = n/10;
        }return temp;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers only abc:");
        int  enterNumber = scanner.nextInt();
        int result = 0;
        while (enterNumber > 0){
            result = result + enterNumber % 10;
            enterNumber = enterNumber /10;
            System.out.println(result);
        }


        }

    }





