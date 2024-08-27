package August.ex_24082024;

public class Lab249 {
    public static void main(String[] args) {
        temp("Prmaod");
        temp(123);
        temp(true);

        sum(3,4);
        sum("pramod","dutta");

        //T - Ref to the Data Type that you want to use.


    }

    public static <T> T sum (T a, T b){
        System.out.println(a);
        System.out.println(b);
        return null;
    }

    public static <T> void temp(T name){
        System.out.println(name);
    }
}


