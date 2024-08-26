package exercicio6;

import exercicio8.Comissao;

public class Funcionario {
    private String nome;
    private String codigoFuncional;
    private double renda;
    private Comissao comissao;

    public Funcionario(String nome, String codigoFuncional, Comissao comissao) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
        this.renda = 1000.00;
        this.comissao = comissao;
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

    public void setRenda(double renda) {
        this.renda = renda;
    }

    public double calcularRendaTotal() {
        double rendaTotal = this.renda;
        if (comissao != null) {
            rendaTotal += comissao.calcularComissao();
        }
        return rendaTotal;
    }

    @Override
    public String toString() {
        String comissaoInfo = (comissao != null) ? comissao.toString() : "Nenhuma comissão";
        return "Nome: " + nome + ", Comissão: " + comissaoInfo + ", Salário Total: R$ " + String.format("%.2f", calcularRendaTotal());
    }
}
