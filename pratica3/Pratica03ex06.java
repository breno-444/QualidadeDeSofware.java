package pratica3;

import java.util.Scanner;

public class Pratica03ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double c, f;
        String op;
        do {

            System.out.println("Digite o valor em Celsius ");
            c = input.nextDouble();
            f = (c * 1.8) + 32;
            System.out.println("O valor em Fahrenheit é: " + f);
            System.out.println("Deseja continuar? (S)im ou (N)ão");
            op = input.next();
        } while (op.equalsIgnoreCase("S"));
        input.close();

    }
}
