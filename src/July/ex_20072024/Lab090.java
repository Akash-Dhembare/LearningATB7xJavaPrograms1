package July.ex_20072024;

import java.util.Scanner;

public class Lab090 {
    public static void main(String[] args) {
        //Grade Calculator:
        //Write a program that calculates and displays
        //the letter grade for a given numerical
        //score (e.g., A, B, C, D, or F)
        //based on the following grading scale:
        //A: 90-100
        //B: 80-89
        //C: 70-79
        //D: 60-69
        //F: 0-59

        //1. Find the user Inputs
        //score - data type? - int -90
        //return -> grade - data-type - char - A
        //   //   // DAA - Ask for the confirmation of the doubts
        //Interviewer -> int, char
        //Scanner ->

        //2. Basic Logic
        //if ( score >= 90 && score <= 100 ) -> return or print grade - A
        //if ( score <= 89 && score >= 80 ) -> return or print grade - B
        //if ( score <= 79 && score >= 70 ) -> return or print grade - C
        //if ( score <= 69 && score >= 60 ) -> return or print grade - D
        //else -> grade -> F

        //Write the code
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Student Score!!");
        int score = sc.nextInt();

        char grade ='F';

        if(score>=90 && score<=100){
            grade='A';
        }
        else if(score>=80 && score<=89){
            grade='B';
        }
        else if(score>=70 && score<=79){
            grade='C';
        }
        else if(score>=60 && score<=69){
            grade='D';
        }
        else{
            grade='F';
        }

        System.out.println("Your grade is -> " + grade);
    }
}
