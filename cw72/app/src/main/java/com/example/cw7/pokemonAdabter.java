package com.example.cw7;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.Serializable;
import java.util.ArrayList;

public class pokemonAdabter extends RecyclerView.Adapter {

    ArrayList<bokemon>poArray;
    Context c ;

    public pokemonAdabter(ArrayList<bokemon> poArray, Context c) {
        this.poArray = poArray;
        this.c = c;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.pokemon,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        ((ViewHolder)holder).img.setImageResource(poArray.get(position).getImage());
        ((ViewHolder)holder).pokemonName.setText(poArray.get(position).getName());
        ((ViewHolder)holder).pokemonTotal.setText(poArray.get(position).getTotal()+"");
        ((ViewHolder)holder).view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(c,details.class);
                i.putExtra("pokemon",poArray.get(position));
                c.startActivity(i);
            }
        });

        ((ViewHolder)holder).deleteP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                poArray.remove(position);
                notifyDataSetChanged();
            }
        });


    }

    @Override
    public int getItemCount() {
        return poArray.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder{
       public ImageView img;
       public TextView pokemonName;
       public TextView pokemonTotal;
       public View view;
       public ImageView deleteP;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            view =itemView;
            pokemonName=itemView.findViewById(R.id.textView);
            pokemonTotal=itemView.findViewById(R.id.textView2);
            img=itemView.findViewById(R.id.imageView);
            deleteP=itemView.findViewById(R.id.imageView2);
        }
    }




}
