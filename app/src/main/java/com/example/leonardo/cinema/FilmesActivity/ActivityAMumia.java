package com.example.leonardo.cinema.FilmesActivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.leonardo.cinema.R;
import com.example.leonardo.cinema.entidades.Arquivos;
import com.example.leonardo.cinema.entidades.Filme;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayer.Provider;
import com.google.android.youtube.player.YouTubePlayerView;

public class ActivityAMumia extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener, CompoundButton.OnCheckedChangeListener {


    private static final String API_KEY = "AIzaSyBl-WDNlG2GmXDPZcs9RVyP_c0EiI7n5RA";
    private String ID_VIDEO_MUMIA = "gHHxaXgrRC0";
    private YouTubePlayerView youtube;
    private Filme filmeAMumia;
    private CheckBox favorito;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amumia);

        this.filmeAMumia = Arquivos.getFilmeAMumia();
        ((TextView) findViewById(R.id.titulo_filmeMumia)).setText(filmeAMumia.getTitulo());
        ((TextView) findViewById(R.id.diretor_filmeMumia)).setText(filmeAMumia.getDiretor());
        ((TextView) findViewById(R.id.elenco_filmeMumia)).setText(filmeAMumia.getElenco());
        ((TextView) findViewById(R.id.sinopse_filmeMumia)).setText(filmeAMumia.getSinopse());
        ((TextView) findViewById(R.id.duracao_filmeMumia)).setText(filmeAMumia.getDuracao());
        ((TextView) findViewById(R.id.horarios_filmeMumia)).setText(filmeAMumia.getHorarios());
        ((TextView) findViewById(R.id.linguagem_filmeMumia)).setText(filmeAMumia.getLinguagem());
        ((ImageView) findViewById(R.id.posterMumia)).setImageResource(filmeAMumia.getPoster());

        favorito = ((CheckBox) findViewById(R.id.favorito));
        favorito.setOnCheckedChangeListener(this);
        favorito.setChecked(this.filmeAMumia.isFavorito());
        favorito.setClickable(true);

        youtube = (YouTubePlayerView)findViewById(R.id.youtube_view);
        youtube.initialize(API_KEY, this);

    }


    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer player, boolean loadAgain) {
        if(!loadAgain){
            player.cueVideo(ID_VIDEO_MUMIA);
        }
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult error) {
        Toast.makeText(this,"onInitializationFailure()", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

        switch (buttonView.getId()){
            case R.id.favorito:
                this.filmeAMumia.setFavorito(isChecked);
                break;
        }
    }

}
