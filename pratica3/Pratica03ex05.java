package pratica3;

import java.util.Scanner;

public class Pratica03ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c;
        String op;
        do {

            System.out.println("Digite a diagonal maior ");
            a = input.nextDouble();
            System.out.println("Digite a diagonal menor ");
            b = input.nextDouble();
            c = (a * b) / 2;
            System.out.println("A área do losangulo é: " + c);
            System.out.println("Deseja continuar? (S)im ou (N)ão");
            op = input.next();
        } while (op.equalsIgnoreCase("S"));
        input.close();
    }
}
