package exercicio6;

public class FuncionarioGraduacao extends FuncionarioEnsinoMedio {
    private String universidade;

    public FuncionarioGraduacao(String nome, String codigoFuncional, String escolaBasico, String escolaMedio, String universidade) {
        super(nome, codigoFuncional, escolaBasico, escolaMedio);
        this.universidade = universidade;
        this.setRenda(getRenda() * 2); // Acrescenta 100% à renda do nível anterior
    }

    public String getUniversidade() {
        return universidade;
    }

    @Override
    public String toString() {
        return super.toString() + ", Universidade: " + universidade;
    }
}
