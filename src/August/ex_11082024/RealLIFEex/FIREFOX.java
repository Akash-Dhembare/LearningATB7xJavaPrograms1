package August.ex_11082024.RealLIFEex;

public class FIREFOX extends BaseClass{
    @Override
    String openBrowser(String browser) {
        System.out.println("Open the FireFox.....// This is code related to FIREFOX only");
        return browser;
    }

    @Override
    String closeBrowser(String browser) {
        System.out.println("Close the FireFox.....// This is code related to FIREFOX only");
        return "";
    }
}
