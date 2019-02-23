public class Execucao{

    public static void gerar(Object[] vetor){

        java.util.Random random = new java.util.Random();

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = new Object(random.nextInt(10));
        }
    }
    
    public static void selecaoMaior(Object[] vetor){

        int indiceMaiorNumero = 0;

        for(int i = 0 ; i < vetor.length - 1; i++){
            if(vetor[i + 1].getInt() > vetor[i].getInt() && vetor[i + 1].getInt() > vetor[indiceMaiorNumero].getInt()) {
                indiceMaiorNumero = i + 1;
            }
        }
        System.out.println("Maior numero: " + vetor[indiceMaiorNumero].getInt());
    }

    public static void selecaoMenor(Object[] vetor){
        int indiceMenorNumero = 0;

        for(int i = 0 ; i < vetor.length - 1; i++){
            if(vetor[i + 1].getInt() < vetor[i].getInt() && vetor[i + 1].getInt() < vetor[indiceMenorNumero].getInt()) {
                indiceMenorNumero = i + 1;
            }
        }
        System.out.println("Menor numero: " + vetor[indiceMenorNumero].getInt());
    }

    public static void ocorrencia(Object[] vetor, int x){
        int numOcorrencias = 0;
        
        for(int i = 0 ; i < vetor.length; i++){
            if(vetor[i].getInt() == x) {
                System.out.println((numOcorrencias + 1) + "ª Posicao de ocorrencia do numero " + x + ": [" + i + "]");
                numOcorrencias++;
            }
        }
        System.out.println("Quantidade de ocorrencias do número " + x + " : " + numOcorrencias);
    }

    public static void imprimir(Object[] vetor){
        System.out.print("Vetor gerado: { ");
        for(int i = 0; i < vetor.length; i++){ // Inicializa o vetor de objetos
            System.out.print(vetor[i].getInt() + ", ");
        }
        System.out.println("}");
    }
}