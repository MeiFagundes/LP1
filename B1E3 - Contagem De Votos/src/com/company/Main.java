package com.company;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Candidato candidatos[] = new Candidato[6];

        //JTextArea CaixaSaida = new JTextArea( 11, 20);

        candidatos[0] = new Candidato("Lulalelé");
        candidatos[0].setVotos(13);
        candidatos[1] = new Candidato("Cirogrude");
        candidatos[1].setVotos(35);
        candidatos[2] = new Candidato("Criancinha");
        candidatos[2].setVotos(2);
        candidatos[3] = new Candidato("Roseaçaí");
        candidatos[3].setVotos(49);
        candidatos[4] = new Candidato("Nulo");
        candidatos[4].setVotos(200);
        candidatos[5] = new Candidato("Branco");
        candidatos[5].setVotos(500);

        Contagem(candidatos);

    }
    // Método para calcular a contagem de votos
    public static void Contagem(Candidato[] candidatos) {

        int maisVotadoIndice = 0, segMaisVotadoIndice = 0;
        float totalResto = 0;

        // Calculando candidato mais votado
        for(int i = 0 ; i < candidatos.length - 3; i++){
            if(candidatos[i + 1].getVotos() > candidatos[i].getVotos() && candidatos[i + 1].getVotos() > candidatos[maisVotadoIndice].getVotos()) {
                maisVotadoIndice = i + 1;
            }
        }

        // Checando se o candidato mais votado têm uma quantidade de votos maior ou igual ao resto dos cadidatos
        for(int i = 0 ; i < candidatos.length; i++){
            totalResto +=  candidatos[i].getVotos();
        }
        totalResto = totalResto - candidatos[maisVotadoIndice].getVotos();
        if(candidatos[maisVotadoIndice].getVotos() >= totalResto){
            JOptionPane.showMessageDialog(null, "Nome: " + candidatos[maisVotadoIndice].getNome() + "\n" + "Votos: " + candidatos[maisVotadoIndice].getVotos() + "\n");
        }

        // Calculando candidatos do segundo turno (caso necessário)
        else {

            // Calculando segundo mais votado
            for(int i = 0 ; i < candidatos.length - 3; i++){
                if(candidatos[i + 1].getVotos() > candidatos[i].getVotos() && candidatos[i + 1].getVotos() > candidatos[segMaisVotadoIndice].getVotos() && i + 1 != maisVotadoIndice) {
                    segMaisVotadoIndice = i + 1;
                }
                else if(i + 1 == maisVotadoIndice && i < 2) {
                    if(candidatos[i + 2].getVotos() > candidatos[i].getVotos() && candidatos[i + 2].getVotos() > candidatos[segMaisVotadoIndice].getVotos()){
                        segMaisVotadoIndice = i + 2;
                        System.out.println("AAAAA");
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "Candidatos que irâo para o segundo turno: " + "\n" + "Nome: " + candidatos[maisVotadoIndice].getNome() + "\n" + "Votos: " + candidatos[maisVotadoIndice].getVotos() + "\n" + "\n" + "Nome: " + candidatos[segMaisVotadoIndice].getNome() + "\n" + "Votos: " + candidatos[segMaisVotadoIndice].getVotos() + "\n");
        }
    }
}
