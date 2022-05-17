package pratica4;

import java.util.Scanner;

public class Pratica04ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, n3;
        String op;
        do {

            System.out.println("Informe o primeiro lado em cm: ");
            n1 = input.nextInt();
            System.out.println("Informe o segundo lado em cm: ");
            n2 = input.nextInt();
            System.out.println("Informe o terceiro lado em cm: ");
            n3 = input.nextInt();

            if (n2 - n3 < n1 && n1 < n2 + n3)
                if (n1 - n3 < n2 && n2 < n1 + n3)
                    if (n1 - n2 < n3 && n3 < n1 + n2)
                        System.out.println("os três valores informados são lados de um triângulo.");
                    else
                        System.out.println("os três valores informados NÃO são lados de um triângulo.");
                else
                    System.out.println("os três valores informados NÃO são lados de um triângulo.");
            else
                System.out.println("os três valores informados NÃO são lados de um triângulo.");
            System.out.println("Deseja continuar? (S)im ou (N)ão");
            op = input.next();
        } while (op.equalsIgnoreCase("S"));
        input.close();
    }
}
