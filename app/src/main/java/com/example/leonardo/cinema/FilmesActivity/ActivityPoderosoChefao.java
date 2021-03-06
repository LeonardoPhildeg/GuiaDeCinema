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

public class ActivityPoderosoChefao extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener,CompoundButton.OnCheckedChangeListener  {


    private static final String API_KEY = "AIzaSyBl-WDNlG2GmXDPZcs9RVyP_c0EiI7n5RA";
    private String ID_VIDEO_PODEROSO = "SEPtyESN2Zw";
    private YouTubePlayerView youtube;
    private Filme filmeOPoderosoChefao;
    private CheckBox favorito;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poderoso_chefao);

        this.filmeOPoderosoChefao = Arquivos.getFilmePoderosoChefao();
        ((TextView) findViewById(R.id.titulo_filme1)).setText(filmeOPoderosoChefao.getTitulo());
        ((TextView) findViewById(R.id.diretor_filme1)).setText(filmeOPoderosoChefao.getDiretor());
        ((TextView) findViewById(R.id.elenco_filme1)).setText(filmeOPoderosoChefao.getElenco());
        ((TextView) findViewById(R.id.sinopse_filme1)).setText(filmeOPoderosoChefao.getSinopse());
        ((TextView) findViewById(R.id.duracao_filme1)).setText(filmeOPoderosoChefao.getDuracao());
        ((TextView) findViewById(R.id.horarios_filme1)).setText(filmeOPoderosoChefao.getHorarios());
        ((TextView) findViewById(R.id.linguagem_filme1)).setText(filmeOPoderosoChefao.getLinguagem());
        ((ImageView) findViewById(R.id.poster1)).setImageResource(filmeOPoderosoChefao.getPoster());

        favorito = ((CheckBox) findViewById(R.id.favorito));
        favorito.setOnCheckedChangeListener(this);
        favorito.setChecked(this.filmeOPoderosoChefao.isFavorito());
        favorito.setClickable(true);

        youtube = (YouTubePlayerView)findViewById(R.id.youtube_view);
        youtube.initialize(API_KEY, this);

    }


    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer player, boolean loadAgain) {
        if(!loadAgain){
            player.cueVideo(ID_VIDEO_PODEROSO);
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
                this.filmeOPoderosoChefao.setFavorito(isChecked);
                break;
        }
    }


}