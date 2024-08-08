package ex_04082024.SingleInheritance;

public class Lab172 {
    public static void main(String[] args) {
        Son s=new Son();
        s.bhk2();
        s.bhk3();

        Father f=new Father();
        f.bhk2();
       // f.bhk3(); //Not Possible
    }
}
