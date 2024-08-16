package August.ex_10082024.Polymorphism.superthiskeyword;

public class Lab184 {
}

class Person{
    void message(){
        System.out.println("I am person message");
    }
}

class Student extends Person{
    // is A relation - inheritance
    @Override
    void message(){
        System.out.println("I am Student message");
    }

    void display(){
        super.message();
    }
}
