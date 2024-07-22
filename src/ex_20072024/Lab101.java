package ex_20072024;

import java.util.Scanner;

public class Lab101 {
    public static void main(String[] args) {
        //Write a program name, age, salary - print it
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.next();

        System.out.println("Enter your age:");
        int age=sc.nextInt();

        System.out.println("Enter your salary:");
        double salary = sc.nextDouble();

        System.out.println("Your Details are: "+name);
        System.out.println("Your Age is: "+age);
        System.out.println("Your Salary is: "+salary);

        sc.close();

    }
}
