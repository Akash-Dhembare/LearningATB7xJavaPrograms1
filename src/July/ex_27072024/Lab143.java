package July.ex_27072024;

public class Lab143 {
    public static void main(String[] args) {
        final float pi = 3.14F;

        //Disadvantages of array
        //1. Fixed Data Type (homo)
        //2. Fixed Length
        //3. Wastage of memory

        int [] ages = new int[100];
        ages[1]=99;
        ages[1]=100;
        System.out.println(ages[1]); // 0 99 000000.....
    }
}
