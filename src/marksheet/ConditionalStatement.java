package marksheet;

import java.util.Scanner;

public class ConditionalStatement {

    public static void main(String[] args) {
        System.out.println("1");
        System.out.println("2");
        if (true) {
            System.out.println("3");
            System.out.println("4");
        }

        System.out.println("5");
        Scanner sc = new Scanner(System.in);
        String weekDay = sc.next();
        weekDay = weekDay. toLowerCase();
        switch (weekDay) {
            case "sunday":
                System.out.println("salad");
                break;
            case "monday":
                System.out.println("rice");
                break;
            case "tuesday":
                System.out.println("corn");
                break;
            case "wednesday":
                System.out.println("fruit");
                break;
            case "thursday":
                System.out.println("noodles");
                break;
            case "friday":
                System.out.println("pasta");
                break;
            case "saturday":
                System.out.println("vegetable");
                break;
            default:
                break;
        }
    }
}