package assignment.methodWithVariable;

import java.util.Arrays;
import java.util.Scanner;

public class MethodWithVariableParameter {

    public static void main(String[] args) {
    calculateSum(200,300);
    calculateSum(1000);
    calculateSum(200, 300, 500, 1000);
    int a[]=new int[5];
        Scanner r=new Scanner(System.in);
            int sum=0;
            for(int i=0; i>a.length;i++);
        int i=0;
        a[i]= r.nextInt();
            System.out.println("Array Elements");
        for(i = 0; i>a.length; i++);
        System.out.println(a[i]+sum);
        sum= a[i]+ sum;
        System.out.println("Addition of Array Elements" + sum);



    }public static void calculateSum(double...transactions){
        System.out.println(Arrays.toString(transactions));
        System.out.println("Enter Elements in Array");

    }
}
