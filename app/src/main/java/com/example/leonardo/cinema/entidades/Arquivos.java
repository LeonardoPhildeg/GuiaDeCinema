package com.example.leonardo.cinema.entidades;


import com.example.leonardo.cinema.R;
/**
 * Created by Leonardo on 05/06/2017.
 */

public class Arquivos {

    private static Filme filmeGuardioesDaGalaxia;
    private static Filme filmePoderosoChefao;
    private static Filme filmePoderosoChefinho;
    private static Filme filmeAChegada;
    private static Filme filmeAMumia;
    private static Filme filmeLagoaAzul;




    public static Filme getFilmeGuardioesDaGalaxia(){
        if(filmeGuardioesDaGalaxia == null){
            filmeGuardioesDaGalaxia = createFilmeGuardioesDaGalaxia();
        }
        return filmeGuardioesDaGalaxia;
    }

    public static Filme getFilmePoderosoChefao(){
        if(filmePoderosoChefao == null){
            filmePoderosoChefao = createFilmePoderosoChefao();
        }
        return filmePoderosoChefao;
    }

    public static Filme getFilmePoderosoChefinho(){
        if(filmePoderosoChefinho == null){
            filmePoderosoChefinho = createFilmePoderosoChefinho();
        }
        return filmePoderosoChefinho;
    }

    public static Filme getFilmeAChegada(){
        if (filmeAChegada == null){
            filmeAChegada = createFilmeAChegada();
        }
        return filmeAChegada;
    }

    public static Filme getFilmeAMumia(){
        if(filmeAMumia == null){
            filmeAMumia = createFilmeAMumia();
        }
        return filmeAMumia;
    }

    public static Filme getFilmeLagoaAzul(){
        if(filmeLagoaAzul == null){
            filmeLagoaAzul = createFilmeLagoaAzul();
        }
        return filmeLagoaAzul;
    }




    public static Filme createFilmeGuardioesDaGalaxia() {
        Filme filme1 = new Filme();
        filme1.setTitulo("Guardiões da Galáxia Vol.2");
        filme1.setDiretor("Direção: "+ " " +  "James Gun");
        filme1.setElenco("Elenco: "+ " " +  "Chris Pratt, Vin Diesel, Zoe Saldana, Dave Bautista, Bradley Cooper");
        filme1.setSinopse("Sinopse: "+ " " +  "Agora já conhecidos como os Guardiões da Galáxia, os guerreiros viajam ao longo do cosmos " +
                "e lutam para manter sua nova família unida. Enquanto isso tentam desvendar os mistérios da " +
                "verdadeira paternidade de Peter Quill (Chris Pratt).");
        filme1.setDuracao("Duração: "+ " " +  "136min");
        filme1.setHorarios("Horários: "+ " " +  "16:30h -" + "" + " 19:00h -" + " 21:30h");
        filme1.setLinguagem("Linguagem: "+ " " +  "Legendado");
        filme1.setPoster(R.drawable.guardioes);
        filme1.setFavorito(false);
        return filme1;
    }

    public static Filme createFilmePoderosoChefao() {
        Filme filme = new Filme();
        filme.setTitulo("O Poderoso Chefão");
        filme.setDiretor("Direção: "+ " " + "Francis Ford Coppola");
        filme.setElenco("Elenco: "+ " " +  "Al Pacino, Marlon Brando, James Can, Robert Duvall, Diane Keaton");
        filme.setSinopse("Sinopse: "+ " " +  "A saga conta a história de uma família mafiosa que luta para estabelecer sua supremacia na América depois" +
                " da Segunda Guerra. Uma tentativa de assassinato deixa Vito Corleone incapacitado e força os filhos Michael e Sonny" +
                " a assumirem os negócios..");
        filme.setDuracao("Duração: "+ " " +  "178min");
        filme.setHorarios("Horários: "+ " " +  " 19:00h -" + " 22:30h");
        filme.setLinguagem("Linguagem: "+ " " +  "Legendado");
        filme.setPoster(R.drawable.poderoso);
        filme.setFavorito(false);
        return filme;
    }


    public static Filme createFilmePoderosoChefinho() {
        Filme filme = new Filme();
        filme.setTitulo("O Poderoso Chefinho");
        filme.setDiretor("Direção: "+ " " + "Tom McGrath");
        filme.setElenco("Elenco: "+ " " +  "Alec Baldwin, Lisa Kudrow, Steve Buscemi, Jimmy Kimmel, Tobey Maguire");
        filme.setSinopse("Sinopse: "+ " " +  "Um bebê falante que usa terno e carrega uma maleta misteriosa une forças com seu irmão" +
                " mais velho invejoso para impedir que um inescrupuloso CEO acabe com o amor no mundo. A missão é salvar os pais, " +
                "impedir a catástrofe e provar que o mais intenso dos sentimentos é uma poderosa força.");
        filme.setDuracao("Duração: "+ " " +  "98min");
        filme.setHorarios("Horários: "+ " " +  " 16:20h -" + " 19:00h");
        filme.setLinguagem("Linguagem: "+ " " +  "Dublado");
        filme.setPoster(R.drawable.chefinho);
        filme.setFavorito(false);
        return filme;
    }


    private static Filme createFilmeAChegada() {
        Filme filme = new Filme();
        filme.setTitulo("A Chegada");
        filme.setDiretor("Direção: "+ " " + "Denis Villeneuve");
        filme.setElenco("Elenco: "+ " " +  "Amy Adams, Jeremy Renner, Forest Whitaker, Michael Stuhlbarg, Ruth Chiang");
        filme.setSinopse("Sinopse: "+ " " +  "Naves alienígenas chegaram às principais cidades do mundo. Com a intenção de se" +
                " comunicar com os visitantes, uma linguista e um militar são chamados para decifrar as estranhas mensagens dos " +
                "visitantes.");
        filme.setDuracao("Duração: "+ " " +  "118min");
        filme.setHorarios("Horários: "+ " " +  " 18:00h -" + " 21:40h");
        filme.setLinguagem("Linguagem: "+ " " +  "Dublado");
        filme.setPoster(R.drawable.chegada);
        filme.setFavorito(false);
        return filme;
    }

    public static Filme createFilmeAMumia() {
        Filme filme = new Filme();
        filme.setTitulo("A Múmia");
        filme.setDiretor("Direção: "+ " " + "Alex Kurtzman");
        filme.setElenco("Elenco: "+ " " +  "Tom Cruise, Sofia Boutella, Annabelle Wallace, Russel Crowe, Jake Johnson");
        filme.setSinopse("Sinopse: "+ " " +  "Nas profundezas do deserto, uma antiga rainha cujo destino foi injustamente tirado " +
                "está mumificada. Apesar de estar sepultada em sua cripta, ela desperta nos dias atuais. Com uma maldade acumulada" +
                " ao longo dos anos, ela espelha terror desde as areais do Oriente Médio até os becos de Londres.");
        filme.setDuracao("Duração: "+ " " +  "120min");
        filme.setHorarios("Horários: "+ " " +  " 18:00h -" + " 21:40h");
        filme.setLinguagem("Linguagem: "+ " " +  "Legendado");
        filme.setPoster(R.drawable.mumia);
        filme.setFavorito(false);
        return filme;
    }

    private static Filme createFilmeLagoaAzul() {
        Filme filme = new Filme();
        filme.setTitulo("Lagoa Azul");
        filme.setDiretor("Direção: "+ " " + "Randal Kleiser");
        filme.setElenco("Elenco: "+ " " +  "Brooke Shields, Christopher Atkins");
        filme.setSinopse("Sinopse: "+ " " +  "Após um naufrágio, duas crianças e o velho cozinheiro de um navio vão parar em uma ilha" +
                " deserta no Oceano Pacífico. Pouco tempo depois, o cozinheiro morre, deixando o menino Richard e a menina Emmeline" +
                " entregues à própria sorte.");
        filme.setDuracao("Duração: "+ " " +  "104min");
        filme.setHorarios("Horários: "+ " " +  " 16:00h -" + " 19:15h");
        filme.setLinguagem("Linguagem: "+ " " +  "Dublado");
        filme.setPoster(R.drawable.lagoa);
        filme.setFavorito(false);
        return filme;
    }


//    public static Filme findFilmeById(int idFilme) {
//
//        switch (idFilme){
//            case 1:
//                return getFilmeAChegada();
//            break;
//            case 2:
//        }
//    }
}
