package provaCarlos2;

import java.time.LocalDate;

public class Diretor extends Funcionario implements Contratacao {
    private final double PREMIO = 0.3;

    public Diretor(String nome, String cpf, String rg, Endereco endereco, Genero genero, double salarioBase, EstadoCivil estadoCivil, LocalDate dataNascimento) {
        super(nome, cpf, rg, endereco, genero, salarioBase, estadoCivil, dataNascimento);
    }

    public double getPREMIO() {
        return PREMIO;
    }

    @Override
    public String toString() {
        return "\nDiretor" +
                super.toString()+
                "\nSalário Final: " + getsalarioFinal() +
                "\nPREMIO= " + Util.formatarDinheiro(PREMIO*100)+"%";
    }
    @Override
    public double getsalarioFinal() {
        double salarioFinal = 0;
        salarioFinal += (super.salarioBase * this.PREMIO) + Bonificacao.DIRETOR.getValor();
        salarioFinal += super.salarioBase;
        return salarioFinal;

    }


    @Override
    public void adimitir(Funcionario funcionario) {

    }

    @Override
    public void demitir(Funcionario funcionario) {

    }
}
