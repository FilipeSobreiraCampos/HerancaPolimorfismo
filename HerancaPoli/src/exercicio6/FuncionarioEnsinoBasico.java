package exercicio6;

import exercicio8.Comissao;

public class FuncionarioEnsinoBasico extends Funcionario {
    private String escolaBasico;

    public FuncionarioEnsinoBasico(String nome, String codigoFuncional, String escolaBasico, Comissao comissao) {
        super(nome, codigoFuncional, comissao);
        this.escolaBasico = escolaBasico;
        setRenda(getRenda() * 1.1); // Acrescenta 10% à renda básica
    }

    public String getEscolaBasico() {
        return escolaBasico;
    }

    @Override
    public String toString() {
        return super.toString() + ", Escola Básico: " + escolaBasico;
    }
}
