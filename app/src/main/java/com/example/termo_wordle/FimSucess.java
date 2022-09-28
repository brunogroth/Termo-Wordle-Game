package com.example.termo_wordle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class FimSucess extends AppCompatActivity {

    private TextInputLayout textVenceu;
    private Button buttonAgain;
    private TextView msgWin;
    private TextView msgWin2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fim_sucess);

        //instancia buttonSucesso,
        buttonAgain = findViewById(R.id.buttonAgain);


        //listener para tela de Sucesso quando acaba o jogo
        buttonAgain.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
    }
}