import java.util.Scanner;

public class Pratica03ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c, d;
        System.out.println("Digite o valor do raio ");
        a = input.nextDouble();
        b = 2 * 3.14 * a;
        System.out.println("O comprimento da esfera é: " + b);
        c = 3.14 * Math.pow(a, 2);
        System.out.println("A área da esfera é: " + c);
        d = (3) / (4) * 3.14 * Math.pow(a, 3);
        System.out.println("O volume da esfera é " + d);

        input.close();
    }
}
