/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuts;

/**
 *
 * @author Aluno
 */
public class Object {
    
    private String nome;
    private int com;
    private float salario;
    private float salhr;
    private float vendas;
    private float horas;
    
    
    
    public void ObjHr(String nome, float horas, float salhr){
        setNome(nome);
	setHoras(horas);
	setSalhr(salhr);
        setSalario();
    }
    
    public void consComHr(String nome, int com, float vendas) {
	setNome(nome);
	setCom(com);
	setVendas(vendas);
	setSalario();
    }
    
    // GETS
	public String getNome() {
		return this.nome;
	}
	public int getCom() {
		return this.com;
	}
	public float getHoras() {
		return this.horas;
	}
	public float getSalario() {
		return this.salario;
	}
	public float getSalhr() {
		return this.salario;
	}
	public float getVendas() {
		return this.vendas;
	}
	
	
	// SETS
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCom(int com) {
		this.com = com;
	}
	public void setHoras(float horas) {
		this.horas = (int) horas;
	}
	public void setSalhr(float salhr) {
		this.salhr = salhr;
	}
	public void setSalario() {
		if(this.com == 0) {
			this.salario = this.salhr*this.horas;
		}
		if(this.com == 3) {
			this.salario = (float) (this.vendas*0.3 + 724);
		}
		if(this.com == 10) {
			this.salario = (float) (this.vendas*0.10);
		}
	}
	public void setVendas(float vendas) {
		this.vendas = vendas;
	}
	
	/*public void putInGUI(GUI GUI){
		GUI.appendText(this.nome, this.salario);
	}*/
	
	protected void finalize(){
		System.out.println("Usuário deletado");
	}
    
}
