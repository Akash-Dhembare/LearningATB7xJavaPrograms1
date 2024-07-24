package ex_21072024;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        //Leap Year Program
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a year to check if its a leap year or not");
        int year=sc.nextInt();

        if(year%400==0 || year%4==0)
        {
            System.out.println("Its a leap year");
        }
        else{
            System.out.println("Its not a leap year");
        }
    }
}
