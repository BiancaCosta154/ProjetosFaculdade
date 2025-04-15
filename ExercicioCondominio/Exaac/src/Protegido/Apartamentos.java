package Protegido;

public class Apartamentos {
    protected int numeroApartamento;
    protected String andar;
    protected String bloco;
    public Moradores moradores;
    public Estacionamento estacionamento;



    public int getNumeroApartamento() {
        return numeroApartamento;
    }

    public void setNumeroApartamento(int numeroApartamento) {
        this.numeroApartamento = numeroApartamento;
    }

    public String getAndar() {
        return andar;
    }

    public void setAndar(String andar) {
        this.andar = andar;
    }

    public String getBloco() {
        return bloco;
    }

    public void setBloco(String bloco) {
        this.bloco = bloco;
    }

    public Moradores getMoradores() {
        return moradores;
    }

    public void setMoradores(Moradores moradores) {
        this.moradores = moradores;
    }


    @Override
    public String toString() {
        return "Apartamento " + numeroApartamento + ", Bloco " + bloco + ", Andar: " + andar;
    }

}
