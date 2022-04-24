package pratica3;
import java.util.Scanner;

public class Pratica04ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite os lados dos triangulos");
        double l1, l2, l3;
        l1 = input.nextDouble();
        l2 = input.nextDouble();
        l3 = input.nextDouble();

        if (l1 == l2 && l2 == l3)
            System.out.println("Equilátero");
        else if (l1 == l2 || l1 == l3 || l2 == l3)
            System.out.println("Isósceles");
        if (l1 != l2 && l1 != l3 && l2 != l3) {
            System.out.println("Escaleno");
        }

        input.close();
    }

}