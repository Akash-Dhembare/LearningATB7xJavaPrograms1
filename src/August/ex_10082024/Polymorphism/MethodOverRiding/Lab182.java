package August.ex_10082024.Polymorphism.MethodOverRiding;

public class Lab182 {
    //Method Overriding | Runtime Polymorphism
    public static void main(String[] args) {
        Hound h1=new Hound();
        h1.bark();
        h1.bike();

        Dog d1=new Dog();
        d1.bark();

        Dog dog_Ref=new Hound();
        dog_Ref.bark(); //Overridden Functions
        //dog_Ref.bike();

        //Hound h2=new Dog();
    }
}
