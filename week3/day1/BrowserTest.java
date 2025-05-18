package week3.day1;

public class BrowserTest {

    public static void main(String[] args) {

        // Chrome object
        Chrome chrome = new Chrome();
        chrome.browserName = "Chrome";
        chrome.browserVersion = "117.0";
        chrome.openURL();
        chrome.openIncognito();
        chrome.clearCache();
        chrome.navigateBack();
        chrome.closeBrowser();

        System.out.println();

        // Edge object
        Edge edge = new Edge();
        edge.browserName = "Edge";
        edge.browserVersion = "116.0";
        edge.openURL();
        edge.takeSnap();
        edge.clearCookies();
        edge.navigateBack();
        edge.closeBrowser();

        System.out.println();

        // Safari object
        Safari safari = new Safari();
        safari.browserName = "Safari";
        safari.browserVersion = "14.1";
        safari.openURL();
        safari.readerMode();
        safari.fullScreenMode();
        safari.navigateBack();
        safari.closeBrowser();
    }
}
