package July.ex_27072024;

public class Lab138 {
    public static void main(String[] args) {
        int[] marks_10_boards = {90, 91, 95, 99, 100, 78};
        //elements are fixed
        //len -> 6
        //who index - 3 -> 99
        System.out.println(marks_10_boards.length);
        System.out.println(marks_10_boards[3]);
        System.out.println(marks_10_boards[0]);
        System.out.println(marks_10_boards[-1]); //ArrayIndexOutOfBoundsException
        //System.out.println(marks_10_boards[10]); ArrayIndexOutOfBoundsException
    }
}
