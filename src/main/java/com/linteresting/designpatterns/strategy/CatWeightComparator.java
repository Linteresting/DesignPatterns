package com.linteresting.designpatterns.strategy;

public class CatWeightComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        return Integer.compare(o1.weight, o2.weight);
    }
}
