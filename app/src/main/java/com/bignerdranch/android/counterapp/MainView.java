package com.bignerdranch.android.counterapp;

public interface MainView {
    void updateCounter(int counter);
    void showToast(String text);
    void showSnackbar(String text);
}
