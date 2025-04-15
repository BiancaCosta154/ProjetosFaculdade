package Protegido;

public class Estacionamento {
    protected int numeroVaga;
    public Apartamentos apartamentos;


    public int getNumeroVaga() {
        return numeroVaga;
    }

    public Apartamentos getApartamentos() {
        return apartamentos;
    }

    public void setNumeroVaga(int numeroVaga) {
        this.numeroVaga = numeroVaga;
    }

    public void setApartamentos(Apartamentos apartamentos) {
        this.apartamentos = apartamentos;
    }
}


