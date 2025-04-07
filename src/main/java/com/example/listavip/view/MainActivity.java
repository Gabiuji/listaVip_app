package com.example.listavip.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.listavip.R;
import com.example.listavip.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();

    }
}