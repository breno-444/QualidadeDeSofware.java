package pratica4;
import java.util.Scanner;
public class Pratica04ex03 {
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite sua nota");
        double n1, n2, n3, media;
        n1 = input.nextDouble();
        n2 = input.nextDouble();
        n3 = input.nextDouble();
        media = n1 + n2 + n3 / 2;
 
      if (media >= 0 && media < 3) {
          System.out.println("Reprovado");
      } else if (media >= 3 && media< 7) {
          System.out.println("Exame");
      } else if (media >= 7 && media <= 10) {
          System.out.println("Aprovado");
      }

        input.close();
    }
}
