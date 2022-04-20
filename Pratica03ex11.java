import java.util.Scanner;

public class Pratica03ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        System.out.println("informe um numero ");
        a = input.nextInt();

        for (int i = 0; i < 11; i++) {
            System.out.println(a + " X " + i + " = " + (a * i));
        }

        input.close();
    }
}
