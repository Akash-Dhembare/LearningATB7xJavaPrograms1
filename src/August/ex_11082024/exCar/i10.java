package August.ex_11082024.exCar;

public class i10 extends Engine{
    void drive(){
        openCar();
        start();
        partGearBox();
        speed();
        stop();
    }

    @Override
    void openCar() {
        System.out.println("Open i10");
    }

    @Override
    void start() {
        System.out.println("Start i10");

    }

    @Override
    void partGearBox() {
        System.out.println("Automatic i10");

    }

    @Override
    void speed() {
        System.out.println("240Km/Hr");

    }

    @Override
    void stop() {
        System.out.println("Stop i10");

    }
}
