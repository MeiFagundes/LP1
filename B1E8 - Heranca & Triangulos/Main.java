import javax.swing.*;
import java.awt.*;

public class Main{

    static Ponto ponto[] = new Ponto[3];
    static Triangulo triangulo = new Triangulo();

    public static void main(String[] args) {

    GUI();

    }

    static void GUI(){

        JTextField inputX[] = new JTextField[3];
        JTextField inputY[] = new JTextField[3];

        for (int i = 0; i < 3; i++) {
            inputX[i] = new JTextField(5);
            inputY[i] = new JTextField(5);
        }

        JPanel panel = new JPanel(new GridLayout(0,1));

        for (int i = 0; i < 3; i++) {
            panel.add(new JLabel("Ponto nº" + (i + 1) + ": "), null);
            panel.add(new JLabel("x: "));
            panel.add(inputX[i]);
            panel.add(new JLabel("y: "));
            panel.add(inputY[i]);
        }

        int result = JOptionPane.showConfirmDialog(null, panel, "Triangulo", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            for (int i = 0; i < 3; i++) {
                ponto[i] = new Ponto(
                    Float.parseFloat(inputX[i].getText()),
                    Float.parseFloat(inputY[i].getText())
                );
            }
            triangulo = new Triangulo(ponto[0], ponto[1], ponto[2]);
            JOptionPane.showMessageDialog(null, "Area: " + triangulo.getArea() + "\nPerímetro: " + triangulo.getPerimetro());
        }
    }
}