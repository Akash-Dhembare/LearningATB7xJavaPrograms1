package August.ex_11082024.RealLIFEex;

public class CHROME extends BaseClass{
    @Override
    String openBrowser(String browser) {
        System.out.println("Open the Chrome.....// This is code related to chrome only");
        return browser;
    }

    @Override
    String closeBrowser(String browser) {
        System.out.println("Close the Chrome.....// This is code related to chrome only");
        return "";
    }
}
