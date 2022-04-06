import java.util.Scanner;
public class Pratica01ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y, z, soma;
        System.out.println("Informe o valor de X");
        x = input.nextInt();
        System.out.println("Informe o valor de Y");
        y = input.nextInt();
        System.out.println("Informe o valor de Z");
        z = input.nextInt();
        soma = x + y - z;
        System.out.println("x + y - z = " + x +" + " + y + " - "+ z +" = "+ soma );





        input.close();
    }
   
}
