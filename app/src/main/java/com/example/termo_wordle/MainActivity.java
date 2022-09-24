package com.example.termo_wordle;

import androidx.appcompat.app.AppCompatActivity;
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

        //Listener do botão Enviar
        botaoEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Aqui ocorrerá a validação da palavra enviada

                //Gera uma palavra
                String palavraSorteada = gerarPalavras();
                
                //valida a tentativa
                int retorno = validarTentativa(tentativa, palavraSorteada);
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
    public int[] validarTentativa(String tentativa, String palavraSorteada){
        int posicaoAcertos[] = new int[5];

        //
        //fazer um FOR que acessa cada letra da tentativa e verifica se é igual a alguma letra da palavra sorteada.
        //a lógica precisa validar duas coisas: se a letra 1 da tentativa é igual a letra 1 da palavraSorteada e dar um retorno, e precisa validar se a letra 1 da tentativa é igual a qualquer letra da palavraSorteada e dar outro retorno. faça isso usando um for dentro do outro, o primeiro acessando for cada letra da palavra e o outro verificando as letras sao iguais.
        //pensei em retornar um array de valores 0 1 e 2 onde 0 = nao achou a letra, 1 = letra certa e 2 = letra encontrada na palavra, mas precisa pensar melhor nisso

        if(tentativa == palavraSorteada){
            //fim de jogo
        }
        return posicaoAcertos;
    }
}