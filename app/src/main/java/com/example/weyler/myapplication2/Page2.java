package com.example.weyler.myapplication2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;


public class Page2 extends AppCompatActivity {

    //TextView show_login;
    //TextView show_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        Intent page22 = getIntent();
        String login = page22.getStringExtra("Login");
        String senha = page22.getStringExtra("Senha");
        escreve(login, senha);
    }

    public void escreve (String login, String senha){
        TextView show_login = (TextView) findViewById(R.id.login_page2);
        TextView show_password = (TextView) findViewById(R.id.Password_page2);
        show_login.setText(login);
        show_password.setText(senha);
    }

}
