package pratica3;
import java.util.Scanner;

public class Pratica03ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c;
        System.out.println("digite seu salario ");
        a = input.nextDouble();
        b = (a * 25) / 100;
        c = a + b;

        System.out.println("seu novo salario é: " + c);

        input.close();

    }
}
