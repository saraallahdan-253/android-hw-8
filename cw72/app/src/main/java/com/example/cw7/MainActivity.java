package com.example.cw7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<bokemon> myPokemons = new ArrayList<>();

        bokemon one =new bokemon("Bulbasaur",R.drawable.bulbasaur,49,49,318);
        bokemon two =new bokemon("Butterfree",R.drawable.butterfree,45,50,395);
        bokemon three=new bokemon("Charizard",R.drawable.charizard,84,78,534);
        bokemon four =new bokemon("Clefable",R.drawable.clefable,70,73,483);
        bokemon five= new bokemon("Wigglytuff",R.drawable.wigglytuff,70,45,435);

        myPokemons.add(one);
        myPokemons.add(two);
        myPokemons.add(three);
        myPokemons.add(four);
        myPokemons.add(five);

        RecyclerView rv = findViewById(R.id.recyclerv);

        rv.setHasFixedSize(true);
        RecyclerView.LayoutManager lm= new LinearLayoutManager(this);
        rv.setLayoutManager(lm);

        pokemonAdabter adapters =new pokemonAdabter(myPokemons,this);
        rv.setAdapter(adapters);

    }

}