package August.ex_24082024;

import java.util.Stack;

public class Lab237 {
    public static void main(String[] args) {
        //Vector, Stack - Legacy - 95% of the time we are not going to use it in automation
        //legacy? - old ->

        Stack s=new Stack<>();
        s.push("Pramod");
        s.push("Dutta");
        s.push("Amit");
        s.add("Amit2");
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s);
    }
}
