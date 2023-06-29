package provaCarlos2;

import java.time.LocalDate;

public class Gerente extends CargoDeConfianca{
    public Gerente(String nome, String cpf, String rg, Endereco endereco, Genero genero, double salarioBase, EstadoCivil estadoCivil, LocalDate dataNascimento, Bonificacao bonificacao) {
        super(nome, cpf, rg, endereco, genero, salarioBase, estadoCivil, dataNascimento, bonificacao);
    }

    @Override
    public String toString() {
        return "Gerente " +
                super.toString()+
                "\nSalário Final: " + getsalarioFinal()+
                "\nbonificacao=" + (bonificacao.getValor() * 100)+"%";
    }


    @Override
    public double getsalarioFinal() {
        double salarioFinal;
        salarioFinal = super.salarioBase * Bonificacao.GERENTE.getValor();
        salarioFinal += super.salarioBase;
        return salarioFinal;
    }
}
