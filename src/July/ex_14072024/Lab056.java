package July.ex_14072024;

public class Lab056 {
    public static void main(String[] args) {
        //Type Casting - Source and Destination Conversion
        //Widening - Implicit, Explicit - lossless
        //Narrowing - Implicit, Explicit (With Data type) , loss

        // Widening
        byte b = 10;
        int a = b; //VALID - Implicit Casting - JVM
        int a1= (int)b; //Valid - Explicit Casting
        System.out.println(a1);

        //Narrowing
        int val = 300;
        //byte b1=val; //Invalid - Implicit Casting - JVM
        byte b1 = (byte)val; //VALID - Explicit Casting - Loss of data
        System.out.println(b1);
    }
}
