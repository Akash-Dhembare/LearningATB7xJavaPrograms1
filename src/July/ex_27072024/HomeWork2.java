package July.ex_27072024;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the height of pyramid : ");
        int height=sc.nextInt();

        for (int i = 0; i <height ; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
        sc.close();
    }
}
