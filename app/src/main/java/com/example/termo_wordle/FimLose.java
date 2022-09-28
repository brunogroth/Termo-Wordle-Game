package com.example.termo_wordle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class FimLose extends AppCompatActivity {

    private Button buttonTry;
    private TextView textLose;
    private  TextView msgLose;
    private TextView msgLose2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fim_lose);

        //instancia o botão para tentar novamente

        buttonTry = findViewById(R.id.buttonTry);

        //listener para tela de Lose quando acaba o jogo
        buttonTry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentTry = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intentTry);

            }
        });
    }
}