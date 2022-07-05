package com.syntax.class26;

public class HW1cl25As {
    //
}
interface WebDriver2{
    void openBrowser();
    void closeBrowser();
    void maximizeBrowser();
    void findElement();

}
class ChromeDriver2 implements WebDriver2{

    @Override
    public void openBrowser() {
        System.out.println("Open the chrome");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close the browser");
    }

    @Override
    public void maximizeBrowser() {
        System.out.println("Maximize the browser");
    }

    @Override
    public void findElement() {
        System.out.println("Find the element");
    }
}
class FireFox implements WebDriver2{

    @Override
    public void openBrowser() {
        System.out.println("Open the FireFox");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close the browser");
    }

    @Override
    public void maximizeBrowser() {
        System.out.println("Maximize the browser");
    }

    @Override
    public void findElement() {
        System.out.println("Find the element");
    }
}

