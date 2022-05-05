package pratica26_04_ex_02;

public class ContaCorrente {
    private int conta, agencia;
    private double depositar, sacar;

    public void setinicializarContaCorrente(int c, int ag, double dep, double sac, int sal) {
        conta = c;
        agencia = ag;
        depositar = dep;
        sacar = sac;
       
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

    public double getDepositar() {
        return (depositar);
    }

    public void setDepositar(double sa) {
        depositar = sa;
    }

    public double getSacar() {
        return (sacar);
    }

    public void SetSacar(double sac) {
        sacar = sac;
    }
    public double sacar() {
        return depositar - sacar;
    }

    public void exibe() {
        System.out.println("Agência: " + this.getAgencia());
        System.out.println("Conta: " + this.getConta());
        System.out.println("Deposito:R$ " + this.getDepositar());
        System.out.println("Saldo:R$ " + this.sacar());
        

    }
}
