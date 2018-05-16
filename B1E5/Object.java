public class Object {
    
	private String nome;
	private int horas;
	private int comissao;
    private float salario;
    private float salHr;
    private float vendas;
    
    Object(String nome, int horas, float salHr, float vendas, int comissao){
		setNome(nome);
		setHoras(horas);
		setSalHr(salHr);
		setVendas(vendas);
		setComissao(comissao);
        setSalario();
	}
	
	// Assalariado
	Object(String nome, int horas, float salHr){
		this(nome, horas, salHr, 0, 0);
	}

	// Comissinado
	Object(String nome, float vendas){
		this(nome, 0, 0, vendas, 10);
	}

	// Comissionado-Assalariado
	Object(String nome, int horas, float salHr, float vendas){
		this(nome, horas, salHr, vendas, 3);
	}
	
    // GETS
	public String getNome() {
		return this.nome;
	}
	public int getComissao() {
		return this.comissao;
	}
	public int getHoras() {
		return this.horas;
	}
	public float getSalario() {
		return this.salario;
	}
	public float getSalHr() {
		return this.salHr;
	}
	public float getVendas() {
		return this.vendas;
	}
	
	
	// SETS
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setComissao(int comissao) {
		this.comissao = comissao;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public void setSalHr(float salHr) {
		this.salHr = salHr;
	}
	public void setVendas(float vendas) {
		this.vendas = vendas;
	}
	public void setSalario() {
            switch(this.comissao){
                case 0:
                    this.salario = (this.vendas * this.comissao)/100 + this.salHr * this.horas;
                case 3:
                    this.salario = (this.vendas * this.comissao)/100 + 724;
                case 10:
                    this.salario = (this.vendas * this.comissao)/100;
            }
		if(this.salario < 724){
                    this.salario = 724;
                }
                    
	}
	protected void finalize(){
		System.out.println("Usuário '" + this.nome+ "' deletado");
	}
    
}
