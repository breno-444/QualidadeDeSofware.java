package pratica3;
import java.util.Scanner;

public class Pratica03ex03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double x, y, z;

        System.out.println("Informe a cotação do dolar ");
        x = input.nextDouble();
        System.out.println("Informe o valor em dolar ");
        y = input.nextDouble();

        z = x * y;

        System.out.println("o valor em reais sera:$" + z);

        input.close();
    }
}