package marksheet;

import java.util.Scanner;

public class StudentResult {
String name;
int age;

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("please provide your name:");
        String name = sc.nextLine();
        System.out.println("please provide your age:");
        int age = sc.nextInt();
        System.out.println("please provide your gender (Male/Female/Others):");
        String gender =sc.next();


        System.out.println(name);
        System.out.println(age);
        System.out.println(Gender.valueOf(gender.toUpperCase()));

    Student student =new Student(name,  age, Gender.valueOf(gender.toUpperCase()));
    System.out.println("Welcome" + student.getName() + "****");
    System.out.println("Please provide marks on subjects below");

        System.out.println("Please provide marks for Maths:");
        float maths = sc.nextFloat();
        System.out.println("Please provide marks for English:");
        float english = sc.nextFloat();
        System.out.println("Please provide marks for Computer:");
        float computer = sc.nextFloat();
        System.out.println("Please provide marks for Science:");
        float science = sc.nextFloat();
        System.out.println("Please provide marks for Social:");
        float social = sc.nextFloat();
        sc.close();
        float total = maths + english + computer + science + social;
        float percentage = (total/500)*100;
        System.out.println("percentage :" + percentage);

        String output = String. format("the percentage of %s %.2f", name, percentage);
        System.out.println(output);
         if (percentage<40){
            System.out.println("Filed");
        }else if (percentage>=40 && percentage<60){
            System.out.println("Third Div");
        }else if (percentage>=60 && percentage<70){
            System.out.println("Second Div");
        }else if (percentage>=70 && percentage<80){
            System.out.println("First Div");
        }else if (percentage>=80 && percentage<100){
            System.out.println("Distinction");
        }else  {
            System.out.println("Invalid Data");
        }



    }
}
