import java.util.Scanner;

public class ex4{
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = entrada.nextLine();

        String[] palavras = frase.split(" ");

        char[] vogais = {'a','e','i','o','u'};

        String palavraComMaisVogais = "";
        int maxVogais = 0;
        for (int i = 0; i < palavras.length; i++) {

            int contador = 0;
            for (int j = 0; j < palavras[i].length(); j++) {
                char letra = Character.toLowerCase(palavras[i].charAt(j));
                int k = 0;
                while (k < vogais.length && letra != vogais[k]) {
                    k++;
                }
                if (k < vogais.length) {
                    contador++;
                }
            }
            if (contador > maxVogais) {
                maxVogais = contador;
                palavraComMaisVogais = palavras[i];
            }
        }
        System.out.println("Palavra com mais vogais: " + palavraComMaisVogais);
        System.out.println("Quantidade de vogais: " + maxVogais);
        entrada.close();
    }
}
