package exercicio5;

public class MainExerc5 {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("João", "001");

        FuncionarioEnsinoBasico funcionario2 = new FuncionarioEnsinoBasico("Maria", "002", "Escola Primária XYZ");

        FuncionarioEnsinoMedio funcionario3 = new FuncionarioEnsinoMedio("Carlos", "003", "Escola Primária ABC", "Escola Secundária DEF");

        FuncionarioGraduacao funcionario4 = new FuncionarioGraduacao("Ana", "004", "Escola Primária LMN", "Escola Secundária GHI", "Universidade PQR");

        System.out.println(funcionario1);
        System.out.println(funcionario2);
        System.out.println(funcionario3);
        System.out.println(funcionario4);
    }
}
