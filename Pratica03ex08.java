import java.util.Scanner;

public class Pratica03ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c, e;
        System.out.println("Digite seu peso ");
        a = input.nextDouble();
        b = (a * 15) / 100;
        c = a + b;
        b = (a * 20) / 100;
        e = a - b;

        System.out.println("Se voçe engordar 15% seu peso sera: " + c);
        System.out.println("Se voçe emagrecer 20% seu peso sera: " + e);

        input.close();
    }
}
