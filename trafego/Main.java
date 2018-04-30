package trafegoa;

import java.util.*;
import javax.swing.*;
import java.awt.event.*;

public class Main {

    static int[] semaforoLanes = new int[4];
    static Carro carro[] = new Carro[3];
    
    public static void main(String[] args)
   {  

        
        carro[0] = new Carro(3, 2);
        carro[1] = new Carro(3, 1);
        carro[2] = new Carro(2, 0);
        GUI();

   }

   static void executarTurno(){
    java.util.Random random = new java.util.Random();
    for (int i = 0; i < carro.length; i++) {
        boolean virarDireita = random.nextBoolean();
        if(carro[i].getTravessia() == true || carro[i].getPos() == 0 || carro[i].getPos() == 1){
            Movimento.go(carro[i], virarDireita);
        } else {
            switch (semaforoLanes[carro[i].getLane()]) {
                case 2:
                case 1:
                    Movimento.go(carro[i], virarDireita);
                    break;
                case 0:
                default:
                    break;
            }
        }

        // Chamando o Garbage Collector
        if(carro[i].getPos() < 0){
            carro[i] = null;
            System.gc();
        }
        // DEBUG
        System.out.println("carro[" + i + "]\nPos = " + carro[i].getPos() + "\nLane = " + carro[i].getLane() + "\nvirarDireita = " + virarDireita + "\n");
    }

    // Atualizando semáforos
    switch (semaforoLanes[0]) {
        case 2:
            semaforoLanes[0] = Semaforo.AMARELO.setSinal();
            semaforoLanes[2] = Semaforo.AMARELO.setSinal();
            break;
        case 1:
            semaforoLanes[0] = Semaforo.VERMELHO.setSinal();
            semaforoLanes[2] = Semaforo.VERMELHO.setSinal();
            semaforoLanes[1] = Semaforo.VERDE.setSinal();
            semaforoLanes[3] = Semaforo.VERDE.setSinal();
            break;
        case 0:
            if(semaforoLanes[1] == 1){
                semaforoLanes[0] = Semaforo.VERDE.setSinal();
                semaforoLanes[2] = Semaforo.VERDE.setSinal();
            } else {
                semaforoLanes[1] = Semaforo.AMARELO.setSinal();
                semaforoLanes[3] = Semaforo.AMARELO.setSinal();
            }
            break;
        default:
            break;
    }
    Imprimir();
   }

   static void GUI(){
        JFrame frame = new JFrame();
        JButton button = new JButton("Avançar turno");
        frame.setSize(350,200);
        frame.setLayout(null);
        frame.setTitle("Trafego");
        frame.setLocationRelativeTo(null);
        button.setBounds(50,50,250,30);
        frame.add(button);
        frame.setVisible(true);
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                executarTurno();
            }
        });
   }

   static void Imprimir(){
       //int[] Lane = new int[4];
       int[] Pos = new int[4];
       for (int i = 0; i < Pos.length; i++) {
           Pos[i] = 0;
       }
       for (int i = 0; i < carro.length; i++) {
           for (int k = 0; k < 4; k++) {
                for (int j = 0; j < 4; j++) {
                    if(carro[j].getPos() == j && carro[j].getLane() == k){
                        //Lane[i] = carro[j].getLane();
                        Pos[i] = carro[j].getCont();
                    }
                }

           }

       }
       System.out.println("||||" + Pos[0] + Pos[1] + "||||\n" + "||||" + Pos[2] + Pos[3] + "||||\n" + Pos[4] + Pos[5] + "    " + "\n");
   }
}