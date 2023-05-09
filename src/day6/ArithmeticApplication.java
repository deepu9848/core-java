package day6;

import java.util.Random;

public class ArithmeticApplication {


    public static void main(String[] args) {
        float premium = 23456.45f;
        System.out.println(Math.ceil(premium));
        System.out.println(Math.floor(premium));
        System.out.println(Math.round(premium));

        int randomNumber = (int) (Math.random()) * 74 + 1;
       boolean unique = true;
        System.out.println(randomNumber);


    }

    }

