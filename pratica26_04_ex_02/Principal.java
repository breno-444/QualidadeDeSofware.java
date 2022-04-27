package pratica26_04_ex_02;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ContaCorrente minhaConta;

        minhaConta = new ContaCorrente();
        System.out.println("Digite o número da agência: ");
        minhaConta.setAgencia(input.nextInt());
        System.out.println("Digite o número da Conta: ");
        minhaConta.setConta(input.nextInt());
        System.out.println("Digite a quantia para depositar: ");
        minhaConta.setDepositar(input.nextDouble());

        minhaConta.exibe();

        input.close();

    }
}
