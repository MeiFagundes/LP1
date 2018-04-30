package tuts;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Tuts {
    
    
    
    public static void main(String[] args) {
        
        GUI.GUI();
    }
    public static void FuncHr(){
        String nome;
	float horas;
	float salhr;
	float salario;
        
        Object object = new Object();
        
        nome = JOptionPane.showInputDialog("Digite o nome: ");
        horas = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite as horas trabalhadas: "));
        salhr = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o salário por hora: "));
        object.ObjHr(nome, horas, salhr);
    }
}
