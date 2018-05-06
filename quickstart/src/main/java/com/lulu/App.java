package com.lulu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 */
public class App {

    public App() {
    }

    public static void main(String[] args) {


        ArrayList<String> list =
                new ArrayList<>();
        list.add("11");

        Map<String, String> map = new HashMap<>();


    }

    public void hello() {
        System.out.println("hello");


    }

    public void hello(TestService ts) {
        System.out.println("hello");
        ts.xxoo();


    }
}
