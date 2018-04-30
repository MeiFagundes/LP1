package examples;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.Font;
//import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Object object[] = new Object[2]; // Define o vetor de objetos
        
        for(int i = 0; i < object.length; i++){ // Inicializa o vetor de objetos
            object[i] = new Object("Dante Alighieri");
            object[i].setInt(1321);
        }

        Method(object);
    }

    public static void Method(Object[] object) {

        java.util.Random random = new java.util.Random();

        JTextArea textArea = new JTextArea();
        textArea.setBounds(60,80,300,200);
        //.setBounds(x, y, largura, altura);
        textArea.setFont(new Font("Segoe Ui", Font.PLAIN, 15)); // Muda a fonte da caixa de texto
        textArea.append(
            "String: " + object[0].getString() + "\n" +
            "Int: " + object[0].getInt() + "\n" +
            "Int randômico: " + random.nextInt(1000) + "\n" +
            "Float randômico: " + random.nextFloat()*100);
        

        JLabel label = new JLabel();
        label.setBounds(175, 25, 100, 30);
        label.setText("Label");

        JButton button = new JButton("Button");
        button.setBounds(140,300,100,30);

        JFrame frame = new JFrame();
        frame.add(label);frame.add(textArea);frame.add(button);
        frame.setSize(450,450);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null); // Centraliza o frame
        frame.setVisible(true);

        //JOptionPane.showMessageDialog(null, "Abc...");
        System.out.println("println");
    }
}
