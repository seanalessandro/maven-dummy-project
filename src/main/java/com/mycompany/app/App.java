package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{
    //Testing Web-Hooks
    private final String message = "Hello dirty World!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
