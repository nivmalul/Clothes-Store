package com.example.saggi.clothesstore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {



    Button login,register;
    EditText username,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = (Button)findViewById(R.id.login);
        register =(Button)findViewById(R.id.register);
        login.setOnClickListener(this);
        register.setOnClickListener(this);
        username = (EditText)findViewById(R.id.username);
        password = (EditText)findViewById(R.id.password);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();

        switch (id){
            case R.id.login:
                if(checkFields()) {
                    Intent loginIn = new Intent(this, Menu.class);
                    startActivity(loginIn);
                }
                else{
                    Toast.makeText(this,"Error",Toast.LENGTH_SHORT).show();
                    username.setText("");
                    password.setText("");
                }
                break;
            case R.id.register:
                Intent in = new Intent(this,Register.class);
                startActivity(in);
                break;
        }
    }


    public boolean checkFields(){
        if(username.getText().toString().length() == 0 || password.getText().toString().length() == 0){
            return false;
        }
        return true;
    }
}
