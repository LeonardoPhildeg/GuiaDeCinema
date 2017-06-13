package com.example.leonardo.cinema.entidades;

/**
 * Created by Leonardo on 05/06/2017.
 */

public class Cinema {

    private String nome;
    private String localizacao;

    public static Cinema createCinema(){
        Cinema cinema = new Cinema();
        cinema.setLocalizacao("Florianópolis");
        cinema.setNome("Shopping Iguatemi");

        return cinema;
    }

    public static Cinema createCinema2(){
        Cinema cinema = new Cinema();
        cinema.setLocalizacao("São José");
        cinema.setNome("Shopping Itaguaçu");
        return cinema;
    }

    public static Cinema createCinema3(){
        Cinema cinema = new Cinema();
        cinema.setLocalizacao("São Bonifácio");
        cinema.setNome("Fritz Park Shopping");
        return cinema;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

}
