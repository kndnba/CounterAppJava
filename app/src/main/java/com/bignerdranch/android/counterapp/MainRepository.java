package com.bignerdranch.android.counterapp;

public class MainRepository {

    private int counter = 0;

    public int getPlusCounter() {
        counter++;
        return counter;
    }

    public int getMinusCounter() {
        counter--;
        return counter;
    }

    public int resetCounter() {
        counter = 0;
        return counter;
    }

    public int getCurrentCounter() {
        return counter;
    }
}
