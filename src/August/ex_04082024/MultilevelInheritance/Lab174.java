package August.ex_04082024.MultilevelInheritance;

public class Lab174 {
    public static void main(String[] args) {
        Child c=new Child();
        c.home(); // If all classes have same function name then
        //Priority will be given to Child then Father then Grandfather
        c.GF();
        c.F();
        c.C();
    }
}
