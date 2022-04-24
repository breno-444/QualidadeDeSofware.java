package pratica3;
import java.util.Scanner;

public class Pratica03ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c;
        System.out.println("Digite a diagonal maior ");
        a = input.nextDouble();
        System.out.println("Digite a diagonal menor ");
        b = input.nextDouble();
        c = (a * b) / 2;
        System.out.println("A área do losangulo é: " + c);

        input.close();
    }
}
