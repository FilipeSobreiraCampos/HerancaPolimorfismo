package exercicio6;

import exercicio8.Comissao;

public class FuncionarioGraduacao extends FuncionarioEnsinoMedio {
    private String universidade;

    public FuncionarioGraduacao(String nome, String codigoFuncional, String escolaBasico, String escolaMedio, String universidade, Comissao comissao) {
        super(nome, codigoFuncional, escolaBasico, escolaMedio, comissao);
        this.universidade = universidade;
        setRenda(getRenda() * 2);
    }

    public String getUniversidade() {
        return universidade;
    }

    @Override
    public String toString() {
        return super.toString() + ", Universidade: " + universidade;
    }
}
