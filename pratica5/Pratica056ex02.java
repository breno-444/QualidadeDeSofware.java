package pratica5;

import java.util.Scanner;

public class Pratica056ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0, b = 0, c = 0, m = 0, media, contador = 0;
        while (m >= 0) {
            System.out.println("Digite a matricula: ");
            m = input.nextInt();
            System.out.println("Digite a primeira nota: ");
            a = input.nextInt();
            System.out.println("Digite a segunda nota: ");
            b = input.nextInt();
            System.out.println("Digite a terceira nota: ");
            c = input.nextInt();

            if (m < 0)
                break;
            contador++;
          

            media = (a + b + c) / 3;
            if ( media >= 70)
            System.out.println("Aluno aprovado");
            else if(media >= 60 && media < 70)
            System.out.println("Aluno em recuperação");
            else if(media < 60)
            System.out.println("Aluno reprovado");
            System.out.println(" Para sair deigite uma matricula negativa");

            input.close();
        }
    }

}
