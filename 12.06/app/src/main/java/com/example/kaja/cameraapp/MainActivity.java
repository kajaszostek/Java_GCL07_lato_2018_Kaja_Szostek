package com.example.kaja.cameraapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    User admin=new User("Kaja", "123");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login();
    }

    public void login()
    {
        final EditText pas = (EditText) findViewById(R.id.password);
        Button btnLog = (Button) findViewById(R.id.btn);
        final EditText log=(EditText) findViewById(R.id.login);

                btnLog.setOnClickListener(new View.OnClickListener(){

                    @Override
                    public void onClick(View v)
                    {
                        if (log.getText().toString().equals("Kaja") && pas.getText().toString().equals("123") ) {
                            Intent goToIntent;
                            goToIntent = new Intent(MainActivity.this, SecondActivity.class);
                            startActivity(goToIntent);
                        }
                        else {
                            Toast.makeText(MainActivity.this, "Wrong login or password", Toast.LENGTH_LONG).show();
                        }
                    }
                });
            }


    }

