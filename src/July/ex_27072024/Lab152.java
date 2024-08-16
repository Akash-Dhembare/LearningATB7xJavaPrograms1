package July.ex_27072024;

public class Lab152 {
    public static void main(String[] args) {
        //Strings - immutable in nature
        //StringBuilder, StringBuffer
        String s1 = "PRAMOD";
        s1="Dutta";

        StringBuffer stringBuffer= new StringBuffer("Pramod");
        //change the value of string - Buffer
        stringBuffer.append("Dutta"); //PramodDutta
        stringBuffer.append("JI"); //PramodDuttaJI

        StringBuilder stringBuilder= new StringBuilder("Amit");
        stringBuilder.append("Sharma"); //AmitSharma
        stringBuilder.append("JI"); //AmitSharmaJI or //AmitJISharma

        //Thread Safety?

        //stringBuilder - not safe - people LOVE it :)

    }
}
