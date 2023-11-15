package org.example;

import java.util.List;
import java.util.stream.Stream;

public class Lab {

    public final int cardNumber = 1130;

    private final int C11 = cardNumber % 11; // 8

    public void calc() throws Exception {
        Furniture[] arr = {
                new Furniture("1", 2, 3, 4, 5, "Wow"),
                new Furniture("6", 7, 8, 9, 10, "Cringe"),
                new Furniture("11", 12, 13, 14, 15, "Poh")
        };

        List<Furniture> one = Stream.of(arr).sorted((a, b) -> (int) (a.depth - b.depth)).toList();
        List<Furniture> two = Stream.of(arr).sorted((a, b) -> (int) (b.height - a.height)).toList();
    }
}
