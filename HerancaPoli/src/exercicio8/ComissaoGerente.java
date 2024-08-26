package exercicio8;

public class ComissaoGerente extends Comissao {

    public ComissaoGerente() {
        super(1500.00);
    }

    @Override
    public double calcularComissao() {
        return this.getAdicional();
    }

    @Override
    public String toString() {
        return "Comissão de Gerente: R$ " + String.format("%.2f", calcularComissao());
    }
}
