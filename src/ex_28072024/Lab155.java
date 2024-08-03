package ex_28072024;

public class Lab155 {
    public static void main(String[] args) {

        //Class - Attribute / properties - data Types - primitive or non primitive.
        //Class - Behaviour / Methods - functions -

        //object - real entity - class -
        //ClassName classRef = new ClassName();


        //new ClassName(); - Object
        //classRef - Class Ref
        //ClassName - Class Name which blueprint you are using

        Lab155BuildingBP dlf=new Lab155BuildingBP();
        dlf.name="DLF PVT LTD Builder";
        dlf.noOfRooms=100;

        dlf.useLift();

        Lab155BuildingBP prestige=new Lab155BuildingBP();
        prestige.name="Prestige PVT LTD Builder";
        prestige.noOfRooms=100;

        prestige.useLift();
    }
}
