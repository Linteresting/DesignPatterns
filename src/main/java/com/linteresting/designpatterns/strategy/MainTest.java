package com.linteresting.designpatterns.strategy;

import java.util.Arrays;

public class MainTest {

    public static void main(String[] args) {
        Cat[] arr = {new Cat(5, 5), new Cat(3, 3), new Cat(1, 1)};
        Sorter<Cat> sorter = new Sorter<>();
        sorter.sort(arr, (o1, o2) -> Integer.compare(o1.weight, o2.weight));
        System.out.println(Arrays.toString(arr));
    }

}
