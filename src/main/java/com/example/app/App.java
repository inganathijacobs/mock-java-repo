
package com.example.app;

import com.fasterxml.jackson.databind.ObjectMapper;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, Dependency Upgrade Butler!");
        // Using Jackson just to ensure dependency is used
        ObjectMapper mapper = new ObjectMapper();
        System.out.println("Jackson ObjectMapper created: " + mapper.toString());
    }
}
