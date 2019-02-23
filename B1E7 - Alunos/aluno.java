public class aluno {
    
 private String nome;
 private int numero;
 private String Curso;
 disciplina[] disciplinas;
  

    public aluno(){
        nome="";
        numero=0;
        Curso="redes";
    }
    public aluno(String nome, int numero, String Curso ){
        this.nome=nome;
        this.numero=numero;
        this.Curso=Curso;
    }
    public aluno(aluno id){
        nome = id.nome;
        numero = id.numero;
        Curso = id.Curso;
    }
    public void setaluno(String nome, int numero, String Curso ){
        this.nome=nome;
        this.numero=numero;
        this.Curso=Curso;
    }
    public void setnome(String nome){
        this.nome = nome;
    }
    public void setCurso(String Curso){
        this.Curso = Curso;
    }
    public void setnumero(int numero){
        this.numero = numero;
    }
    public void setDisciplinas(int tamDisciplina){
        disciplinas = new disciplina[tamDisciplina];
        for(int i=0; i<tamDisciplina;i++){
            disciplinas[i] = new disciplina();
        }
    }
    public String getnome(){
        return nome;
    }
    public String getCurso(){
        return Curso;
    }
    public int getnumero(){
        return numero;
    }
    public disciplina[] getDisciplinas(){
        return disciplinas;
    } 
}