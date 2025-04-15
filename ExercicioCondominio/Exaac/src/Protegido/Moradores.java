package Protegido;

public class Moradores {
    protected String nome;
    private String cpf;
    protected String email;
    protected String telefone;
   Apartamentos apartamentos;

    public Moradores(String nome, String telefone, String email, String cpf, Apartamentos apartamentos) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
        this.apartamentos = apartamentos;
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

    public Apartamentos getApartamentos() {
        return apartamentos;
    }

}
