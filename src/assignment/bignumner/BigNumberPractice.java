package assignment.bignumner;

import java.math.BigInteger;

public class BigNumberPractice {

    public static void main(String[] args) {
        long l = 1223458678;
        BigInteger bigInteger = new BigInteger("1223458678122333");
        BigInteger sum = bigInteger.multiply(BigInteger.valueOf(2));
        System.out.println(sum);

        System.out.println(bigInteger.signum());
        if (bigInteger.signum() == -1) {

            System.out.println("Negative");
        } else if (bigInteger.signum() == 1) {
            System.out.println("positive");
        } else {
            System.out.println("Zero");

        }
    }//You are provided with a number N integer, calculate the N^11.

    int N = 345566778;
    BigInteger bigInteger = new BigInteger("N");
    BigInteger pow = bigInteger.pow(BigInteger.valueOf(11));{
        System.out.println(pow);
}

}