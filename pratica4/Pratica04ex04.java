package pratica4;

import java.util.Scanner;

public class Pratica04ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double peso, altura;
        String op;
        do {

            System.out.println("Digite seu peso ");
            peso = input.nextDouble();
            System.out.println("Digite sua altura ");
            altura = input.nextDouble();

            double imc = peso / (altura * altura);

            if (imc <= 20) {
                System.out.println("Sua Classificação é Abaixo do Peso");
            } else if (imc >= 20 && imc <= 25) {
                System.out.println("Sua Classificação Está Dentro do Normal");
            }
            if (imc >= 25 && imc <= 30) {
                System.out.println("Sua Classificação é de Sobrepeso ");
            } else if (imc >= 30.0 && imc <= 40) {
                System.out.println("Sua Classificação é Obesidade ");
            }
            if (imc > 40) {
                System.out.println("Sua Classificação é Obesidade Mórbida");
            }
            System.out.println("Deseja continuar? (S)im ou (N)ão");
            op = input.next();
        } while (op.equalsIgnoreCase("S"));
        input.close();
    }
}
