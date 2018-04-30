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
public class curso {

    private String nome;
    private int codigo;
    
    aluno[] alunos;
    public curso(){

    }
    public curso(String nome, int codigo){
        this.codigo = codigo;
        this.nome = nome;

    }
    
    public void setAlunos(int tamAlunos){
        alunos = new aluno[tamAlunos];
        for(int i =0 ; i<tamAlunos;i++){
            alunos[i] = new aluno();
        }
    }
    public void setcurso(String nome, int codigo){
        this.codigo = codigo;
        this.nome = nome;

    }
    public void setnome(String nome){
        this.nome = nome;
    }
    public void setcodigo(int codigo){
        this.codigo = codigo;
    }
    public String getnome(){
        return nome;
    }
    public int getcodigo(){
        return codigo;
    }
    
    public aluno[] getAlunos(){
        return alunos;
    } 
}