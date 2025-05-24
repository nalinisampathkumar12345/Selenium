package week3.day1;


public class Browser {

    String browserName;
    String browserVersion;

    public void openURL() {
        System.out.println(browserName + " v" + browserVersion + " - Opening URL...");
    }

    public void closeBrowser() {
        System.out.println(browserName + " v" + browserVersion + " - Closing the browser.");
    }

    public void navigateBack() {
        System.out.println(browserName + " v" + browserVersion + " - Navigating back.");
    }
}
