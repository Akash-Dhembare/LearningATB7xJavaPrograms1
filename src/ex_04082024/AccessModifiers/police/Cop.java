package ex_04082024.AccessModifiers.police;

public class Cop {
    private int gun;
    private String idCard;

    public Cop(int gun){
        this.gun=gun;
        System.out.println(this.gun);
    }

    protected void canIShoot(){
        System.out.println("Yes, You can!!");
    }

    //protected = default - minor difference

}
