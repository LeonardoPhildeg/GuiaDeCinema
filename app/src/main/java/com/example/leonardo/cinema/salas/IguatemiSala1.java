package com.example.leonardo.cinema.salas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.leonardo.cinema.FilmesActivity.ActivityGuardioesDaGalaxia;
import com.example.leonardo.cinema.FilmesActivity.ActivityLagoaAzul;
import com.example.leonardo.cinema.FilmesActivity.ActivityPoderosoChefao;
import com.example.leonardo.cinema.R;

public class IguatemiSala1 extends AppCompatActivity {

    private ImageView posterGuardioes;
    private ImageView posterPoderosoChefao;
    private ImageView posterLagoaAzul;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iguatemi_sala1);


        posterGuardioes = (ImageView)findViewById(R.id.poster1);
        posterGuardioes.setImageResource(R.drawable.guardioes);

        posterPoderosoChefao = (ImageView)findViewById(R.id.poster2);
        posterPoderosoChefao.setImageResource(R.drawable.poderoso);

        posterLagoaAzul = (ImageView)findViewById(R.id.posterLagoaAzul);
        posterLagoaAzul.setImageResource(R.drawable.lagoa);



    }


    public void listaGuardioes(View view){
        Intent intent = new Intent(this, ActivityGuardioesDaGalaxia.class);
        startActivity(intent);
    }

    public void listaPoderosoChefao(View view){
        Intent intent = new Intent(this, ActivityPoderosoChefao.class);
        startActivity(intent);
    }

    public void listaLagoaAzul(View view){
        Intent intent = new Intent(this, ActivityLagoaAzul.class);
        startActivity(intent);
    }
}
