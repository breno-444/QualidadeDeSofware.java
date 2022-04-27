package pratica26_04_ex_02;

public class ContaCorrente {
    private int conta, agencia;
    private double saldo, depositar, sacar;

    public void setinicializarContaCorrente(int c, int ag) {
        conta = c;
        agencia = ag;
        saldo = 10;
    }

    public int getAgencia() {
        return (agencia);

    }

    public void setAgencia(int ag) {
        agencia = ag;
    }

    public int getConta() {
        return (conta);
    }

    public void setConta(int c) {

        conta = c;
    }

    public double getSaca() {
        return (sacar);
    }

    public void setSaca(double saca) {
        sacar = saca;
    }

    public void sacar(double valor) {
        saldo = saldo - valor;
    }

    public double getDepositar() {
        return (depositar);
    }

    public void setDepositar(double deposito) {
        depositar = deposito;
    }

    public void depositar(double valor) {
        saldo = saldo + valor;
    }

    public double consultarSaldo() {
        return (saldo);
    }

    public void exibe() {
        System.out.println("Agência: " + this.getAgencia());
        System.out.println("Conta: " + this.getConta());
        System.out.println("Saldo:R$ " + this.consultarSaldo());
    }
}
