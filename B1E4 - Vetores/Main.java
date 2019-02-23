import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Object vetor[] = new Object[20];
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int x = in.nextInt();
        in.close();
        
        Execucao.gerar(vetor);
        Execucao.imprimir(vetor);
        Execucao.selecaoMaior(vetor);
        Execucao.selecaoMenor(vetor);
        Execucao.ocorrencia(vetor, x);
    }
}


