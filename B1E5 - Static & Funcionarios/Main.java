import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Main {
    
    static Object funcionario[] = new Object[5];
    static int Cont = 0;
    static JFrame frame = new JFrame();
    static JTextArea textArea = new JTextArea();

    public static void main(String[] args) {
        
        GUI();
    }

    public static void addComissionadoAssalariado(){
        funcionario[Cont] = new Object(
            JOptionPane.showInputDialog(null, "Digite o nome: "),
            1,
            1,
            Integer.parseInt(JOptionPane.showInputDialog(null, "Digite os R$ em vendas: "))
        );
        Cont++;
        return;
    }

    public static void addComissionado(){
        funcionario[Cont] = new Object(
            JOptionPane.showInputDialog(null, "Digite o nome: "),
            Integer.parseInt(JOptionPane.showInputDialog(null, "Digite os R$ em vendas: "))
        );
        Cont++;
        return;
    }

    public static void addAssalariado(){
        funcionario[Cont] = new Object(
            JOptionPane.showInputDialog(null, "Digite o nome: "),
            Integer.parseInt(JOptionPane.showInputDialog(null, "Digite as horas trabalhadas: ")),
            Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o salário/hora: "))
        );
        Cont++;
        return;
    }

    public static void rem(){
        int id;
        id = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o [id] do funcionário: "));
        funcionario[id] = null;
        System.gc();
        for (int i = id; i < Cont - 1; i++) {
            funcionario[i] = new Object(
                funcionario[i + 1].getNome(),
                funcionario[i + 1].getHoras(),
                funcionario[i + 1].getSalHr(),
                funcionario[i + 1].getVendas(),
                funcionario[i + 1].getComissao()
            );
        }
        Cont--;
        return;
    }

    public static void Imprimir(){
        
        textArea.setText(null);

        for (int i = 0; i < Cont; i++) {
            textArea.append("Nome: " + funcionario[i].getNome());
            if (funcionario[i].getHoras() != 0) {
                textArea.append(
                "\n   Horas trabalhadas: " + funcionario[i].getHoras() + 
                "\n   Salário/hora: " + funcionario[i].getSalHr()
                );
            }
            if (funcionario[i].getComissao() != 0) {
                textArea.append(
                "\n   R$ em vendas: " + funcionario[i].getVendas() + 
                "\n   Comissão por venda: " + funcionario[i].getComissao() + "%"
                );
            }
            textArea.append("\n   SALÁRIO: " + funcionario[i].getSalario() + "\n\n");
        }
        return;
    }

    public static void GUI(){

        frame.setSize(700,600);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null); // Centraliza o frame
        frame.setTitle("Funcionários");
        textArea.setBounds(300,40,400,500);
        JButton buttonAss = new JButton("Adicionar Assalariado");
        JButton buttonCom = new JButton("Adicionar Comissionado");
        JButton buttonAssCom = new JButton("Adicionar Ass/Comissionado");
        JButton buttonRemover = new JButton("Remover Funcionario");
        JButton buttonImprimir = new JButton("Imprimir Lista");
        buttonAss.setBounds(30,40,250,30);
        buttonCom.setBounds(30,80,250,30);
        buttonAssCom.setBounds(30,120,250,30);
        buttonRemover.setBounds(30,160,250,30);
        buttonImprimir.setBounds(30,200,250,30);
        frame.add(buttonAss);
        frame.add(buttonCom);
        frame.add(buttonAssCom);
        frame.add(buttonRemover);
        frame.add(buttonImprimir);
        frame.add(textArea);
        frame.setVisible(true);
        
        buttonAss.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                addAssalariado();
            }
        });
        buttonCom.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                addComissionado();
            }
        });
        buttonAssCom.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                addComissionadoAssalariado();
            }
        });
        buttonRemover.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                rem();
            }
        });
        buttonImprimir.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Imprimir();
            }
        });
    }
}
