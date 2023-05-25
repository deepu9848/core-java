package assignment.looping;

import java.util.Scanner;

public class Loop {

    public static void main(String[] args) {
        //while loop for sum of numbers from 0 to 5
        Scanner sc = new Scanner(System.in);
        {
            int i = 0;
            int sum = 0;
            while (i < 5) {
                sum = sum + 1;
                System.out.println(i);
                i++;
            }
        }
        //ddo while loop for sum of numbers from 0 to 5
        int i = 0;
        int sum = 0;
        do {
            System.out.println(i);
            i++;
        }
        while (i < 5);
    }

    //for loop statement for sum of numbers from 1 to 5
    {
        for (int i = 0; i < 5; i++) {
        }

    }

    {
        //N > 1 and N < 100000
//        Given N value, Create a string that contains the odd number of character. Example
//        if N = 3 then the string should be dog, if N = 4 ball(X), mice.
//
//        if N is odd
//
//Just repeat a N number of time
//      if N is even
//Repeat a for N-1 times and append single b
//    Note : Repeation of string should be done in proper way so that it won't consume
//    alot of memory.
//    N = 5 => aaaaa
//    B = 6 => aaaaab

        int N = 6;
        String output = "";
        if (N % 2 == 0) {
           // for (int i = 1; i <= N - 1; i++) {
                output += "a";
                output = "a".repeat(N-1);
            System.out.println(output);
            output += "b";
        } else {
           // for (int i = 1; i <= N; i++) {
              //  output += "a";
                output = "a". repeat(N);
            }System.out.println(output);
        }

        }
