package com.bignerdranch.android.counterapp;

public class MainPresenter {

    private MainInteractor interactor = new MainInteractor();

    private MainView view;
    private int currentCounter = 0;


    public MainPresenter(MainView view) {
        this.view = view;
    }
    public void onPlusClicked() {
        currentCounter = interactor.getCurrentCounter();
        if (interactor.isNeedToShowSnackbar(currentCounter)) {
            view.showSnackbar("too much");
        } else {
            currentCounter = interactor.getPlusCounter();
            view.updateCounter(currentCounter);
        }
    }

    public void onMinusClicked() {
        currentCounter = interactor.getCurrentCounter();
        if (interactor.isNeedToShowToast(currentCounter)) {
            view.showToast("cant be below zero");
        } else {
            currentCounter = interactor.getMinusCounter();
            view.updateCounter(currentCounter);
        }
    }

    public void onResetClicked() {
        currentCounter = interactor.resetCounter();
        view.updateCounter(currentCounter);
    }
}
