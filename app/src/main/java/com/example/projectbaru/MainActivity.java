package com.example.projectbaru;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnlogin;

    EditText editUser, editPass;

    TextView textView;



    int counter = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnlogin = (Button) findViewById(R.id.btnLogin);



        editUser = (EditText) findViewById(R.id.editUser);

        editPass = (EditText) findViewById(R.id.editPass);



        textView = (TextView) findViewById(R.id.textView2);

        textView.setVisibility(View.GONE);



        btnlogin.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {



                //set username dan password dengan "userbillal"

                if (editUser.getText().toString().equals("userbillal") &&

                        editPass.getText().toString().equals("user1234"))



                    //kondisi jika login benar

                    Toast.makeText(getApplicationContext(), "Login Sukses", Toast.LENGTH_SHORT).show();

                else {

                    //jika login gagal



                    Toast.makeText(getApplicationContext(), "Username atau Password Anda Salah",

                            Toast.LENGTH_SHORT).show();



                    textView.setVisibility(View.VISIBLE);

                    textView.setBackgroundColor(Color.RED);

                    counter--;

                    textView.setText(Integer.toString(counter));



                    if (counter == 0) {

                        btnlogin.setEnabled(false);

                    }

                }



            }

        });
    }
}