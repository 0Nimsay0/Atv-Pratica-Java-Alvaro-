
package atividade;
import atividade.Assalariado;
import atividade.Funcionario;
import atividade.Horista;

public class Atividade {

    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[2];
        funcionarios[0] = new Assalariado("Ana Souza", "123.456.789-00", 1500.00);
        funcionarios[1] = new Horista("João Silva", "987.654.321-00", 40, 22.00);

        for (Funcionario f : funcionarios) {
            f.exibirInfo();
            System.out.println("Tipo: " + f.getClass().getSimpleName());
            System.out.println("Pagamento: R$ " + f.calcularPagamento());
            System.out.println();
        }
    }
}
