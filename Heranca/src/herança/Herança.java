/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herança;

/**
 *
 * @author mei
 */
import java.util.Scanner;
import javax.swing.*;
public class Herança {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        
        //System.out.println( "Digite o curso: " );
        
        String c = JOptionPane.showInputDialog("Digite o curso: ");
        //System.out.println( "Digite o ano escolar: " );
        curso curso = new curso(c,Integer.parseInt(JOptionPane.showInputDialog("Digite o ano escolar: ")));
        
        //System.out.println( "Digite a quantidade de alunos: " );
        curso.setAlunos(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alunos: ")));
        
        System.out.println( curso.alunos[0].getnome());
        System.out.println( curso.alunos[1].getnome());
        //System.out.println( "Digite o numero de disciplinas: " );
        int tamDisciplina = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de disciplinas: "));
        for(int i = 0;i<curso.getAlunos().length;i++){
            curso.alunos[i].setDisciplinas(tamDisciplina);
            for(int j = 0; j<curso.alunos[i].getDisciplinas().length;j++){
                curso.alunos[i].disciplinas[j].setnome("Disciplina" + ( j + 1));
            }
        }
        int[] nota = new int[4];
        String strAux;
        
        for(int i = 0 ; i < curso.getAlunos().length; i++){
            //System.out.println( "Entre com nome do " + (i+1) + "º aluno: " );
            String nome = JOptionPane.showInputDialog("Entre com nome do " + (i+1) + "º aluno: ");
            curso.alunos[i].setnome(nome);
            curso.alunos[i].setnumero(i+1);
            curso.alunos[i].setCurso(curso.getnome());
        }
        for(int i=0;i<curso.getAlunos().length;i++){
            for(int y=0;y<curso.alunos[i].getDisciplinas().length;y++){
                System.out.println( "Entre com as 4 notas do aluno '" + curso.alunos[i].getnumero() + "' para a " + curso.alunos[i].disciplinas[y].getnome() );
                //strAux = JOptionPane.showInputDialog(ent.nextInt());
                for(int j=0;j<nota.length;j++){
                    String n = ent.nextLine();
                    nota[j] = Integer.parseInt(n);
                }
                curso.alunos[i].disciplinas[y].setnota(nota);
                //System.out.println( "Entre com a frequencia do aluno '" + curso.alunos[i].getnumero() + "' na " + curso.alunos[i].disciplinas[y].getnome() );
                curso.alunos[i].disciplinas[y].setfrequencia(Integer.parseInt(JOptionPane.showInputDialog( "Entre com a frequencia do aluno '" + curso.alunos[i].getnumero() + "' na " + curso.alunos[i].disciplinas[y].getnome() )));
            }
        }
         System.out.println("\n Dados dos alunos \n");
         System.out.println("Curso: " + curso.getnome());
         //n = ent.nextLine();
         int[] nt = new int[4];
         for(int i = 0; i < curso.getAlunos().length;i++){
            System.out.println("Aluno - " + curso.alunos[i].getnome() + " - " + curso.alunos[i].getnumero() + " - ");
            for(int j = 0; j < curso.alunos[i].getDisciplinas().length;j++){
                nt = curso.alunos[i].disciplinas[j].getnota();
                System.out.println(curso.alunos[i].disciplinas[j].getnome() + " - Frequencia " + curso.alunos[i].disciplinas[j].getfrequencia());
                for(int N :nt){
                     System.out.println(N);
                }
            }
        }
    }
}
