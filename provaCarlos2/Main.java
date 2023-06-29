package provaCarlos2;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente("Beto","4084003993","29837911",
                new Endereco("Rua Tal","100","Casa","49873412","Rio de Janeiro",UnidadeFederativa.RIO_DE_JANEIRO),Genero.MASCULINO,2450,EstadoCivil.SEPARADO, LocalDate.of(1997, Month.APRIL,5),Bonificacao.GERENTE);
        Funcionario diretor = new Diretor("Perla","834638683","83478598",
                new Endereco("Avenida Alguma","140","Edif. Prédio, apto.10","4973874","Salvador",UnidadeFederativa.BAHIA),Genero.FEMININO,4030,EstadoCivil.CASADO,LocalDate.of(2000,Month.AUGUST,25));
        Funcionario engenheiro = new Engenheiro("Lisa","584397534","94579904",
                new Endereco("Praça","20","Casa","4923849","São Paulo",UnidadeFederativa.SAO_PAULO),Genero.FEMININO,2350,EstadoCivil.SOLTEIRO,LocalDate.of(1997,Month.SEPTEMBER,15),"IL999");
        Funcionario motoboy = new Motoboy("Clebér","84384748","487547784",
                new Endereco("Rua","20","Casa","4838342","Salvador",UnidadeFederativa.BAHIA),Genero.MASCULINO,890,EstadoCivil.SOLTEIRO,LocalDate.of(1993,Month.DECEMBER,2),"754987Ol");

        System.out.println(diretor);
        System.out.println("");
        diretor.demitir(motoboy);
        System.out.println(motoboy);
        diretor.admitindo(engenheiro);
        System.out.println(engenheiro);
        System.out.println("");
        System.out.println(gerente);

    }
}
