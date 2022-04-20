import java.util.Scanner;

public class Pratica03ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c;
        System.out.println("Digite o valor do salario minimo ");
        a = input.nextDouble();
        System.out.println("Digite o valor do salario do funcionario ");
        b = input.nextDouble();
        c = b / a;
        System.out.println("O funcionario recebe" + c);

        input.close();

    }
}
