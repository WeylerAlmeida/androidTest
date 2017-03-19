package com.example.weyler.myapplication2;

import android.content.Intent;
import android.content.res.Resources;
import android.support.annotation.RequiresPermission;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void verifica (View v) {
        Resources res = getResources();
        String[] logins = res.getStringArray(R.array.logins);
        String[] senhas = res.getStringArray(R.array.senhas);
        EditText aux = (EditText) findViewById(R.id.Login);
        String login_atual = aux.getText().toString();
        aux = (EditText) findViewById(R.id.Password);
        String senha_atual = aux.getText().toString();

        for (int i = 0; i < 3; i++){
            if (login_atual.equals(logins[i])){
                if (senha_atual.equals(senhas[i])){
                    troca(login_atual, senha_atual);
                }
            }
        }

    }

    public void troca (String login, String senha) {
        Intent page2 = new Intent(MainActivity.this,Page2.class);
        page2.putExtra("Login", login);
        page2.putExtra("Senha", senha);
        startActivity(page2);
    }
}
