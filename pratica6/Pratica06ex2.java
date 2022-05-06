package pratica6;

import javax.swing.JOptionPane;

public class Pratica06ex2 {
    public static void main(String[] args) {
        String entrada, sexo;
        int salario;
        int nota, idade;
        do {
            entrada = JOptionPane.showInputDialog("Informe a nota de 0 a 10: ");
            nota = Integer.parseInt(entrada);

            entrada = JOptionPane.showInputDialog("Informe o salário: ");
            salario = Integer.parseInt(entrada);

            sexo = JOptionPane.showInputDialog("Informe o sexo m (masculino) ou f (feminino): ");

            entrada = JOptionPane.showInputDialog("Informe a idade: ");
            idade = Integer.parseInt(entrada);

            if (nota >= 0 && nota <= 10)
                if (salario > 0)
                    if (idade >= 0 && idade <= 150)
                        if ("m".equals(sexo) || "f".equals(sexo) )                       
                         JOptionPane.showMessageDialog(null, "resultados nota: " + nota + ", salário: " + salario+ ", Sexo: " + sexo + ", idade: " + idade);
                        else
                            JOptionPane.showMessageDialog(null, "ERRO!!! Informação incorreta");

                    else
                        JOptionPane.showMessageDialog(null, "ERRO!!! Informação incorreta");
                else
                    JOptionPane.showMessageDialog(null, "ERRO!!! Informação incorreta");
            else
                JOptionPane.showMessageDialog(null, "ERRO!!! Informação incorreta");

            int resp = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
            if (resp == JOptionPane.YES_OPTION)
                entrada = "sim";
            else if (resp == JOptionPane.NO_OPTION)
                entrada = "não";
        } while (entrada.equalsIgnoreCase("s") || entrada.equalsIgnoreCase("sim"));
        System.exit(0);
    }
}
