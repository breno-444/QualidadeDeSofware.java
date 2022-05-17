package pratica3;

import java.util.Scanner;

public class Pratica03ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        String op;
        do {

            System.out.println("informe um numero ");
            a = input.nextInt();

            for (int i = 0; i < 11; i++) {
                System.out.println(a + " X " + i + " = " + (a * i));
            }
            System.out.println("Deseja continuar? (S)im ou (N)ão");
            op = input.next();
        } while (op.equalsIgnoreCase("S"));


        input.close();
    }
}
