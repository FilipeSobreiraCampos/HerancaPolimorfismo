package exercicio6;

public class FuncionarioEnsinoMedio extends FuncionarioEnsinoBasico {
    private String escolaMedio;

    public FuncionarioEnsinoMedio(String nome, String codigoFuncional, String escolaBasico, String escolaMedio) {
        super(nome, codigoFuncional, escolaBasico);
        this.escolaMedio = escolaMedio;
        this.setRenda(getRenda() * 1.5); // Acrescenta 50% à renda do nível anterior
    }

    public String getEscolaMedio() {
        return escolaMedio;
    }

    @Override
    public String toString() {
        return super.toString() + ", Escola Médio: " + escolaMedio;
    }
}
