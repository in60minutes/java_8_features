package com.in60minutes.streams;

import java.util.Arrays;
import java.util.List;

public class Sample01 {
    public static void main(String[] args) {

        List<String> names =Arrays.asList("Raju","Harsha");
        names.stream().forEach(System.out::println);
    }
}
