package August.ex_04082024.hasA.example;

public class Car {
    //Aggregation - hasA
    protected void StartTheCar(){
        new Engine().Start();
        new Tyres().rolling();
    }
}
