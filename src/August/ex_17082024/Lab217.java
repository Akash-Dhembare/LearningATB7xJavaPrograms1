package August.ex_17082024;

public class Lab217 {
    public static void main(String[] args) {

        try {
            int a=10/0; //Unchecked Exception
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
        }


        //Checked Exception
//        try {
//            FileReader f = new FileReader(new File("c://a.txt"));
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }

    }
}
