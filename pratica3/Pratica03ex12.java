package pratica3;

import java.util.Scanner;

public class Pratica03ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, c, delta, x1, x2;
        String op;
        do {

            System.out.println("Informe o valor do coeficiente a: ");
            a = input.nextInt();
            System.out.println("Informe o valor do coeficiente b: ");
            b = input.nextInt();
            System.out.println("Informe o valor do coeficiente c: ");
            c = input.nextInt();

            delta = (b * b - 4 * a * c);
            System.out.println("Valor de Delta: " + delta);

            x1 = (int) ((-b + Math.sqrt(delta)) / (2 * a));
            x2 = (int) ((-b - Math.sqrt(delta)) / (2 * a));

            System.out.println("x1: " + x1);
            System.out.println("x2: " + x2);
            System.out.println("Deseja continuar? (S)im ou (N)ão");
            op = input.next();
        } while (op.equalsIgnoreCase("S"));
        input.close();
    }
}
