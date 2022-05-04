package pratica26_04_ex_03;

public class Funcionario {
    String nome = "Breno",
            cargo = "Gerente",
            endereço = "Rua ce é loco";
    int idade = 20;
    double salario = 1000;

    public void exibe() {
        System.out.println("Nome: "+this.nome );
        System.out.println("Idade: "+this.idade);
        System.out.println("Cargo: "+ this.cargo);
        System.out.println("Sálario: R$"+this.salario);
        System.out.println("Endereço: "+ this.endereço);
    }

}
