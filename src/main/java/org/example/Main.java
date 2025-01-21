package org.example;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Optional<String> value =  Optional.empty();
        System.out.println(value.isEmpty());

    }

}