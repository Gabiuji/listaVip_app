package com.example.listavip.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

import com.example.listavip.R;
import com.example.listavip.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;

    public EditText editPrimeiroNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();

        pessoa.setPrimeiroNome();

        Log.i("POO informações", pessoa.toString()); //É mostrado no Logcat quais informações foram inseridas na classe Pessoa

    }
}