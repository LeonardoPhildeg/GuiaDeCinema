package com.example.leonardo.cinema.FilmesActivity;

import android.os.Bundle;
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
import com.google.android.youtube.player.YouTubePlayerView;

public class ActivityAChegada extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener, CompoundButton.OnCheckedChangeListener {


    private static final String API_KEY = "AIzaSyBl-WDNlG2GmXDPZcs9RVyP_c0EiI7n5RA";
    private String ID_VIDEO_CHEGADA = "CkSZgeoPftg";
    private YouTubePlayerView youtube;
    private Filme filmeAChegada;
    private CheckBox favorito;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_achegada);


//        Intent intent = getIntent();
//        int idFilme = intent.getIntExtra(IguatemiSala2.EXTRA_ID_FILME, 0);
//
//         Filme filme = Arquivos.findFilmeById(idFilme);

        this.filmeAChegada = Arquivos.getFilmeAChegada();
        ((TextView) findViewById(R.id.titulo_filmeChegada)).setText(filmeAChegada.getTitulo());
        ((TextView) findViewById(R.id.diretor_filmeChegada)).setText(filmeAChegada.getDiretor());
        ((TextView) findViewById(R.id.elenco_filmeChegada)).setText(filmeAChegada.getElenco());
        ((TextView) findViewById(R.id.sinopse_filmeChegada)).setText(filmeAChegada.getSinopse());
        ((TextView) findViewById(R.id.duracao_filmeChegada)).setText(filmeAChegada.getDuracao());
        ((TextView) findViewById(R.id.horarios_filmeChegada)).setText(filmeAChegada.getHorarios());
        ((TextView) findViewById(R.id.linguagem_filmeChegada)).setText(filmeAChegada.getLinguagem());
        ((ImageView) findViewById(R.id.posterChegada)).setImageResource(filmeAChegada.getPoster());

        favorito = ((CheckBox) findViewById(R.id.favorito));
        favorito.setOnCheckedChangeListener(this);
        favorito.setChecked(this.filmeAChegada.isFavorito());
        favorito.setClickable(true);

        youtube = (YouTubePlayerView)findViewById(R.id.youtube_view);
        youtube.initialize(API_KEY, this);

    }


    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer player, boolean loadAgain) {
        if(!loadAgain){
            player.cueVideo(ID_VIDEO_CHEGADA);
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
                    this.filmeAChegada.setFavorito(isChecked);
                    break;
        }
    }
}
