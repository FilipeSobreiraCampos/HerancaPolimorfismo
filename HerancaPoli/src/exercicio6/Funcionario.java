package exercicio6;

public class Funcionario {
    private String nome;
    private String codigoFuncional;
    private double renda;

    public Funcionario(String nome, String codigoFuncional) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
        this.renda = 1000.00; // Renda básica de R$ 1000,00
    }

    public String getNome() {
        return nome;
    }

    public String getCodigoFuncional() {
        return codigoFuncional;
    }

    public double getRenda() {
        return renda;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Código Funcional: " + codigoFuncional + ", Renda: R$ " + String.format("%.2f", renda);
    }
}
