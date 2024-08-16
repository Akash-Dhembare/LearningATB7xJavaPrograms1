package August.ex_04082024.SingleInheritance.real;

public class TestCase2 extends BaseTest{
    void testCase2(){
        startBrowser(); //Base Test
        getDataFromSQL(); //Grand BaseTest
        System.out.println(gold); //Grand BaseTest
        //Here we will write the TC
        closeBrowser();
    }

    public static void main(String[] args) {
        TestCase2 tc2=new TestCase2();
        tc2.testCase2();
        //or
        new TestCase2().testCase2();
    }

}
