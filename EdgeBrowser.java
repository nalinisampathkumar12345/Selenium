package week1.day1;

public class EdgeBrowser {

    public static void main(String[] args) {
        Browser browser = new Browser();
        String name = browser.launchBrowser("Edge");
        System.out.println("Launched Browser: " + name);
        browser.loadUrl();
    }
}