package August.ex_04082024.AccessModifiers.police;

public class NewPolice {
    private String name;
    private  int id;
    //Instance should be well protected

    protected void Talk(){
        //only class withing the same package can see us
    }

    private void Documents(){
        //No one can see us
    }

}
