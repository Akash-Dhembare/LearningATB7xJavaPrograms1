package August.ex_11082024.exCar;

public class Tesla extends Engine{
    void drive(){
        openCar();
        start();
        partGearBox();
        start();
    }

    @Override
    void openCar() {
        System.out.println("Open a Tesla");
    }

    @Override
    void start() {
        System.out.println("Start a Tesla");

    }

    @Override
    void partGearBox() {
        System.out.println("Electric");

    }

    @Override
    void speed() {
        System.out.println("300Km/Hr");

    }

    @Override
    void stop() {
        System.out.println("Stopping a Tesla");

    }
}
