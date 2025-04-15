import Protegido.Apartamentos;
import Protegido.Estacionamento;
import Protegido.Financeiro;
import Protegido.Moradores;

public class Main {
    public static void main(String[] args) {

        // Criar objetos e atribuir valores:

        // Atribuição ao objeto ap1 (primeiro apartamento)
        Apartamentos ap1 = new Apartamentos();
        ap1.setAndar("Segundo");
        ap1.setBloco("4");
        ap1.setNumeroApartamento(202);



        //Atribuição ao objeto m1 com o construtor
        Moradores m1  = new Moradores("Hugo","3182827382","Hugo@gmail.com","123123432-91", ap1 );
        ap1.setMoradores(m1);


        // Atribuição ao objeto est(estacionamento):
        Estacionamento est = new Estacionamento();
        est.setApartamentos(ap1);
        est.setNumeroVaga(202);

        // Atribuição ao objeto financeiro:
        Financeiro financeiro = new Financeiro();
        financeiro.setApartamentos(ap1);
        financeiro.setValor(100.000);
        financeiro.setMetodoPagamento("Crédito");
        financeiro.setMoradores(m1);

        // Atribuição ao objeto funcionarios:
        Funcionarios funcionarios =new Funcionarios("Leonardo","12343297682","Leo@gmail.com","32-98734561");

        // Atribuição ao objeto predio:
        Predios predio = new Predios();
        predio.setQuantidadePredios(8);
        predio.setBloco(4);

      //Print das Classes Moradores e Apartamentos
       System.out.println(
               "Sobre o apartamento:\n" + "Morador: " + m1.getNome() +"\nTelefone: " + m1.getTelefone() + "\nApartamento: " + m1.getApartamentos() + "\nEmail: "+  m1.getEmail()
       );

       //Print Classe Estacionamento:
        System.out.println("Vaga do estacionamento: " + est.getNumeroVaga());

        //Print Classe Financeiro
        System.out.println("-----------\n"+
                "Financeiro:" + "\nMétodo de pagamento: " + financeiro.getMetodoPagamento()
                + "\nValor: " + financeiro.getValor());

        //Print Classe Funcionarios:
        System.out.println("-----------\n"+
                "Funcionários: \n" + "nome: " + funcionarios.getNome()
                +"\nCpf: " + funcionarios.getCpf() + "\nEmail: " + funcionarios.getEmail() + "\nTelefone: " + funcionarios.getTelefone());

        //Print Classe Prédios:
        System.out.println("----------\n"+ "Prédios:\n" + "Quantidade de prédios: " +
                predio.getQuantidadePredios() + "\nQuantidade de blocos: " + predio.getBloco());
    }

    }

