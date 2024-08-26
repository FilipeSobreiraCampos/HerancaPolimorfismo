package exercicio6;

import exercicio8.Comissao;
import exercicio8.ComissaoGerente;
import exercicio8.ComissaoSupervisor;
import exercicio8.ComissaoVendedor;

public class MainExerc6 {
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
