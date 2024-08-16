package July.ex_27072024;

import java.util.Arrays;

public class HomeWork1 {
    public static void main(String[] args) {

        //How to Find the Second Highest Salary in the Array?
        int[] salaries = {7, 10, 4, 13, 25, 18, 9, 8, 17};

        int max=salaries[0];

        for (int i = 0; i < salaries.length; i++) {
            if(salaries[i]>max){
                max=salaries[i];
            }
        }
        System.out.println("Maximum salary is -> "+max);
        Arrays.sort(salaries);
        int second_highest_salary=salaries[salaries.length-2];
        System.out.println("Second Highest Salary is -> "+ second_highest_salary);

    }
}
