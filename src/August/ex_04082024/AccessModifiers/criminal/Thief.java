package August.ex_04082024.AccessModifiers.criminal;

import August.ex_04082024.AccessModifiers.police.Cop;

public class Thief {
    public static void main(String[] args) {
        Cop c=new Cop(100);
//        System.out.println(c.gun); Can not use
//        c.canIShoot(); Can not use
    }
}
