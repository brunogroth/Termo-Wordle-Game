package com.example.termo_wordle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class adapter extends RecyclerView.Adapter<adapter.MyViewHolder> {

    private ArrayList<String> listaPalavras;
    public adapter(ArrayList<String> lista){
        this.listaPalavras = lista;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //cria o item
        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_lista, parent, false);
        return new MyViewHolder(itemLista);
    }


    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
    //exibe o item
        String palavra = listaPalavras.get(position);

        holder.palavra.setText(palavra);
    }

    @Override
    public int getItemCount() {

        return listaPalavras.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        //Elemento dentro do TextView
        TextView palavra;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            palavra = itemView.findViewById(R.id.palavra);
        }
    }
}
