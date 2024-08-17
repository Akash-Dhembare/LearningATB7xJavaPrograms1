package August.ex_11082024.ex_interface.ex3;


interface Eng{
    void start();
    default void m1(){
        System.out.println("Old M1");
    }

    default void suite(){
        System.out.println("wear suite");
    }
}

interface GearBox extends Eng{
    void gear();
}

interface Keys extends GearBox{
    void openCar();
}

class Car implements Keys{
    @Override
    public void start() {

    }

    @Override
    public void gear() {

    }

    @Override
    public void openCar() {

    }
}
public class Lab192 {
    public static void main(String[] args) {
        Car c=new Car();
        c.start();
        c.m1();

    }
}
