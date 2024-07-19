package ex_13072024;

public class Lab035 {
    public static void main(String[] args) {
        //Escape chars
        char c = '\n'; //New line / Next Line
        char c1 = '\t'; //Add Tab
        char c2 ='\b'; //Backlash, delete 1 char
        char c3 = '\r'; // Backlash , delete 1 word

        System.out.println("Akash" + c3 + "Dhembare");
        System.out.println("Akash" + c2 + "Dhembare");
        System.out.println("Akash" + c1 + "Dhembare");
        System.out.println("Akash" + c + "Dhembare");
    }
}
