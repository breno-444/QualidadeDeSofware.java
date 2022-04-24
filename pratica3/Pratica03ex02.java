package pratica3;
import java.util.Scanner;

public class Pratica03ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y, z, b, a = 2050;

        System.out.println("Informe seu ano de nascimento ");
        x = input.nextInt();
        System.out.println("Informe o ano atual");
        y = input.nextInt();

        z = y - x;
        b = a - x;

        System.out.println("A sua idade nesse ano sera " + z);
        System.out.println("Sua idade em 2050 sera " + b);

        input.close();
    }
}
