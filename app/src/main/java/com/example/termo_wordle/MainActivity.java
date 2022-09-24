package com.example.termo_wordle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //Declaração
    private RecyclerView recyclerViewPalavras;
    private Button botaoEnviar;
    private TextInputEditText tentativa;
    private ArrayList<String> palavrasDisponiveis = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Instâncias
        recyclerViewPalavras = findViewById(R.id.recyclerView);
        botaoEnviar = findViewById(R.id.enviar);
        tentativa = findViewById(R.id.tentativa);

        //INTERFACE RECYCLER VIEW -
        //Layout
        // RecyclerView.LayoutManager = new GridLayoutManager(getApplicationContext());
        // recyclerViewPalavras.setLayoutManager(GridLayoutManager);

        //Listener do botão Enviar
        botaoEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Aqui ocorrerá a validação da palavra enviada

                String tentativaAtual = tentativa.toString();
                //Gera uma palavra
                String palavraSorteada = gerarPalavras();
                
                //valida a tentativa
                boolean resultado = validarTentativa(tentativaAtual, palavraSorteada);
            }
        });
    }

    public String gerarPalavras(){
        palavrasDisponiveis.add(""); palavrasDisponiveis.add("adasd");

        Random gerador = new Random();
        int posicao = gerador.nextInt(100);
        String palavraSorteada = palavrasDisponiveis.get(posicao);

        return palavraSorteada;
    }

    public boolean validarTentativa(String tentativa, String palavraSorteada){
        boolean resultado = false;
        if(tentativa == palavraSorteada){
            //fim de jogo
        }
        return resultado;
    }
}