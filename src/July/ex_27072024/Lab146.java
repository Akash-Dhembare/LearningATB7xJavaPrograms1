package July.ex_27072024;

import java.util.Scanner;

public class Lab146 {
    public static void main(String[] args) {
        //All the Functions are present in Stack

        Scanner sc=new Scanner(System.in);
        float marks[]=new float[5];
//
//        System.out.println("Enter Subject 1 marks: ");
//        marks[0]=sc.nextFloat();
//        System.out.println("Enter Subject 2 marks: ");
//        marks[1]=sc.nextFloat();
//        System.out.println("Enter Subject 3 marks: ");
//        marks[2]=sc.nextFloat();
//        System.out.println("Enter Subject 4 marks: ");
//        marks[3]=sc.nextFloat();
//        System.out.println("Enter Subject 5 marks: ");
//        marks[4]=sc.nextFloat();
//
//        float avg = (marks[0]+marks[1]+marks[2]+marks[3]+marks[4])/5;
//
//        System.out.println("Avg is -> "+avg);

        //Using For Loop
        float sum = 0;

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter Subject " + (i + 1) + " marks: ");
            marks[i] = sc.nextFloat();
            sum += marks[i];
        }

        float avg = sum / marks.length;
        System.out.println("Avg is -> " + avg);

        int j = 0;
        while (j < marks.length){
            System.out.println(marks[j]);
            j++;
        }

        sc.close();



    }
}
