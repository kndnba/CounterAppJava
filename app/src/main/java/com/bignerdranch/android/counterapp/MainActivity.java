package com.bignerdranch.android.counterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements MainView {
    private TextView counterText;
    private Button resetButton;

    private MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new MainPresenter(this);

        counterText = findViewById(R.id.counterText);
        resetButton = findViewById(R.id.resetButton);

        findViewById(R.id.plusButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.onPlusClicked();
            }
        });

        findViewById(R.id.minusButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.onMinusClicked();
            }
        });

        findViewById(R.id.resetButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.onResetClicked();
            }
        });
    }

    @Override
    public void updateCounter(int counter) {
        counterText.setText(String.valueOf(counter));
    }

    @Override
    public void showToast(String text) {
        Toast.makeText(this, text, Toast.LENGTH_LONG).show();
    }

    @Override
    public void showSnackbar(String text) {
        Snackbar.make(resetButton, text, Snackbar.LENGTH_LONG).show();
    }
}