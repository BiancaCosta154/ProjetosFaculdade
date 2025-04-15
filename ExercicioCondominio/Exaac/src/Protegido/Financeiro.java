package Protegido;

public class Financeiro {
    private Double valor;
    private String metodoPagamento;
    public Apartamentos apartamentos;
    public Moradores moradores;


    public Apartamentos getApartamentos() {
        return apartamentos;
    }

    public void setApartamentos(Apartamentos apartamentos) {
        this.apartamentos = apartamentos;
    }

    public String getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Moradores getMoradores() {
        return moradores;
    }

    public void setMoradores(Moradores moradores) {
        this.moradores = moradores;
    }
}


