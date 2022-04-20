import java.util.Scanner;

public class Pratica03ex01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        {
            int x, y, z, soma;
            System.out.println("Informe a primeira nota");
            x = input.nextInt();
            System.out.println("Informe a segunda nota");
            y = input.nextInt();
            System.out.println("Informe a terceira nota");
            z = input.nextInt();
            soma = (x + y + z) / 3;
            System.out.println("A media é = " + soma);

            input.close();

        }
    }
}