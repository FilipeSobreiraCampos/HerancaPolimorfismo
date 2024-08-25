package exercicio5;

public class MainExerc5 {
    public static void main(String[] args) {
        // Funcionário que não estudou
        Funcionario funcionario1 = new Funcionario("João", "001");

        // Funcionário que concluiu o ensino básico
        FuncionarioEnsinoBasico funcionario2 = new FuncionarioEnsinoBasico("Maria", "002", "Escola Primária XYZ");

        // Funcionário que concluiu o ensino médio
        FuncionarioEnsinoMedio funcionario3 = new FuncionarioEnsinoMedio("Carlos", "003", "Escola Primária ABC", "Escola Secundária DEF");

        // Funcionário que concluiu a graduação
        FuncionarioGraduacao funcionario4 = new FuncionarioGraduacao("Ana", "004", "Escola Primária LMN", "Escola Secundária GHI", "Universidade PQR");

        // Exibe informações dos funcionários
        System.out.println(funcionario1);
        System.out.println(funcionario2);
        System.out.println(funcionario3);
        System.out.println(funcionario4);
    }
}
