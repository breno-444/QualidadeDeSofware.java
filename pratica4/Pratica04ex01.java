package pratica4;

import java.util.Scanner;

public class Pratica04ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, media;
        String op;
        do {

            n1 = input.nextInt();
            n2 = input.nextInt();
            media = n1 + n2 / 2;
            if (media >= 7) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }
            System.out.println("Deseja continuar? (S)im ou (N)ão");
            op = input.next();
        } while (op.equalsIgnoreCase("S"));
        input.close();
    }

}
