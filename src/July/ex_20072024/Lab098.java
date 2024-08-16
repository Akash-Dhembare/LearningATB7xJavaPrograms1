package July.ex_20072024;

public class Lab098 {
    public static void main(String[] args) {
        //JDK > 13

        int itemcode = 001;

        switch(itemcode){
            case 001 -> System.out.println("Its is a laptop");
            case 002 -> System.out.println("Its its a desktop");
            case 003, 004 -> System.out.println("It is a mobile");
            default -> System.out.println("Hello");

        }
    }
}
