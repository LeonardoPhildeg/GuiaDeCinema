package com.example.leonardo.cinema.salas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.leonardo.cinema.FilmesActivity.ActivityAMumia;
import com.example.leonardo.cinema.FilmesActivity.ActivityGuardioesDaGalaxia;
import com.example.leonardo.cinema.FilmesActivity.ActivityLagoaAzul;
import com.example.leonardo.cinema.R;

public class ItagacuSala1 extends AppCompatActivity {

    ImageView posterMumia;
    ImageView posterLagoaAzul;
    ImageView posterGuardioes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itagacu_sala1);


        posterMumia = (ImageView)findViewById(R.id.posterMumia);
        posterMumia.setImageResource(R.drawable.mumia);

        posterLagoaAzul = (ImageView)findViewById(R.id.posterLagoaAzul);
        posterLagoaAzul.setImageResource(R.drawable.lagoa);

        posterGuardioes = (ImageView)findViewById(R.id.poster1);
        posterGuardioes.setImageResource(R.drawable.guardioes);

    }


    public void listaMumia(View view){
        Intent intent = new Intent(this, ActivityAMumia.class);
        startActivity(intent);
    }

    public void listaLagoaAzul(View view){
        Intent intent = new Intent(this, ActivityLagoaAzul.class);
        startActivity(intent);
    }

    public void listaGuardioes(View view){
        Intent intent = new Intent(this, ActivityGuardioesDaGalaxia.class);
        startActivity(intent);
    }
}
