package com.example.leonardo.cinema;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.leonardo.cinema.MapsActivity.FritzParkMapsActivity;
import com.example.leonardo.cinema.MapsActivity.IguatemiMapsActivity;
import com.example.leonardo.cinema.MapsActivity.ItaguacuMapsActivity;
import com.example.leonardo.cinema.salas.IguatemiSala1;
import com.example.leonardo.cinema.salas.IguatemiSala2;
import com.example.leonardo.cinema.salas.ItagacuSala1;
import com.example.leonardo.cinema.entidades.Cinema;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Cinema cinema = Cinema.createCinema();
        ((TextView) findViewById(R.id.nome_cinema)).setText(cinema.getNome());
        ((TextView) findViewById(R.id.localizacao_cinema)).setText(cinema.getLocalizacao());


        Cinema cinema2 = Cinema.createCinema2();
        ((TextView) findViewById(R.id.nome_cinema2)).setText(cinema2.getNome());
        ((TextView) findViewById(R.id.localizacao_cinema2)).setText(cinema2.getLocalizacao());

        Cinema cinema3 = Cinema.createCinema3();
        ((TextView) findViewById(R.id.nome_cinema3)).setText(cinema3.getNome());
        ((TextView) findViewById(R.id.localizacao_cinema3)).setText(cinema3.getLocalizacao());

    }

    public void listaIguatemiSala1(View view) {
        Intent intent = new Intent(this, IguatemiSala1.class);
        startActivity(intent);
    }

    public void listaIguatemiSala2(View view) {
        Intent intent = new Intent(this, IguatemiSala2.class);
        startActivity(intent);
    }

    public void listaItaguacuSala1(View view) {
        Intent intent = new Intent(this, ItagacuSala1.class);
        startActivity(intent);
    }

    public void listaItaguacuSala2(View view) {
        Intent intent = new Intent(this, IguatemiSala2.class);
        startActivity(intent);
    }

    public void listaFritzParkSala1(View view) {
        Intent intent = new Intent(this, IguatemiSala2.class);
        startActivity(intent);
    }

    public void listaFritzParkSala2(View view) {
        Intent intent = new Intent(this, ItagacuSala1.class);
        startActivity(intent);
    }


    //MAPS
    public void viewMapIguatemi(View view){
        Intent intent = new Intent(this, IguatemiMapsActivity.class);
        startActivity(intent);
    }

    public void viewMapItaguacu(View view){
        Intent intent = new Intent(this, ItaguacuMapsActivity.class);
        startActivity(intent);
    }

    public void viewMapFritzPark(View view){
        Intent intent = new Intent(this, FritzParkMapsActivity.class);
        startActivity(intent);
    }
}
