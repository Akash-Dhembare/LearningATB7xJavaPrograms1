package July.ex_27072024;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the height of pyramid");
        int height=sc.nextInt();

        for (int i = height; i >0 ; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
