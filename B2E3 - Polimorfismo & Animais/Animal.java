/**
 * Animal
 */
public abstract class Animal {

    private String nome;
    private int idade;

    Animal(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    Animal(){
        this("nome", 0);
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }
    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }
    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    

    abstract void emiteSom();
}