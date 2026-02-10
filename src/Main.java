import Model.Pessoa;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        SistemaCadastro sistema = new SistemaCadastro();
        Scanner scanner = new Scanner(System.in);

        int opcao = 0;

        while (opcao != 5) {

            System.out.println("\n===== SISTEMA DE CADASTRO =====");
            System.out.println("1 - Cadastrar pessoa");
            System.out.println("2 - Listar pessoas");
            System.out.println("3 - Buscar por CPF");
            System.out.println("4 - Remover pessoa");
            System.out.println("5 - Sair");
            System.out.print("Escolha: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            if (opcao == 1) {

                System.out.print("Nome: ");
                String nome = scanner.nextLine();

                System.out.print("CPF: ");
                String cpf = scanner.nextLine();

                System.out.print("Email: ");
                String email = scanner.nextLine();

                System.out.print("Telefone: ");
                String telefone = scanner.nextLine();

                System.out.print("Idade: ");
                int idade = scanner.nextInt();
                scanner.nextLine();

                try {
                    Pessoa p = new Pessoa(nome, cpf, email, telefone, idade);
                    sistema.cadastraPessoa(p);
                    System.out.println("Pessoa cadastrada com sucesso!");
                } catch (IllegalArgumentException e) {
                    System.out.println("Erro: " + e.getMessage());
                }

            }
            else if (opcao == 2) {
                sistema.listarPessoas();
            }

            else if (opcao == 3) {
                System.out.print("Digite o CPF: ");
                String cpf = scanner.nextLine();

                Pessoa encontrada = sistema.buscarPorCpf(cpf);

                if (encontrada != null) {
                    encontrada.mostrarPessoa();
                } else {
                    System.out.println("Pessoa não encontrada.");
                }
            }

            else if (opcao == 4) {
                System.out.print("CPF para remover: ");
                String cpf = scanner.nextLine();

                Pessoa removida = sistema.removePessoa(cpf);

                if (removida != null) {
                    System.out.println("Removido com sucesso!");
                } else {
                    System.out.println("CPF não encontrado.");
                }
            }

            else if (opcao == 5) {
                System.out.println("Saindo do sistema...");
            }

            else {
                System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }
}
