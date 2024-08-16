package August.ex_10082024.Polymorphism.MethodOverRiding;

public class Hound extends Dog{
    @Override
    void bark(){
        System.out.println("I am Hound, I will Bark");
    }

    void bike(){
        System.out.println("Biked");
    }
}
