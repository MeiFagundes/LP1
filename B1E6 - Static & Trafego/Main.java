import java.util.*;
import javax.swing.*;
import java.awt.event.*;

public class Main {

    static int[] SEMAFORO;
    static Carro CARRO[];
    static int NUM_TURNOS;

    static{
        SEMAFORO = new int[4];
        CARRO = new Carro[3];
        NUM_TURNOS = 1;
    }
    
    public static void main(String[] args)
   {  

        
        CARRO[0] = new Carro(3, 2);
        CARRO[1] = new Carro(3, 1);
        CARRO[2] = new Carro(2, 0);
        GUI();

   }

   static void executarTurno(){
    
    
    System.out.println("\n--- Turno Nº " + NUM_TURNOS++ + " ---\n");

    java.util.Random random = new java.util.Random();
    for (int i = 0; i < CARRO.length; i++) {
        if (CARRO[i] != null){
            boolean IntencaoVirarDireita = random.nextBoolean();
            if(CARRO[i].getTravessia() == true || CARRO[i].getPos() == 0 || CARRO[i].getPos() == 1){
                Movimento.go(CARRO[i], IntencaoVirarDireita);
            } else {
                switch (SEMAFORO[CARRO[i].getLane()]) {
                    case 2:
                    case 1:
                        Movimento.go(CARRO[i], IntencaoVirarDireita);
                        break;
                    case 0:
                    default:
                        break;
                }
            }
    
            // Chamando o Garbage Collector
            if(CARRO[i].getPos() < 0){
                CARRO[i] = null;
                System.gc();
            }
            // DEBUG
            if (CARRO[i] != null)
                System.out.println("Carro Nº " + i + "\nPosição = " + CARRO[i].getPos() + "\nLane = " + CARRO[i].getLane() + "\nIntenção de virar à Direita? = " + IntencaoVirarDireita + "\n");
        }
    }

    // Atualizando semáforos
    switch (SEMAFORO[0]) {
        case 2:
            SEMAFORO[0] = Semaforo.AMARELO.setSinal();
            SEMAFORO[2] = Semaforo.AMARELO.setSinal();
            break;
        case 1:
            SEMAFORO[0] = Semaforo.VERMELHO.setSinal();
            SEMAFORO[2] = Semaforo.VERMELHO.setSinal();
            SEMAFORO[1] = Semaforo.VERDE.setSinal();
            SEMAFORO[3] = Semaforo.VERDE.setSinal();
            break;
        case 0:
            if(SEMAFORO[1] == 1){
                SEMAFORO[0] = Semaforo.VERDE.setSinal();
                SEMAFORO[2] = Semaforo.VERDE.setSinal();
            } else {
                SEMAFORO[1] = Semaforo.AMARELO.setSinal();
                SEMAFORO[3] = Semaforo.AMARELO.setSinal();
            }
            break;
        default:
            break;
    }
    //Imprimir();
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
       int[] Pos = new int[6];
       for (int i = 0; i < Pos.length; i++) {
           Pos[i] = 0;
       }
       for (int i = 0; i < CARRO.length; i++) {
           for (int k = 0; k < 4; k++) {
                for (int j = 0; j < CARRO.length; j++) {
                    if(CARRO[j].getPos() == j && CARRO[j].getLane() == k){
                        //Lane[i] = carro[j].getLane();
                        Pos[i] = CARRO[j].getCont();
                    }
                }

           }

       }
       System.out.println("||||" + Pos[0] + Pos[1] + "||||\n" + "||||" + Pos[2] + Pos[3] + "||||\n" + Pos[4] + Pos[5] + "    " + "\n");
   }
}