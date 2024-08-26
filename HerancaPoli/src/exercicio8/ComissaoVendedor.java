package exercicio8;

public class ComissaoVendedor extends Comissao {

    public ComissaoVendedor() {
        super(250.00);
    }

    @Override
    public double calcularComissao() {
        return this.getAdicional();
    }

    @Override
    public String toString() {
        return "Comissão de Vendedor: R$ " + String.format("%.2f", calcularComissao());
    }
}
