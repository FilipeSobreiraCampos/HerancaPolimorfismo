package exercicio9_10_11;

import exercicio6.Funcionario;
import exercicio6.FuncionarioGraduacao;
import exercicio6.FuncionarioEnsinoMedio;
import exercicio6.FuncionarioEnsinoBasico;
import exercicio8.Comissao;
import exercicio8.ComissaoGerente;
import exercicio8.ComissaoSupervisor;
import exercicio8.ComissaoVendedor;

public class MainExerc9_10_11 {
    public static void main(String[] args) {
        Comissao comissaoGerente = new ComissaoGerente();
        Comissao comissaoSupervisor = new ComissaoSupervisor();
        Comissao comissaoVendedor = new ComissaoVendedor();

        Funcionario funcionario1 = new Funcionario("João", "001", null);

        FuncionarioEnsinoBasico funcionario2 = new FuncionarioEnsinoBasico("Maria", "002", "Escola Primária XYZ", comissaoVendedor);

        FuncionarioEnsinoMedio funcionario3 = new FuncionarioEnsinoMedio("Carlos", "003", "Escola Primária ABC", "Escola Secundária DEF", comissaoSupervisor);

        FuncionarioGraduacao funcionario4 = new FuncionarioGraduacao("Ana", "004", "Escola Primária LMN", "Escola Secundária GHI", "Universidade PQR", comissaoGerente);

        System.out.println(funcionario1);
        System.out.println(funcionario2);
        System.out.println(funcionario3);
        System.out.println(funcionario4);
    }
}
