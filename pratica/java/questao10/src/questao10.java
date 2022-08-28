import java.util.ArrayList;
import java.util.Scanner;

public class questao10 {

    public static void main(String args[]) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String nome;
        double salario;
        double percentual1 = 0.10;
        double percentual2 = 0.20;
        int desconto = 10;
        int i;
        System.out.println("Digite a quantidade de funcionários");
        i = scanner.nextInt();
        while (i > 0) {
            System.out.println("Digite o nome do funcionario:");
            nome = scanner.next();
            System.out.println("Digite o salário do funcionario");
            salario = scanner.nextDouble();
            Funcionario f = new Funcionario(nome, salario);
            funcionarios.add(f);
            i--;
        }
        for (Funcionario a : funcionarios) {
            System.out.println("nome do funcionario : " + a.getNome());
            System.out.println("salario: " + a.getSalario());
            if (a.getSalario() <= 1000) {
                System.out.println("bonus: " + a.getSalario() * percentual2);
                System.out.println("salario liquido: " + (a.getSalario() * percentual2 + a.getSalario()));
            } else if (a.getSalario() > 1000 && a.getSalario() <= 2000) {
                System.out.println("bonus: " + a.getSalario() * percentual1);
                System.out.println("salario liquido: " + (a.getSalario() * percentual1 + a.getSalario()));
            } else {
                double descontado = a.getSalario() / desconto;
                System.out.println("desconto: " + descontado);
                System.out.println("salario liquido: " + (a.getSalario() - descontado));
            }

        }
    }
}