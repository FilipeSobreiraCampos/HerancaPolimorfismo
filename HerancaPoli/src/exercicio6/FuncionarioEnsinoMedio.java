package exercicio6;

import exercicio8.Comissao;

public class FuncionarioEnsinoMedio extends FuncionarioEnsinoBasico {
    private String escolaMedio;

    public FuncionarioEnsinoMedio(String nome, String codigoFuncional, String escolaBasico, String escolaMedio, Comissao comissao) {
        super(nome, codigoFuncional, escolaBasico, comissao);
        this.escolaMedio = escolaMedio;
        setRenda(getRenda() * 1.5);
    }

    public String getEscolaMedio() {
        return escolaMedio;
    }

    @Override
    public String toString() {
        return super.toString() + ", Escola Médio: " + escolaMedio;
    }
}
