package com.example.tictaktou4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    private int licznik = 0;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Tost♥", Toast.LENGTH_SHORT).show();
        btn1=(Button) findViewById(R.id.btn1);
        btn2=(Button) findViewById(R.id.btn2);
        btn3=(Button) findViewById(R.id.btn3);
        btn4=(Button) findViewById(R.id.btn4);
        btn5=(Button) findViewById(R.id.btn5);
        btn6=(Button) findViewById(R.id.btn6);
        btn7=(Button) findViewById(R.id.btn7);
        btn8=(Button) findViewById(R.id.btn8);
        btn9=(Button) findViewById(R.id.btn9);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (licznik % 2 == 1) {
                    btn1.setText("O");
                }
                else{
                    btn1.setText("X");
                }
                licznik++;
                btn1.setEnabled(false);
                sprawdzCzyKoniec();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (licznik % 2 == 1) {
                    btn2.setText("O");
                }
                else{
                    btn2.setText("X");
                }
                licznik++;
                btn2.setEnabled(false);
                sprawdzCzyKoniec();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (licznik % 2 == 1) {
                    btn3.setText("O");
                }
                else{
                    btn3.setText("X");
                }
                licznik++;
                btn3.setEnabled(false);
                sprawdzCzyKoniec();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (licznik % 2 == 1) {
                    btn4.setText("O");
                }
                else{
                    btn4.setText("X");
                }
                licznik++;
                btn4.setEnabled(false);
                sprawdzCzyKoniec();
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (licznik % 2 == 1) {
                    btn5.setText("O");
                }
                else{
                    btn5.setText("X");
                }
                licznik++;
                btn5.setEnabled(false);
                sprawdzCzyKoniec();
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (licznik % 2 == 1) {
                    btn6.setText("O");
                }
                else{
                    btn6.setText("X");
                }
                licznik++;
                btn6.setEnabled(false);
                sprawdzCzyKoniec();
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (licznik % 2 == 1) {
                    btn7.setText("O");
                }
                else{
                    btn7.setText("X");
                }
                licznik++;
                btn7.setEnabled(false);
                sprawdzCzyKoniec();
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (licznik % 2 == 1) {
                    btn8.setText("O");
                }
                else{
                    btn8.setText("X");
                }
                licznik++;
                btn8.setEnabled(false);
                sprawdzCzyKoniec();

            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (licznik % 2 == 1) {
                    btn9.setText("O");
                }
                else{
                    btn9.setText("X");
                }
                btn9.setEnabled(false);
                licznik++;
                sprawdzCzyKoniec();
            }
        });
    }

    private void sprawdzCzyKoniec() {
        if(btn1.getText().equals("O") && btn2.getText().equals("O") && btn3.getText().equals("O") || btn4.getText().equals("O") && btn5.getText().equals("O") && btn6.getText().equals("O") || btn7.getText().equals("O") && btn8.getText().equals("O") && btn9.getText().equals("O") ||
                btn1.getText().equals("O") && btn5.getText().equals("O") && btn9.getText().equals("O") || btn3.getText().equals("O") && btn5.getText().equals("O") && btn7.getText().equals("O") ||
                btn1.getText().equals("O") && btn4.getText().equals("O") && btn7.getText().equals("O") || btn2.getText().equals("O") && btn5.getText().equals("O") && btn8.getText().equals("O") || btn3.getText().equals("O") && btn6.getText().equals("O") && btn9.getText().equals("O")){
            btn1.setEnabled(true);
            btn2.setEnabled(true);
            btn3.setEnabled(true);
            btn4.setEnabled(true);
            btn5.setEnabled(true);
            btn6.setEnabled(true);
            btn7.setEnabled(true);
            btn8.setEnabled(true);
            btn9.setEnabled(true);
            btn1.setText("");
            btn2.setText("");
            btn3.setText("");
            btn4.setText("");
            btn5.setText("");
            btn6.setText("");
            btn7.setText("");
            btn8.setText("");
            btn9.setText("");
            licznik = 0;
            Toast.makeText(this, "Wygrywają O", Toast.LENGTH_SHORT).show();
        }
        else if(btn1.getText().equals("X") && btn2.getText().equals("X") && btn3.getText().equals("X") || btn4.getText().equals("X") && btn5.getText().equals("X") && btn6.getText().equals("X") || btn7.getText().equals("X") && btn8.getText().equals("X") && btn9.getText().equals("X") ||
                btn1.getText().equals("X") && btn5.getText().equals("X") && btn9.getText().equals("X") || btn3.getText().equals("X") && btn5.getText().equals("X") && btn7.getText().equals("X") ||
                btn1.getText().equals("X") && btn4.getText().equals("X") && btn7.getText().equals("X") || btn2.getText().equals("X") && btn5.getText().equals("X") && btn8.getText().equals("X") || btn3.getText().equals("X") && btn6.getText().equals("X") && btn9.getText().equals("X")){
            btn1.setEnabled(true);
            btn2.setEnabled(true);
            btn3.setEnabled(true);
            btn4.setEnabled(true);
            btn5.setEnabled(true);
            btn6.setEnabled(true);
            btn7.setEnabled(true);
            btn8.setEnabled(true);
            btn9.setEnabled(true);
            btn1.setText("");
            btn2.setText("");
            btn3.setText("");
            btn4.setText("");
            btn5.setText("");
            btn6.setText("");
            btn7.setText("");
            btn8.setText("");
            btn9.setText("");
            licznik = 0;
            Toast.makeText(this, "Wygrywają X", Toast.LENGTH_SHORT).show();
        }
        else if (licznik ==9) {
            btn1.setEnabled(true);
            btn2.setEnabled(true);
            btn3.setEnabled(true);
            btn4.setEnabled(true);
            btn5.setEnabled(true);
            btn6.setEnabled(true);
            btn7.setEnabled(true);
            btn8.setEnabled(true);
            btn9.setEnabled(true);
            btn1.setText("");
            btn2.setText("");
            btn3.setText("");
            btn4.setText("");
            btn5.setText("");
            btn6.setText("");
            btn7.setText("");
            btn8.setText("");
            btn9.setText("");
            licznik = 0;
            Toast.makeText(this, "Remis", Toast.LENGTH_SHORT).show();
        }
    }
}