package provaCarlos2;

import java.time.LocalDate;
import java.time.Period;

public abstract class Funcionario implements SalarioFinal {
    protected String nome;
    protected String cpf;
    protected String rg;
    protected Endereco endereco;
    protected Genero genero;
    protected double salarioBase;
    protected EstadoCivil estadoCivil;
    protected LocalDate dataNascimento;

    public Funcionario(String nome, String cpf, String rg, Endereco endereco, Genero genero, double salarioBase, EstadoCivil estadoCivil, LocalDate dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
        this.genero = genero;
        this.salarioBase = salarioBase;
        this.estadoCivil = estadoCivil;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public int getIdade(){
        return Period.between(dataNascimento,LocalDate.now()).getYears();
         }

    @Override
    public String toString() {
        return "\nNome " + nome +
                "\nCPF " + cpf +
                "\nRG " + rg +
                 "\n"+ endereco +
                "\nGenero " + genero.getText() +
                "\nSalarioBase= " + Util.formatarDinheiro(salarioBase) +
                "\nEstadoCivil " + estadoCivil.getText() +
                "\nDataNascimento " + Util.formatarData(dataNascimento);
    }

    public void demitir(Funcionario motoboy) {
    }

    public void admitindo(Funcionario engenheiro) {
    }
}
