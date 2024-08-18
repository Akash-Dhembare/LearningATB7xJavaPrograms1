package August.ex_17082024;

public enum COLORS {
    RED("#ff0000"),
    GREEN("#f0dd0d"),
    BLUE("#f0fd0d0d");

    private final String hexValue;

    COLORS(String hexValue){
        this.hexValue=hexValue;
    }

    public String getValue(){
        return hexValue;
    }
}
