import java.util.Scanner;
public class ex1 {
    public static void main(String[] args) 
    {
        int codigo;
        int qtd;
        float valor;
        Scanner entrada = new Scanner(System.in);
        System.out.print("codigo do produto: ");
        codigo = entrada.nextInt();
        System.out.print("quantidade do produto: ");
        qtd = entrada.nextInt();
        valor = 0.0f;
        if(codigo >=1 && codigo <= 10){
           valor = 10.00f;
        }
        else if(codigo >=11 && codigo <= 20){
           valor = 15.00f;
        }
        else if(codigo >=21 && codigo <= 30){
           valor = 20.00f;
        }
        else if(codigo >=31 && codigo <= 40){
           valor = 30.00f;
        }
        System.out.printf("Preco da unidade: R$ %.2f\n",valor);
       valor =valor * qtd;
        System.out.printf("Valor total: R$ %.2f\n",valor);

        if(valor <= 250.00f){
            System.out.printf("Desconto: R$ %.2f",valor * 0.05);
           valor =valor * 0.95f;
        }
        else if(valor > 250.00 &&valor <= 500.00){
            System.out.printf("Desconto: R$ %.2f",valor * 0.10);
           valor =valor * 0.90f;
        }
        else if(valor > 500.00){
            System.out.printf("Desconto: R$ %.2f",valor * 0.15);
           valor =valor * 0.85f;
        }

        System.out.printf("\nPreco final: R$ %.2f",valor);
        entrada.close();
    }
}
