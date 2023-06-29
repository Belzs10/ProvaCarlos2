package provaCarlos2;

import java.time.LocalDate;

public abstract class CargoDeConfianca extends Funcionario {
    protected Bonificacao bonificacao;

    public CargoDeConfianca(String nome, String cpf, String rg, Endereco endereco, Genero genero, double salarioBase, EstadoCivil estadoCivil, LocalDate dataNascimento, Bonificacao bonificacao) {
        super(nome, cpf, rg, endereco, genero, salarioBase, estadoCivil, dataNascimento);
        this.bonificacao = bonificacao;
    }

    public Bonificacao getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }
}

