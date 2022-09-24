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
        palavrasDisponiveis.add("sagaz"); palavrasDisponiveis.add("regra");palavrasDisponiveis.add("bravo");palavrasDisponiveis.add("êxito");palavrasDisponiveis.add("mexer");palavrasDisponiveis.add("termo");palavrasDisponiveis.add("nobre");palavrasDisponiveis.add("senso");palavrasDisponiveis.add("arroz");palavrasDisponiveis.add("afeto");palavrasDisponiveis.add("plena");palavrasDisponiveis.add("ética");palavrasDisponiveis.add("mútua");palavrasDisponiveis.add("tênue");palavrasDisponiveis.add("sutil");palavrasDisponiveis.add("vigor");palavrasDisponiveis.add("fazer");palavrasDisponiveis.add("coisa");palavrasDisponiveis.add("porém");palavrasDisponiveis.add("assim");palavrasDisponiveis.add("juízo");palavrasDisponiveis.add("seção");palavrasDisponiveis.add("sanar");palavrasDisponiveis.add("manso");palavrasDisponiveis.add("carne");palavrasDisponiveis.add("fosse");palavrasDisponiveis.add("ideia");palavrasDisponiveis.add("poder");palavrasDisponiveis.add("moral");palavrasDisponiveis.add("desde");palavrasDisponiveis.add("muito");palavrasDisponiveis.add("justo");palavrasDisponiveis.add("tropa");palavrasDisponiveis.add("honra");palavrasDisponiveis.add("sobre");palavrasDisponiveis.add("fútil");palavrasDisponiveis.add("veloz");palavrasDisponiveis.add("anexo");palavrasDisponiveis.add("razão");palavrasDisponiveis.add("etnia");palavrasDisponiveis.add("ícone");palavrasDisponiveis.add("sonho");palavrasDisponiveis.add("linda");palavrasDisponiveis.add("noiva");palavrasDisponiveis.add("amigo");palavrasDisponiveis.add("falar");palavrasDisponiveis.add("mútuo");palavrasDisponiveis.add("expor");palavrasDisponiveis.add("haver");palavrasDisponiveis.add("hábil");palavrasDisponiveis.add("tempo");palavrasDisponiveis.add("dengo");palavrasDisponiveis.add("seara");palavrasDisponiveis.add("então");palavrasDisponiveis.add("pesar");palavrasDisponiveis.add("gesto");palavrasDisponiveis.add("tinta");palavrasDisponiveis.add("genro");palavrasDisponiveis.add("boçal");palavrasDisponiveis.add("posse");palavrasDisponiveis.add("tênis");palavrasDisponiveis.add("causa");palavrasDisponiveis.add("dizer");palavrasDisponiveis.add("pária");palavrasDisponiveis.add("dever");palavrasDisponiveis.add("fugir");palavrasDisponiveis.add("detém");palavrasDisponiveis.add("graça");palavrasDisponiveis.add("saber");palavrasDisponiveis.add("lista");palavrasDisponiveis.add("folha");palavrasDisponiveis.add("bruxa");palavrasDisponiveis.add("obvio");palavrasDisponiveis.add("teste");palavrasDisponiveis.add("digno");palavrasDisponiveis.add("ápice");palavrasDisponiveis.add("ânimo");palavrasDisponiveis.add("ânsia");palavrasDisponiveis.add("comum");palavrasDisponiveis.add("ceder");palavrasDisponiveis.add("temor");palavrasDisponiveis.add("sendo");palavrasDisponiveis.add("culto");palavrasDisponiveis.add("cinto");palavrasDisponiveis.add("braço");palavrasDisponiveis.add("perna");palavrasDisponiveis.add("pauta");palavrasDisponiveis.add("mundo");palavrasDisponiveis.add("censo");palavrasDisponiveis.add("ainda");palavrasDisponiveis.add("testa");palavrasDisponiveis.add("velha");palavrasDisponiveis.add("casar");palavrasDisponiveis.add("estar");palavrasDisponiveis.add("denso");palavrasDisponiveis.add("vício");palavrasDisponiveis.add("forte");palavrasDisponiveis.add("neném");palavrasDisponiveis.add("vulgo");palavrasDisponiveis.add("saída");


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