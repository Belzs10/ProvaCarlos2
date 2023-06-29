package provaCarlos2;

import java.time.LocalDate;

public class Engenheiro extends Funcionario{
    private String crea;

    public Engenheiro(String nome, String cpf, String rg, Endereco endereco, Genero genero, double salarioBase, EstadoCivil estadoCivil, LocalDate dataNascimento, String crea) {
        super(nome, cpf, rg, endereco, genero, salarioBase, estadoCivil, dataNascimento);
        this.crea = crea;
    }

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

    @Override
    public String toString() {
        return "Engenheiro" +
                super.toString()+
                "\ncrea  " + crea ;
    }

    @Override
    public double getsalarioFinal() {
        return 0;
    }
}
