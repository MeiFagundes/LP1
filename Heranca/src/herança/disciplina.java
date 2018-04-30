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
public class disciplina{

    
    private int[] nota = new int[4];
    private int frequencia;
    private String nome;
    private int codigo;

    public disciplina(){

    }
    public disciplina(String nome, int codigo){
        this.codigo = codigo;
        this.nome = nome;
    }
    public void setnota(int[] nota){
        this.nota = nota;
    }
    public void setfrequencia(int frequencia){
        this.frequencia = frequencia;
    }
    public void setnome(String nome){
        this.nome = nome;
    }
    public void setcodigo(int codigo){
        this.codigo = codigo;
    }
    public int[] getnota(){
        return nota;
    }
    public int getfrequencia(){
        return frequencia;
    }
    public String getnome(){
        return nome;
    }
    public int getcodigo(){
        return codigo;
    }

}
