package ex_28072024;

public class Lab159 {
    public static void main(String[] args) {
        Lab159Bank bank1=new Lab159Bank();
        Lab159Bank bank2=new Lab159Bank();

        bank1.name="SBI";
        bank2.name="ICICI";

        System.out.println(bank1.name);
        System.out.println(bank2.name);
        System.out.println(bank2.balance);

        bank2.balance = 100;
        System.out.println(bank2.balance);
        System.out.println(bank1.balance);
    }
}
