import java.util.Scanner;

public class Pratica05ex01 {
    public static void main(String[] args) {

        double notaFinal, media, maiorNota, menorNota;
        int totalFaltas, maiorNoventa, menorSetenta, contador;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota do aluno:");
        notaFinal = sc.nextDouble();
        System.out.println("Digite o total de faltas:");
        totalFaltas = sc.nextInt();
        

        System.out.println("A quantidade de alunos com nota maior a 90 é: " + maiorNoventa);
        System.out.println("A quantidade de alunos reprovados é: " + menorSetenta);
        System.out.println("A maior nota foi: " + maiorNota);
        System.out.println("A menor nota foi: " + menorNota);
        media = media / contador;
        System.out.println("A media de notas foi: " + media);
        sc.close();
    }

}
