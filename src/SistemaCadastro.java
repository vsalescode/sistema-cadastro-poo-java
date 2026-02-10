import Model.Pessoa;

import java.util.ArrayList;

public class SistemaCadastro {

    private final ArrayList<Pessoa> pessoas = new ArrayList<>();


    public void cadastraPessoa(Pessoa pessoa) {
        if (buscarPorCpf(pessoa.getCpf()) != null) {
            System.out.println("CPF Já cadastrado.");
        } else
            pessoas.add(pessoa);

    }

    public void listarPessoas() {
        if (pessoas.isEmpty()) {
            System.out.println("A lista está vazia");
        } else {
            for (Pessoa p : pessoas) {
                System.out.println(p.mostrarPessoa());
            }
        }
    }

    public Pessoa buscarPorCpf(String cpf) {
        for (Pessoa p : pessoas) {
            if (p.getCpf().equals(cpf)) {
                return p;
            }

        }
        return null;

    }

    public Pessoa removePessoa(String cpf) {
        for (int contador = 0; contador < pessoas.size(); contador++) {
            Pessoa p = pessoas.get(contador);
            if (p.getCpf().equals(cpf)) {
                pessoas.remove(p);
                return p;
            }
        }
        return null;
    }




}
