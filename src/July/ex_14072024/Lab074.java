package July.ex_14072024;

public class Lab074 {
    public static void main(String[] args) {
        String name = "The Testing Academy"; //SCP
        String name1 = "The Testing Academy"; //SCP
        String name2 = new String("The Testing Academy"); //Heap Area (OA)

        System.out.println(name==name1); //Check for the ref
        System.out.println(name.equals(name1)); //Check for the content

        System.out.println(name1==name2); //Check for the reference
        System.out.println(name1.equals(name2)); //Check for the content
    }
}
