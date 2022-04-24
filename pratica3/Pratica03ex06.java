package pratica3;
import java.util.Scanner;

public class Pratica03ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double c, f;
        System.out.println("Digite o valor em Celsius ");
        c = input.nextDouble();
        f = (c * 1.8) + 32;
        System.out.println("O valor em Fahrenheit é: " + f);

        input.close();

    }
}
