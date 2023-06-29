package provaCarlos2;

import java.time.LocalDate;

public class Motoboy extends Funcionario {
    private String carteiraDeHabilitacao;

    public Motoboy(String nome, String cpf, String rg, Endereco endereco, Genero genero, double salarioBase, EstadoCivil estadoCivil, LocalDate dataNascimento, String carteiraDeHabilitacao) {
        super(nome, cpf, rg, endereco, genero, salarioBase, estadoCivil, dataNascimento);
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    public String getCarteiraDeHabilitacao() {
        return carteiraDeHabilitacao;
    }

    public void setCarteiraDeHabilitacao(String carteiraDeHabilitacao) {
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    @Override
    public String toString() {
        return "\nMotoboy" +
                super.toString()+
                "\ncarteiraDeHabilitacao " + carteiraDeHabilitacao;
    }

    @Override
    public double getsalarioFinal() {
        return 0;
    }
}
