package exercicio7;
import exercicio6.Funcionario;
import exercicio6.FuncionarioEnsinoBasico;
import exercicio6.FuncionarioEnsinoMedio;
import exercicio6.FuncionarioGraduacao;

public class Empresa {
    public static void main(String[] args) {
        // Array para armazenar os 10 funcionários
        Funcionario[] funcionarios = new Funcionario[10];

        // Adiciona funcionários com diferentes níveis de escolaridade
        funcionarios[0] = new FuncionarioEnsinoBasico("João", "001", "Escola Primária A");
        funcionarios[1] = new FuncionarioEnsinoBasico("Maria", "002", "Escola Primária B");
        funcionarios[2] = new FuncionarioEnsinoBasico("Pedro", "003", "Escola Primária C");
        funcionarios[3] = new FuncionarioEnsinoBasico("Ana", "004", "Escola Primária D");

        funcionarios[4] = new FuncionarioEnsinoMedio("Carlos", "005", "Escola Primária E", "Escola Secundária A");
        funcionarios[5] = new FuncionarioEnsinoMedio("Beatriz", "006", "Escola Primária F", "Escola Secundária B");
        funcionarios[6] = new FuncionarioEnsinoMedio("Rodrigo", "007", "Escola Primária G", "Escola Secundária C");
        funcionarios[7] = new FuncionarioEnsinoMedio("Fernanda", "008", "Escola Primária H", "Escola Secundária D");

        funcionarios[8] = new FuncionarioGraduacao("Gustavo", "009", "Escola Primária I", "Escola Secundária E", "Universidade X");
        funcionarios[9] = new FuncionarioGraduacao("Camila", "010", "Escola Primária J", "Escola Secundária F", "Universidade Y");

        // Variáveis para armazenar os custos por nível de escolaridade
        double custoBasico = 0.0;
        double custoMedio = 0.0;
        double custoSuperior = 0.0;

        // Calcula os custos por nível de escolaridade
        for (Funcionario f : funcionarios) {
            if (f instanceof FuncionarioGraduacao) {
                custoSuperior += f.getRenda();
            } else if (f instanceof FuncionarioEnsinoMedio) {
                custoMedio += f.getRenda();
            } else if (f instanceof FuncionarioEnsinoBasico) {
                custoBasico += f.getRenda();
            }
        }

        // Cálculo do custo total
        double custoTotal = custoBasico + custoMedio + custoSuperior;

        // Exibe os resultados
        System.out.println("Custo total com salários: R$ " + String.format("%.2f", custoTotal));
        System.out.println("Custo com funcionários de ensino básico: R$ " + String.format("%.2f", custoBasico));
        System.out.println("Custo com funcionários de ensino médio: R$ " + String.format("%.2f", custoMedio));
        System.out.println("Custo com funcionários de nível superior: R$ " + String.format("%.2f", custoSuperior));
    }
}

