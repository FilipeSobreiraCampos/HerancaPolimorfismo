package exercicio6;

public class FuncionarioEnsinoBasico extends Funcionario {
    private String escolaBasico;

    public FuncionarioEnsinoBasico(String nome, String codigoFuncional, String escolaBasico) {
        super(nome, codigoFuncional);
        this.escolaBasico = escolaBasico;
        this.setRenda(getRenda() * 1.1); // Acrescenta 10% à renda básica
    }

    public String getEscolaBasico() {
        return escolaBasico;
    }

    protected void setRenda(double novaRenda) {
        // Método para atualizar a renda
        try {
            var field = Funcionario.class.getDeclaredField("renda");
            field.setAccessible(true);
            field.set(this, novaRenda);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Escola Básico: " + escolaBasico;
    }
}

