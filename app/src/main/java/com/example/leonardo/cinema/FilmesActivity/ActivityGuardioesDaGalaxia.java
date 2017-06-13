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

public class ActivityGuardioesDaGalaxia extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener, CompoundButton.OnCheckedChangeListener {


    private static final String API_KEY = "AIzaSyBl-WDNlG2GmXDPZcs9RVyP_c0EiI7n5RA";
    private String ID_VIDEO_GUARDIOES = "6FVulnc4poc";
    private YouTubePlayerView youtube;
    private Filme filmeGuardioesDaGalaxia2;
    private CheckBox favorito;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guardioes_da_galaxia);

        this.filmeGuardioesDaGalaxia2 = Arquivos.getFilmeGuardioesDaGalaxia();
        ((TextView) findViewById(R.id.titulo_filme1)).setText(filmeGuardioesDaGalaxia2.getTitulo());
        ((TextView) findViewById(R.id.diretor_filme1)).setText(filmeGuardioesDaGalaxia2.getDiretor());
        ((TextView) findViewById(R.id.elenco_filme1)).setText(filmeGuardioesDaGalaxia2.getElenco());
        ((TextView) findViewById(R.id.sinopse_filme1)).setText(filmeGuardioesDaGalaxia2.getSinopse());
        ((TextView) findViewById(R.id.duracao_filme1)).setText(filmeGuardioesDaGalaxia2.getDuracao());
        ((TextView) findViewById(R.id.horarios_filme1)).setText(filmeGuardioesDaGalaxia2.getHorarios());
        ((TextView) findViewById(R.id.linguagem_filme1)).setText(filmeGuardioesDaGalaxia2.getLinguagem());
        ((ImageView) findViewById(R.id.poster1)).setImageResource(filmeGuardioesDaGalaxia2.getPoster());

        favorito = ((CheckBox) findViewById(R.id.favorito));
        favorito.setOnCheckedChangeListener(this);
        favorito.setChecked(this.filmeGuardioesDaGalaxia2.isFavorito());
        favorito.setClickable(true);

        youtube = (YouTubePlayerView)findViewById(R.id.youtube_view);
        youtube.initialize(API_KEY, this);

    }


    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer player, boolean loadAgain) {
        if(!loadAgain){
            player.cueVideo(ID_VIDEO_GUARDIOES);
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
                this.filmeGuardioesDaGalaxia2.setFavorito(isChecked);
                break;
        }
    }
}
