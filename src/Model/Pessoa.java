package Model;

public class Pessoa {

    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private int idade;

    public Pessoa(String nome, String cpf, String email, String telefone, int idade) {
        setNome(nome);
        setCpf(cpf);
        setEmail(email);
        setTelefone(telefone);
        setIdade(idade);
    }

    public Pessoa() {

    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome invalido, nome não pode ser vazio");
        } else
            this.nome = nome;
    }

    public void setCpf(String cpf) {
        if (cpf == null || cpf.isBlank()) {
            throw new IllegalArgumentException("CPF não pode ser vazio");
        } else
            this.cpf = cpf;
    }

    public void setEmail(String email) {
        if (!email.contains("@")) {
            throw new IllegalArgumentException("Email precisa ser valido");

        } else
            this.email = email;
    }

    public void setTelefone(String telefone) {
        if (telefone == null || telefone.isBlank()) {
            throw new IllegalArgumentException("Telefone não pode ser nulo");
        }
        this.telefone = telefone;
    }

    public void setIdade(int idade) {
        if (idade <= 0) {
            throw new IllegalArgumentException("idade deve ser maior que 0");
        } else
            this.idade = idade;
    }


    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public int getIdade() {
        return idade;
    }

    public String mostrarPessoa() {

        String texto =
                "|----- DADOS PESSOAIS -----|\n" +
                        "Nome: " + getNome() + "\n" +
                        "Email: " + getEmail() + "\n" +
                        "CPF: " + getCpf() + "\n" +
                        "Telefone: " + getTelefone() + "\n" +
                        "Idade: " + getIdade() + "\n" +
                        "|--------------------------|";

        return texto;
    }

}
