package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, Integer> stringMap= new HashMap<>();
        stringMap.put("First", 15);
        stringMap.put("Second", 35);

        System.out.println( stringMap.get("First") );
    }
}
