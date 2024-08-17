package August.ex_11082024.exCar;

public class WagonR extends Engine{
    void drive(){
        openCar();
        start();
        partGearBox();
        speed();
        stop();
    }

    @Override
    void openCar() {
        System.out.println("Open WagonR");
    }

    @Override
    void start() {
        System.out.println("Start WagonR");

    }

    @Override
    void partGearBox() {
        System.out.println("Manual WagonR");

    }

    @Override
    void speed() {
        System.out.println("180Km/Hr");

    }

    @Override
    void stop() {
        System.out.println("Stop WagonR");

    }
}
