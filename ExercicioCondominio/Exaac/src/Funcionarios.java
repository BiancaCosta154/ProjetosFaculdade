public class Funcionarios {

    private String nome;
    private String cpf;
    private String email;
    private String telefone;



    public Funcionarios(String nome, String cpf, String email, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }


    public String getTelefone() {
        return telefone;
    }


    public String getEmail() {
        return email;
    }


    public String getCpf() {
        return cpf;
    }


}
