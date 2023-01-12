package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.provider.ContactsContract;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickBtn(View view){
        TextView nume = findViewById(R.id.textView);
        EditText numeBox = findViewById(R.id.nume);
        nume.setText("Nume:"+ numeBox.getText().toString());

         TextView prenume = findViewById(R.id.textView2);
        EditText prenumeBox = findViewById(R.id.prenume);
        prenume.setText("Prenume:"+ prenumeBox.getText().toString());

        TextView email = findViewById(R.id.textView3);
            EditText emailBox = findViewById(R.id.email);
            email.setText("E-mail:"+ emailBox.getText().toString());
    }
}