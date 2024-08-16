package August.ex_10082024.Polymorphism.MethodOverLoading;

public class MathOperations {
    //Encapsulation
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Method Overloading
    //Compile Time
    //Same Method Name but Different Parameters
    int add(int a , int b){
        return a + b;

    }
    void add(int a , int b , int c){
        System.out.println("Hello");

    }

    double add(double a, double b){
        return a+b;
    }

    double add(double a, double b, float c){
        return a+b+c;
    }

    String add(String a, String b){
        return a+b;
    }

    String add(String a, int b){
        return a+b;
    }

    String add(int b, String a){
        return a+b;
    }

    MathOperations(){

    }
    MathOperations(int a){

    }
    MathOperations(int a , int b){

    }
    MathOperations(int a , int b, int c){

    }
    MathOperations(int a , int b, int c, String d){

    }



}
