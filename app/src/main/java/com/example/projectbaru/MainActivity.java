package com.example.projectbaru;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;

import android.graphics.Color;

import android.view.View;

import android.view.Menu;

import android.view.MenuItem;

import android.webkit.WebView;

import android.webkit.WebViewClient;

import android.widget.Button;

import android.widget.EditText;

import android.widget.TextView;

import android.widget.Toast;

import java.io.FileInputStream;

import java.io.FileOutputStream;

public class MainActivity extends Activity {
    SharedPreferences pref;
    SharedPreferences.Editor editor;

    Button b1, b2;
    EditText ed1, ed2;
    TextView tx1;



    int counter = 3;



    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pref = getSharedPreferences("login", MODE_PRIVATE);
        b1 = (Button) findViewById(R.id.btnLogin);
        b2 = (Button) findViewById(R.id.btnCancel);
        ed1 = (EditText) findViewById(R.id.editUser);
        ed2 = (EditText) findViewById(R.id.editPass);
        tx1 = (TextView) findViewById(R.id.textView2);

        tx1.setVisibility(View.GONE);
        b1.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                if (ed1.getText().toString().equals("user") &&
                        ed2.getText().toString().equals("user1234"))
                    Toast.makeText(getApplicationContext(), "Login Sukses", Toast.LENGTH_SHORT).show();
                else {
                    Toast.makeText(getApplicationContext(), "Username atau Password Anda Salah",
                            Toast.LENGTH_SHORT).show();

                    //saving ke SP
                    editor = pref.edit();
                    editor.putString("username", ed1.getText().toString());
                    editor.putString("status", "login");
                    editor.apply();


                    tx1.setVisibility(View.VISIBLE);
                    tx1.setBackgroundColor(Color.RED);
                    counter--;
                    tx1.setText(Integer.toString(counter));



                    if (counter == 0) {

                        b1.setEnabled(false);

                    }

                }



            }

        });



        b2.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                finish();

            }

        });

    }

    public void LOGIN(View view) {
    }
}