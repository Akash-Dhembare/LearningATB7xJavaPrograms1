package July.ex_14072024;

public class Lab067 {
    public static void main(String[] args) {
        String name = "Akash";
        //String? - Bunch of characters - Collection of characters
        //class?
        String name2 = new String("Akash");
        //How many ways we can define a String - 2
        //=, new operator
        //="SCP" //String Constant Pool
        //new - Objects(heap)

        System.out.println(name.toLowerCase());
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.charAt(3));
        System.out.println(name.charAt(0));
        //System.out.println(name.charAt(10)); //Exception Index 10 out of bounds
    }
}
