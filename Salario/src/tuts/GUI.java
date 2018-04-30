package tuts;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GUI {
    public static void GUI(){
        JFrame frame = new JFrame();
        frame.setSize(200,200);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null); // Centraliza o frame
        frame.setVisible(true);
        
        JButton buttonHr = new JButton("Hora");
        buttonHr.setBounds(30,120,100,30);
        buttonHr.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Tuts.FuncHr();
            }
        });
        frame.add(buttonHr);
        
        JButton buttonCom = new JButton("Comissão");
        buttonCom.setBounds(30,80,100,30);
        buttonCom.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        frame.add(buttonCom);
        
        JButton buttonComHr = new JButton("Hora e Com");
        buttonComHr.setBounds(30,40,100,30);
        buttonComHr.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        frame.add(buttonComHr);
        
    }
}
