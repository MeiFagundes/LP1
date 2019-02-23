package com.company;


public class Candidato {

    private String nome;
    private int votos;

    public Candidato(String nome){
        setCandidato(nome);
    }

    public void setCandidato(String nome){
        setNome(nome);
        setVotos(0);
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVotos(){
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

}
