package com.linteresting.designpatterns.strategy;

public class Cat implements Comparable<Cat> {

    int height;
    int weight;

    public Cat(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Cat o) {
        return Integer.compare(this.height, o.height);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "height=" + height +
                ", weight=" + weight +
                '}';
    }
}
