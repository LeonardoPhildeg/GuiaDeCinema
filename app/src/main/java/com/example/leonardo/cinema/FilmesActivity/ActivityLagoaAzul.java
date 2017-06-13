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

public class ActivityLagoaAzul extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener, CompoundButton.OnCheckedChangeListener {


    private static final String API_KEY = "AIzaSyBl-WDNlG2GmXDPZcs9RVyP_c0EiI7n5RA";
    private String ID_VIDEO_LAGOA_AZUL = "Dwm8A9qPk1g";
    private YouTubePlayerView youtube;
    private Filme filmeLagoaAzul;
    private CheckBox favorito;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lagoa_azul);
//        Intent intent = getIntent();
//        int idFilme = intent.getIntExtra(IguatemiSala2.EXTRA_ID_FILME, 0);
//
//         Filme filme = Arquivos.findFilmeById(idFilme);

        this.filmeLagoaAzul = Arquivos.getFilmeLagoaAzul();
        ((TextView) findViewById(R.id.titulo_filmeLagoaAzul)).setText(filmeLagoaAzul.getTitulo());
        ((TextView) findViewById(R.id.diretor_filmeLagoaAzul)).setText(filmeLagoaAzul.getDiretor());
        ((TextView) findViewById(R.id.elenco_filmeLagoaAzul)).setText(filmeLagoaAzul.getElenco());
        ((TextView) findViewById(R.id.sinopse_filmeLagoaAzul)).setText(filmeLagoaAzul.getSinopse());
        ((TextView) findViewById(R.id.duracao_filmeLagoaAzul)).setText(filmeLagoaAzul.getDuracao());
        ((TextView) findViewById(R.id.horarios_filmeLagoaAzul)).setText(filmeLagoaAzul.getHorarios());
        ((TextView) findViewById(R.id.linguagem_filmeLagoaAzul)).setText(filmeLagoaAzul.getLinguagem());
        ((ImageView) findViewById(R.id.posterLagoaAzul)).setImageResource(filmeLagoaAzul.getPoster());

        favorito = ((CheckBox) findViewById(R.id.favorito));
        favorito.setOnCheckedChangeListener(this);
        favorito.setChecked(this.filmeLagoaAzul.isFavorito());
        favorito.setClickable(true);

        youtube = (YouTubePlayerView)findViewById(R.id.youtube_view);
        youtube.initialize(API_KEY, this);

    }


    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer player, boolean loadAgain) {
        if(!loadAgain){
            player.cueVideo(ID_VIDEO_LAGOA_AZUL);
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
                this.filmeLagoaAzul.setFavorito(isChecked);
                break;
        }
    }
}