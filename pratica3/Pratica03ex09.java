package pratica3;

import java.util.Scanner;

public class Pratica03ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double C1, C2, H;
        String op;
        do {

            System.out.println("Qual o primeiro Cateto?");
            C1 = input.nextDouble();
            System.out.println("Qual o segundo Cateto?");
            C2 = input.nextDouble();
            H = Math.sqrt(Math.pow(C1, 2) + Math.pow(C2, 2));
            System.out.printf("Hipotenusa = " + H);
            System.out.println("Deseja continuar? (S)im ou (N)ão");
            op = input.next();
        } while (op.equalsIgnoreCase("S"));
        input.close();
    }
}
