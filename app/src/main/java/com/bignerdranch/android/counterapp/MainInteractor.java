package com.bignerdranch.android.counterapp;

public class MainInteractor {

    private final int MAX_COUNTER = 20;
    private final int MIN_COUNTER = 0;

    private MainRepository repository = new MainRepository();

    public boolean isNeedToShowSnackbar(int counter) {
        return counter >= MAX_COUNTER;
    }

    public boolean isNeedToShowToast(int counter) {
        return counter <= MIN_COUNTER;
    }

    public int getPlusCounter() {
        return repository.getPlusCounter();
    }

    public int getMinusCounter() {
        return repository.getMinusCounter();
    }

    public int resetCounter() {
        return repository.resetCounter();
    }

    public int getCurrentCounter() {
        return repository.getCurrentCounter();
    }
}
