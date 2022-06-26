package com.syntax.class23;

public class WebDriver {
    public void startBrowser(){
        System.out.println("Strating the browser");
    }
    public void openUrl(String url){
        System.out.println("Opeaning"+url);
    }
    public void testLoginPage(){
        System.out.println("Checking if login page is visible");
    }
    public void closeBrowser(){
        System.out.println("Closing the browser");
    }

}
class Chrome extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("Opeaning Crome");
    }

    @Override
    public void openUrl(String url) {
        System.out.println("Opeaning url on "+url+" on google Chrome");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page on google Chrome");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing the Chrome");
    }
}
class FairFox extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("Starting the FireFox");
    }

    @Override
    public void openUrl(String url) {
        System.out.println("Opeaning the url"+url+" FireFox");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login on FirFox");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close the FireFox");
    }
}
class Safari extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("Starting the Safari");
    }

    @Override
    public void openUrl(String url) {
        System.out.println("Opeaning the url"+url+" Safari");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login on Safari");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close the Safari");
    }
}

class IE extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("Starting the IE");
    }

    @Override
    public void openUrl(String url) {
        System.out.println("Opeaning the url"+url+" IE");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login on IE");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close the IE");
    }
}
class Edge extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("Starting the Edge");
    }

    @Override
    public void openUrl(String url) {
        System.out.println("Opeaning the url"+url+" Edge");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login on Edge");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Close the Edge");
    }
}

