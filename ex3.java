import java.util.Scanner;
public class ex3 {
    public static void main(String[] args) 
    {
        double S;
        double xantigo;
        double xn;
        Scanner entrada = new Scanner(System.in);
        System.out.print("valor positivo:");
        S = entrada.nextDouble();
        xn = S/2.0;
        do{
            xantigo = xn;
            xn = (xantigo + (S/xantigo)) / 2.0;
        } while (Math.abs(xantigo - xn) > 0.0001);
        System.out.printf("Raiz quadrada de %.1f: %.16f", S, xn);
        entrada.close();
    }
}
