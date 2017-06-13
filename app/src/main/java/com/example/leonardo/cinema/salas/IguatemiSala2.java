package com.example.leonardo.cinema.salas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.leonardo.cinema.FilmesActivity.ActivityAChegada;
import com.example.leonardo.cinema.FilmesActivity.ActivityAMumia;
import com.example.leonardo.cinema.FilmesActivity.ActivityLagoaAzul;
import com.example.leonardo.cinema.FilmesActivity.ActivityPoderosoChefinho;
import com.example.leonardo.cinema.R;

public class IguatemiSala2 extends AppCompatActivity {

    public static final String EXTRA_ID_FILME = "IdFilme";
    ImageView posterChefinho;
    ImageView posterAChegada;
    ImageView posterMumia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iguatemi_sala2);

        posterChefinho = (ImageView)findViewById(R.id.posterChefinho);
        posterChefinho.setImageResource(R.drawable.chefinho);

        posterAChegada = (ImageView)findViewById(R.id.posterChegada);
        posterAChegada.setImageResource(R.drawable.chegada);

        posterMumia = (ImageView)findViewById(R.id.posterMumia);
        posterMumia.setImageResource(R.drawable.mumia);
    }


    public void listaChefinho(View view){
        Intent intent = new Intent(this, ActivityPoderosoChefinho.class);
        startActivity(intent);
    }

    public void listaAChegada(View view){
        Intent intent = new Intent(this, ActivityAChegada.class);
        startActivity(intent);
//        intent.putExtra(EXTRA_ID_FILME, Arquivos.getFilmeAChegada().getId());
    }

    public void listaMumia(View view){
        Intent intent = new Intent(this, ActivityAMumia.class);
        startActivity(intent);
    }
}
