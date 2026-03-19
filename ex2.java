import java.util.Scanner;
public class ex2 {
    public static void main(String[] args){
        float joao;
        float pedro;
        Scanner entrada = new Scanner(System.in);
        System.out.print("valor investido joao: ");
        joao = entrada.nextFloat();
        System.out.print("valor investido pedro: ");
        pedro = entrada.nextFloat();
        int meses = 0;
        while (joao<pedro){
            joao = joao * 1.025f;
            pedro = pedro * 1.005f;
            meses = meses + 1;
        }
        System.out.printf("meses necessarios: %d\n", meses);
        entrada.close();
    }
}
